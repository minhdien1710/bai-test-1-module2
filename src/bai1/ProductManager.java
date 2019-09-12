package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();

    public void printList(){
        for (int i = 0; i< products.size(); i++){
            System.out.println(products.get(i).toString());
        }
    }
    public void add(){
        System.out.println("them moi san pham");
        System.out.println("nhap id san pham: ");
        int id = scanner.nextInt();
        System.out.println("nhap ten san pham: ");
        String name = scanner.next();
        System.out.println("nhap gia san pham: ");
        float price = scanner.nextFloat();
        System.out.println("nhap mo ta: ");
        String description = scanner.next();
        Product newProduct = new Product(id, name, price, description);
        products.add(id-1, newProduct);
    }
    public void edit(){
        System.out.println("sua thong tin san pham");
        System.out.println("nhap id san pham muon sua");
        int idToEdit = scanner.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == idToEdit) {
                System.out.println("nhap ten moi cho san pham");
                String newName = scanner.next();
                System.out.println("nhap gia moi");
                float newPrice = scanner.nextFloat();
                System.out.println("nhap mo ta moi: ");
                String newDescription = scanner.next();
                Product editedProduct = new Product(idToEdit, newName, newPrice, newDescription);
                products.set(idToEdit-1, editedProduct);

            }
        }
    }
    public void delete(){
        System.out.println("xoa san pham");
        System.out.println("nhap id san pham muon xoa");
        int indexToDelete = scanner.nextInt();
        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getId() == indexToDelete) {
                products.remove(i);
            } else {
                System.out.println("ko tim thay");
            }
    }
    public void search(){
        System.out.println("tim kiem");
        System.out.println("nhap ten san pham: ");
        String searchName = scanner.next();
        System.out.println(searchName);
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(searchName)) {
                System.out.println(products.get(i).toString());
                break;
            } else {
                System.out.println("khong tim thay");
            }
            break;
        }
    }
}
