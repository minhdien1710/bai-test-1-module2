package bai1;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        int choice;
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
                    productManager.printList();
                    break;
                case 2:
                    productManager.add();
                    break;

                case 3:
                    productManager.edit();
                    break;
                case 4:
                    productManager.delete();
                    break;
                case 5:
                   productManager.search();
                   break;
            }
        }
        while (choice != 0);


    }
}
