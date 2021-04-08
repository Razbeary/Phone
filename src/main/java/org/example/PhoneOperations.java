package org.example;

import java.util.ArrayList;

public interface PhoneOperations {
    public void phoneCall(Contact contact);
    public void sendMessage(Contact contact, String content);
    public void addContact(Contact contact);
    public ArrayList<Contact> viewHistory();
    public ArrayList<Contact> listContacts();
    public void listMessages(Contact contact);
}
