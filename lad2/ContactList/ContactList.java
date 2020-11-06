package java2.lad2.ContactList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ContactList {
    List<Contact> Contacts = new ArrayList<>();
    Contact danhba = new Contact();
    Scanner input = new Scanner(System.in);

    public void addContact(){
        System.out.println("You wanna input new contact!");
        System.out.println("Enter Name");
        danhba.setName(input.nextLine());
        System.out.println("Enter Phone");
        danhba.setPhone(input.nextLine());
        if (Contacts.contains(danhba)){
            System.out.println(danhba + " added already!");
        } else {
            Contacts.add(danhba);
            System.out.println("New contact added: " + danhba.toString());
        }
    }

    public void updateContact(){
        int check=0;
        String check1 = "";
        boolean check2;
        Contact update = new Contact();
        System.out.println("Update by Name enter: 1");
        System.out.println("Update by Phone enter: 2");
        check = input.nextInt();
        input.nextLine();
        if (check == 1){
            System.out.println("enter the name you wanna update");
            check1 = input.nextLine();
            if (Contacts.contains(check1)== true){
                System.out.println("in this contact have " + check1 );
                System.out.println("Enter new contact name: ");
                update.setName(input.nextLine());
                input.nextLine();
                System.out.println("Enter new contact Phone: ");
                update.setPhone(input.nextLine());
                input.nextLine();
                Contacts.set(Contacts.indexOf(check1),update);
                System.out.println("Done Update");
            }
            else {
                System.out.println("Contact don;t have this name!! \n Try again");
            }

        }
        else{
            System.out.println("enter the phone you wanna update");
            check1 = input.nextLine();
            if (Contacts.contains(check1)== true){
                System.out.println("in this contact have " + check1 );
                System.out.println("Enter new contact name: ");
                update.setName(input.nextLine());
                input.nextLine();
                System.out.println("Enter new contact Phone: ");
                update.setPhone(input.nextLine());
                Contacts.set(Contacts.indexOf(check1),update);
                System.out.println("Done Update");
            }
            else {
                System.out.println("Contact don;t have this phone!! \n Try again");
            }
        }
    }

    public void removeContact() {
        System.out.println("Enter existing contact name:");
        String contactName = input.nextLine();
        for (int i = 0; i < Contacts.size(); i++) {
            if (Contacts.get(i).getName().equals(contactName)){
                Contacts.remove(i);
                System.out.println(contactName + ", was deleted");
                System.out.println("Done deleted");
            }
        }
    }

    public void searchContact() {
        int check = 0;
        String check1 = "";
        boolean check2;
        Contact update = new Contact();
        System.out.println("Update by Name enter: 1");
        System.out.println("Update by Phone enter: 2");
        check = input.nextInt();
        input.nextLine();
        if (check == 1) {
            System.out.println("Enter existing contact name:");
            String contactName = input.nextLine();
            for (int i = 0; i < Contacts.size(); i++) {
                if (Contacts.get(i).getName().equals(contactName))
                    System.out.println("Name: " + Contacts.get(i).getName() + " phone number is: " + Contacts.get(i).getPhone());
                else {
                    System.out.println("Contact don;t have this name!! \n Try again");
                }
            }
        } else {
            System.out.println("enter the phone you wanna update");
            System.out.println("Enter existing contact name:");
            String contactPhone = input.nextLine();
            for (int i = 0; i < Contacts.size(); i++) {
                if (Contacts.get(i).getPhone().equals(contactPhone)) {
                    System.out.println("Name: " + Contacts.get(i).getName() + " phone number is: " + Contacts.get(i).getPhone());
                } else {
                    System.out.println("Contact don;t have this phone!! \n Try again");
                }
            }
        }
    }

    public void printList() {
        System.out.println("Contact List: ");
        if (Contacts.size() > 0) {
            Iterator<Contact> contact = Contacts.iterator();
            while (contact.hasNext()) {
                Contact contact1 = contact.next();
                System.out.println(contact1);
            }
        }
    }

}
