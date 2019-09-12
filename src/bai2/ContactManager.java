package bai2;

import java.util.LinkedList;
import java.util.Scanner;

public class ContactManager {
    Scanner scanner = new Scanner(System.in);
    LinkedList<Contact> contacts = new LinkedList<>();

    public void printList() {
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }

    }

    public void addContact() {
        System.out.println("nhap ho");
        String firstName = scanner.next();
        System.out.println("Nhap ten:");
        String lastName = scanner.next();
        System.out.println("nhap sdt");
        String phoneNumber = scanner.next();
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        contacts.add(contact);
    }

    public void editByLastName() {
        System.out.println("nhap ten muon sua");
        String nameToEdit = scanner.next();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getLastName().equals(nameToEdit)) {
                System.out.println("nhap ho moi");
                String newFirstName = scanner.next();
                System.out.println("nhap ten moi");
                String newLastName = scanner.next();
                System.out.println("nhap so dien thoai moi");
                String newNumber = scanner.next();
                Contact editedContact = new Contact(newFirstName, newLastName, newNumber);
                contacts.set(i, editedContact);
            }
        }
    }

    public void removeByNumber() {
        System.out.println("xoa so dien thoai");
        System.out.println("nhap so dien thoai can xoa");
        String numberToDelete = scanner.next();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(numberToDelete)) {
                contacts.remove(i);
                break;
            } else {
                System.out.println("khong tim thay");
            }
        }
    }

    public void searchByFirstName() {
        LinkedList<Contact> result = new LinkedList<>();
        System.out.println("tim kiem theo ho");
        System.out.println("nhap vao ho can tim: ");
        String searchFirstName = scanner.next();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getFirstName().equals(searchFirstName)) {
                result.add(contacts.get(i));
            } else {
                System.out.println("khong tim thay");
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }
    }

    public void searchByLastName() {
        LinkedList<Contact> result = new LinkedList<>();
        System.out.println("tim kiem theo ten");
        System.out.println("nhap vao ten can tim: ");
        String searchLastName = scanner.next();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getLastName().equals(searchLastName)) {
                result.add(contacts.get(i));
            } else {
                System.out.println("khong tim thay");
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }
    }

    public void searchByNumber() {
        LinkedList<Contact> result = new LinkedList<>();
        System.out.println("tim kiem theo so dien thoai");
        System.out.println("nhap vao so can tim: ");
        String searchNumber = scanner.next();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(searchNumber)) {
                result.add(contacts.get(i));
            } else {
                System.out.println("khong tim thay");
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).toString());
        }
    }
}



