package contactsApp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Contacts {
    private String firstName;
    private String lastName;
    private long number;

    public Contacts(String firstName, String lastName, long number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public static void listOfContacts (List<Contacts> array) {
        System.out.println("Name  |  Phone Number\n---------------------");
        for (Contacts contact : array) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName() + " | " + contact.getNumber() + " |");
        }
    }

    public static void addNewContactToList(List<Contacts> array, String firstName, String lastName, long phoneNumber) {
        Contacts newPerson = new Contacts(firstName, lastName, phoneNumber);
        array.add(newPerson);
    }

    public static String searchByName(List<Contacts> array, String name) {
        String output = "";
        for (Contacts contact : array) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                output += contact.getFirstName() + " " + contact.getLastName() + " " + contact.getNumber();
            }
        }
        return output;
    }

    public static void addContactsToList(List<Contacts> array, Path file) throws IOException {
        List<String> contacts = new ArrayList<>();
        for (Contacts person : array) {
            contacts.add(person.getFirstName() + " " + person.getLastName() + " " + person.getNumber());
        }
        Files.write(file, contacts);
    }
}
