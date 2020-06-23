package contactsApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContactManager {
    public static void main(String[] args) throws IOException {
        List<Contacts> newList = new ArrayList<>();

        Contacts person1 = new Contacts("Betty", "Boop", 2345678);
        Contacts person2 = new Contacts("Bugs", "Bunny", 1231234);
        Contacts person3 = new Contacts("Jane", "Doe", 3214321);
        newList.add(person1);
        newList.add(person2);
        newList.add(person3);
        Path myContactList = Paths.get("src","contactsApp", "contacts");

//        listOfContacts(newList);
        for (Contacts person : newList) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getNumber());
        }

        addContactsToList(newList, myContactList);

    }
    public static void listOfContacts (List<Contacts> array) {
        System.out.println("Name  |  Phone Number\n---------------------");
        for (Contacts contact : array) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName() + " | " + contact.getNumber() + " |");
        }
    }

    public static void addContactsToList(List<Contacts> array, Path file) throws IOException {
        List<String> contacts = new ArrayList<>();
        for (Contacts person : array) {
            contacts.add(person.getFirstName() + " " + person.getLastName() + " " + person.getNumber());
        }
        Files.write(file, contacts);
    }
}
