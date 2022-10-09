package ContactsWorkbook;

import ContactsWorkbook.Models.Contact;
import ContactsWorkbook.Models.ContactManager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static final String RELATIVE_PATH = "/Users/nsovi/Desktop/JavaProjects/UdemyCorse/src/main/java/ContactsWorkbook/contacts.txt";
    static ContactManager manager = new ContactManager();

    public static void main(String[] args) {
        try {
            loadContacts(RELATIVE_PATH);
            System.out.println("CONTACTS LOADED\n\n");
            System.out.println(manager);
            manageContacts();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static public void loadContacts (String file) throws FileNotFoundException {
        Scanner scanFile = new Scanner(new FileReader(file));
        while (scanFile.hasNextLine()) {
            try {
                Contact contact = new Contact(scanFile.next(), scanFile.next(), scanFile.next());
                manager.addContact(contact);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
        scanFile.close();
    }

    public static void manageContacts () {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Would you like to \n\ta) add another contact \n\tb) remove a contact \n\tc) exit");
            String response = scan.nextLine();
            if (response.equalsIgnoreCase("a")) {
                System.out.print("\tName: ");
                String name = scan.nextLine();
                System.out.print("\tPhone Number: ");
                String number = scan.nextLine();
                System.out.print("\tBirth Date: ");
                String birthDate = scan.nextLine();
                if (name.isBlank() || number.isBlank() || number.length() < 5 || birthDate.isBlank()) {
                    System.out.println("\nThe input you have provided is not valid. Registration failed!");
                }else {
                    try {
                        manager.addContact(new Contact(name, number, birthDate));
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
                    }
                    finally {
                        System.out.println("\\n\\nUPDATED CONTACTS\\n\\n" + manager);
                    }
                }
            } else if (response.equalsIgnoreCase("b")) {
                System.out.println("\nWho would you like to remove?");
                manager.removeContact(scan.nextLine());
                System.out.println("\\n\\nUPDATED CONTACTS\\n\\n" + manager);
            }else {
                break;
            }
        }
        scan.close();
    }
}
