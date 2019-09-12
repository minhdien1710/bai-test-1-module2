package bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Show List Contact");
            System.out.println("2.Add new contact");
            System.out.println("3.Edit contact");
            System.out.println("4.Delete contact by number");
            System.out.println("5.Search contact");
            System.out.println("   5.1.By First Name");
            System.out.println("   5.2.By Last Name");
            System.out.println("   5.3.By Number");
            System.out.println("0.exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    contactManager.printList();
                    break;
                case 2:
                    contactManager.addContact();
                    break;
                case 3:
                    contactManager.editByLastName();
                    break;
                case 4:
                    contactManager.removeByNumber();
                    break;
                case 5:
                    int option;
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            contactManager.searchByFirstName();
                            break;
                        case 2:
                            contactManager.searchByLastName();
                        case 3:
                            contactManager.searchByNumber();
                        default:
                            System.exit(0);
                    }

            }
        }while (choice!=0);
    }
}
