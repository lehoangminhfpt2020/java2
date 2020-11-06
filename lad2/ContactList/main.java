package java2.lad2.ContactList;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ContactList contact = new ContactList();
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Starting phone . . . ");
        System.out.println("\nAvailable action:");
        System.out.println("press");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to print contacts");
        System.out.println("2 - to add a new contact");
        System.out.println("3 - to update an existing contact");
        System.out.println("4 - to remove an existing contact");
        System.out.println("5 - query if an existing contact exists");
        System.out.println("6 - to print a list of available actions");
        System.out.println("Choose your action:\n");
        do{
            System.out.println("Enter action: (6 to show available actions)");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Shutting down");
                    break;
                case 1:
                    contact.printList();
                    break;
                case 2:
                    contact.addContact();
                    break;
                case 3:
                    contact.updateContact();
                    break;
                case 4:
                    contact.removeContact();
                    break;
                case 5:
                    contact.searchContact();
                    break;
                case 6:
                    System.out.println("\nAvailable action:");
                    System.out.println("press");
                    System.out.println("0 - to shutdown");
                    System.out.println("1 - to print contacts");
                    System.out.println("2 - to add a new contact");
                    System.out.println("3 - to update an existing contact");
                    System.out.println("4 - to remove an existing contact");
                    System.out.println("5 - query if an existing contact exists");
                    System.out.println("6 - to print a list of available actions");
                    System.out.println("Choose your action:\n");
                    System.out.println("Enter action: (6 to show available actions)");
                    choice = input.nextInt();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0) ;
    }
}
