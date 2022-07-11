import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice ;
        do {
            System.out.println("---Chuong trinh quan ly san pham---");
            System.out.println("Chon chuc nang theo so de tiep tuc");
            System.out.println("1.Xem danh sach");
            System.out.println("2.Them moi");
            System.out.println("3.Cap nhat");
            System.out.println("4.Xoa");
            System.out.println("5.Sap xep");
            System.out.println("6.Tim san pham co gia dat nhat");
            System.out.println("7.Doc tu file");
            System.out.println("8.Ghi vao file");
            System.out.println("9.Thoat");
            choice = choice(1,9,scanner);
            switch (choice){
                case 1:
                    productManager.displayProductList();
                    break;
                case 2:
                   productManager.AddANewProduct(scanner);
                    break;
                case 3:
                    productManager.updateProduct(scanner);
                    break;
                case 4:
                    productManager.deleteProduct(scanner);
                    break;
                case 5:
                    productManager.arrangeProductList();
                    break;
                case 6:
                    productManager.searchProductExpensive();
                    break;
                case 7:
                    productManager.readFile();
                    break;

                case 8:
                    productManager.writeFile();
                    break;
            }
        }while (choice !=9);
    }
    public static int choice(int min, int max, Scanner scanner) {
        int choice = 1;
        boolean flag = false;
        while (!flag) {
            try {
                flag = true;
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < min || choice > max) {
                    flag = false;
                    System.out.println("Nhap so tu " + min + " - " + max + "!");
                }

            } catch (Exception e) {
                // System.out.println("                                                                 Nhap so tu " + min + " - " + max + "!");
                flag = false;
            }

        }
        return choice;
    }


}
