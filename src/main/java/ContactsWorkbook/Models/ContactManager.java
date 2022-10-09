package ContactsWorkbook.Models;

import java.util.ArrayList;

public class ContactManager {
    ArrayList<Contact> contacts;

    public ContactManager () {
        this.contacts = new ArrayList<>();
    }

    public Contact getContact (int index) {
        return new Contact(contacts.get(index));
    }

    public void setContact (Contact contact, int index) {
        contacts.set(index, new Contact(contact));
    }

    public void addContact (Contact contact) {
        contacts.add(new Contact(contact));
    }

    public void removeContact (String name) {
        if (contacts.isEmpty()) {
            throw new IllegalStateException("Can not remove an empty array");
        }
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                contacts.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < contacts.size(); i++) {
           temp += contacts.get(i).toString();
           temp += "\n\n";
        }
        return temp;
    }
}
