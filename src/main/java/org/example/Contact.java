package org.example;

import java.util.ArrayList;

public class Contact {
    private String id;
    private String number;
    private String firstName;
    private String lastName;
    private ArrayList<String> messages;

    public Contact(String id, String number, String firstName, String lastName) {
        this.id = id;
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.messages = new ArrayList<>();

    }

    public String getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public void addMessage(String message) {
        messages.add(message);
    }
}
