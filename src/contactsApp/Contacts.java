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
//    public static List<Contacts> newList = new ArrayList<>();

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

    public static void addNewContactToList(List<Contacts> array, String firstName, String lastName, long phoneNumber) {
        Contacts newPerson = new Contacts(firstName, lastName, phoneNumber);
        array.add(newPerson);
    }

    public static String searchByName(List<Contacts> array, String name) {
        String output = "";
        for (Contacts contact : array) {
            if (contact.getFirstName().equalsIgnoreCase(name) || contact.getLastName().equalsIgnoreCase(name)) {
                output += contact.getFirstName() + " " + contact.getLastName() + " " + contact.getNumber();
            }
        }
        return output;
    }

//  This method writes to contacts.txt
    public static void updateContactsToList(List<Contacts> array, Path file) throws IOException {
        List<String> contacts = new ArrayList<>();
        for (Contacts person : array) {
            contacts.add(person.getFirstName() + " " + person.getLastName() + " " + person.getNumber());
        }
        Files.write(file, contacts);
    }

    public static void removeContactFromList(List<Contacts> array, String name) {
        for (Contacts contact : array) {
            if (contact.getFirstName().equalsIgnoreCase(name) || contact.getLastName().equalsIgnoreCase(name)) {
                array.remove(contact);
            }
        }
    }
}
