package Oopmodeling.addressbook;

import java.util.Scanner;

public class contactApp {

   final static AddressBook addressBook = new AddressBook();
   final static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
        byte option = 4;

        while(true) {
            showMenu();

            option = scanner.nextByte();
            System.out.println(option);

            if(option == 4) {
                System.out.println("Exit from the app");
                break;
            }
            else if(option == 1) {
                addContact();
            }
            else if (option == 2) {
                showContacts();
            }
            else if (option == 3) {
                removeContact();
            }
            
            }


    }

    private static void removeContact() {
    }

    private static void showContacts() {
    }

    private static void addContact() {
        System.out.println("---add contact to your address book------");
        //1 the user introduce the number, name and other informationabout the contact

       scanner.nextLine();
       System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print(name);

        System.out.print("Enter phone number: ");
        String phone = scanner.next();

        //2 create an object of "contact" encapsulating all the data passedin the first step
        Contact newContact = new Contact(name, phone, email);

        // add the new object to the contact array
        addressBook.add(newContact);

        System.out.println("Contact added!");

        // 3) REMOVE CONTACT
        private static void removeContact() {
            System.out.println("---remove contact to your address book------");
            //1 the user introduce the name of the contact that he wants to eliminate
            System.out.print("Enter name: ");

            string
            String name = scanner.next();
            System.out.print(name);
    }

    private static void showMenu() {
        System.out.println("1, Add contact");
        System.out.println("2, show contact");
        System.out.println("3, remove contact");
        System.out.println("4, Exit");
    }
}
