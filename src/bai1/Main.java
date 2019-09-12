package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product(0, "Haohao", 3000, "my tom");
        Product product2 = new Product(1, "thanglong", 10000, "thuoc la");
        products.add(product1);
        products.add(product2);
        do {
            System.out.println("Menu");
            System.out.println("1.Show List");
            System.out.println("2.Add new product");
            System.out.println("3.Edit product");
            System.out.println("4.Delete product");
            System.out.println("5.Search product");
            System.out.println("0.exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i< products.size(); i++){
                        System.out.println(products.get(i).toString());
                    }
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("sua thong tin san pham");
                    System.out.println("nhap id san pham muon sua");
                    int index = scanner.nextInt();
                    for (int i = 0; i<products.size();i++){
                        if(products.get(i).getId() == index){
                            System.out.println("nhap ten moi cho san pham");
                            String newName = scanner.next();
                            System.out.println("nhap gia moi");
                            float newPrice = scanner.nextFloat();
                            System.out.println("nhpa mo ta moi: ");
                            String newDescription = scanner.next();
                            Product editedProduct = new Product(index,newName, newPrice, newDescription);
                            products.set(index, editedProduct);

                        }
                    }
                    break;
                case 4:
                    System.out.println("xoa san pham");
                    System.out.println("nhap id san pham muon xoa");
                    int indexToDelete = scanner.nextInt();
                    for (int i = 0; i < products.size(); i++)
                        if(products.get(i).getId() == indexToDelete){
                            products.remove(i);
                        }else {
                            System.out.println("ko tim thay");
                        }
                    break;
                case 5:
                    System.out.println("tim kiem");
                    System.out.println("nhap ten san pham: ");
                    String searchName = scanner.next();
                    System.out.println(searchName);
                    for (int i = 0; i< products.size(); i++){
                        if(products.get(i).getName().equals(searchName)){
                            System.out.println(products.get(i).toString());
                            break;
                        }else {
                            System.out.println("khong tim thay");
                        }
                        break;
                    }
            }
        }
            while (choice!=0);


    }
}
