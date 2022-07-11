import java.util.*;

public class ProductManager {
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    public void displayProductList(){
        ArrayList<Product> products = readAndWriteFile.readFileProductList();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void AddANewProduct(Scanner scanner){
        ArrayList<Product> products = readAndWriteFile.readFileProductList();
        System.out.println("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        if(!checkId(id)){
            System.out.println("Nhap ten san pham: ");
            String name = scanner.nextLine();
            System.out.println("Nhap gia: ");
            double prime = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap so luong:");
            int amount = Integer.parseInt(scanner.nextLine());
            System.out.println("Mo ta:");
            String describe = scanner.nextLine();
            Product product = new Product(id,name,prime,amount,describe);
            products.add(product);
            readAndWriteFile.writeFileProduct(products);
        }else {
            System.out.println("sp da ton tai!");
        }


    }

    public boolean checkId(String id){
        ArrayList<Product> products = readAndWriteFile.readFileProductList();
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    public void updateProduct(Scanner scanner){
        ArrayList<Product> products = readAndWriteFile.readFileProductList();
        System.out.println("Nhap ma san pham:");
        String id = scanner.nextLine();
        if (checkId(id)){
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId().equals(id)){
                    System.out.println("nhap ma thay the:");
                    String newId = scanner.nextLine();
                    if (!newId.equals("")){
                        products.get(i).setId(newId);
                    }
                    System.out.println("Nhap ten thay the:");
                    String newName = scanner.nextLine();
                    if (!newName.equals("")){
                        products.get(i).setName(newName);
                    }
                    System.out.println("Nhap gia thay the: ");
                    double newPrime = Double.parseDouble(scanner.nextLine());
                    if (newPrime != 0 ){
                        products.get(i).setPrime(newPrime);
                    }
                    System.out.println("Nhap so luong thay the ");
                    int newAmount = Integer.parseInt(scanner.nextLine());
                    if (newAmount != 0 ){
                        products.get(i).setAmount(newAmount);
                    }
                    System.out.println("Nhap mo ta thay the: ");
                    String newDescribe = scanner.nextLine();
                    if (!newDescribe.equals("")){
                        products.get(i).setDescribe(newDescribe);
                    }


                }
            }
        } else {
            System.out.println("Ko co san pham nay!");
        }
        readAndWriteFile.writeFileProduct(products);

    }

    public void deleteProduct(Scanner scanner){
        ArrayList<Product> products = readAndWriteFile.readFileProductList();
        System.out.println("Nhap ma san pham:");
        String id = scanner.nextLine();
        if (checkId(id)){
            for (Product product : products) {
                if (product.getId().equals(id)){
                    products.remove(product);
                }

            }
        }else {
            System.out.println(" ko co sp nay!");
        }
        readAndWriteFile.writeFileProduct(products);

    }

    public List<Product> arrangeProductList(){
        ArrayList<Product> products = readAndWriteFile.readFileProductList();
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrime() - o2.getPrime());
            }
        });
        for (Product product : products) {
            System.out.println(product);
        }
        return products;
    }

    public void searchProductExpensive(){
        ArrayList<Product> products = readAndWriteFile.readFileProductList();
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrime() - o2.getPrime());
            }
        });
        System.out.println(products.get(products.size()-1));
    }

    public void readFile(){
        ArrayList<Product> products = readAndWriteFile.readFileProductList();
        for (Product product : products) {
            System.out.println(product);
        }

    }
    public void writeFile(){


    }




}
