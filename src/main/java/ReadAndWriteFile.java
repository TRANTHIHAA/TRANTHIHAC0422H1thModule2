import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public void writeFileProduct(List<Product> productList) {
        try {
            File file = new File("FileProductList.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            // AccountPartner accountTitle = new AccountPartner("C1","C2","C3","C4","C5");
            // accountPartnerList.add(0,accountTitle);
            for (Product product : productList) {
                bufferedWriter.write(product.getId() + "," + product.getName() + "," + product.getPrime() + "," + product.getAmount() + "," + product.getDescribe()  +"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("loi5");
        }
    }

    public  ArrayList<Product> readFileProductList() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            File file = new File("FileProductList.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                String[] strings = value.split(",");
                Product product = new Product(strings[0], strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3]), strings[4]);
                products.add(product);
            }
//            if (!accounts.isEmpty()) {
//                accounts.remove(0);
//            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("loi4");
        }
        return products;
    }

}
