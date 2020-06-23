package contactsApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ContactManager {
    public static void main(String[] args) throws IOException {
        List<Contacts> newList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Path myContactList = Paths.get("src", "contactsApp", "contacts");

        Contacts person1 = new Contacts("Betty", "Boop", 2345678);
        Contacts person2 = new Contacts("Bugs", "Bunny", 1231234);
        Contacts person3 = new Contacts("Jane", "Doe", 3214321);
//        newList.add(person1);
//        newList.add(person2);
//        newList.add(person3);

//        Contacts.addNewContactToList(newList, "Fred", "Flintstone", 7778907);

        System.out.println("Welcome to the Contact Manager App!");
//        Contacts.addNewContactToList(newList, "craig", "williams", 2344321);
//        Contacts.updateContactsToList(newList, myContactList);
//        for(Contacts person : newList) {
//            System.out.println(person.getFirstName());
//        }
        String yesNo = "";
        do {
            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "Enter an option (1, 2, 3, 4 or 5):");
            int userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                    Contacts.updateContactsToList(newList, myContactList);
                    Contacts.listOfContacts(newList);
                    System.out.println("Would you like to continue? y/n");
                    yesNo = sc.next();
                    if (yesNo.equalsIgnoreCase("n")) {
                        System.out.println("Goodbye!");
                    }
                    break;
                case 2:
                    System.out.println("Enter first name:");
                    String firstNameInput = sc.next();
                    System.out.println("Enter last name:");
                    String lastNameInput = sc.next();
                    System.out.println("Enter phone number");
                    int phone = sc.nextInt();
                    Contacts.addNewContactToList(newList, firstNameInput, lastNameInput, phone);
                    Contacts.updateContactsToList(newList, myContactList);
                    System.out.println("Contacts has been updated. Would you like to continue? y/n");
                    yesNo = sc.next();
                    break;
            }
//            Contacts.updateContactsToList(newList, myContactList);
        } while (yesNo.equalsIgnoreCase("y"));
//        Contacts.updateContactsToList(newList, myContactList);
//        for(Contacts person : newList) {
//            System.out.println(person.getFirstName());
//        }
    }

//    public static void viewAllContacts(Path file) throws IOException {
//        List<String> newList = Files.readAllLines(file);
//        System.out.println("Name  |  Phone Number\n---------------------");
//        for(String contact : newList) {
//            System.out.println(contact.getFirstName() + " " + contact.getLastName() + " | " + contact.getNumber() + " |");
//        }
//    }

//    public static void contactManagerApp(List<Contacts> array, Path file, Scanner scanner) throws IOException {
//        String yesNo = "";
//        do {
//            System.out.println("1. View contacts.\n" +
//                    "2. Add a new contact.\n" +
//                    "3. Search a contact by name.\n" +
//                    "4. Delete an existing contact.\n" +
//                    "5. Exit.\n" +
//                    "Enter an option (1, 2, 3, 4 or 5):");
//            int userInput = scanner.nextInt();
//            switch (userInput) {
//                case 1:
//                    Contacts.listOfContacts(array);
//                    System.out.println("Would you like to continue? y/n");
//                    yesNo = scanner.next();
//                    if (yesNo.equalsIgnoreCase("n")) {
//                        System.out.println("Goodbye!");
//                    }
//                    break;
//                case 2:
//                    System.out.println("Enter first name:");
//                    String firstNameInput = scanner.next();
//                    System.out.println("Enter last name:");
//                    String lastNameInput = scanner.next();
//                    System.out.println("Enter phone number");
//                    int phone = scanner.nextInt();
//                    Contacts.addNewContactToList(array, firstNameInput, lastNameInput, phone);
////                    Contacts.updateContactsToList(array, file);
//                    System.out.println("Contacts has been updated. Would you like to continue? y/n");
//                    yesNo = scanner.next();
//                    break;
//            }
//        } while (yesNo.equalsIgnoreCase("y"));
//    }

}
