package org.example;

import java.util.ArrayList;

public abstract class Phone implements PhoneOperations {
    private  int batteryLife;
    private String color;
    private String material;
    private String imei;
    private int currentBatteryLife;
    private ArrayList<Contact> list;
    private ArrayList<Contact> callHistory;
//    private ArrayList<Contact> messageHistory;

    public Phone(int batteryLife, String color, String material, String imei) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.imei = imei;
        this.currentBatteryLife = batteryLife;
        this.list = new ArrayList<>();
    }


    @Override
    public void phoneCall(Contact contact) {
        if (currentBatteryLife >= 2) {
            currentBatteryLife = currentBatteryLife - 2;
            callHistory.add(contact);
        } else {
            System.out.println("Phone is dead sau ceva");
        }

    }

    @Override
    public void sendMessage(Contact contact, String content) {
        if (content.length() > 500) {
            System.out.println("Message too long");
        } else {
            if (currentBatteryLife >= 1) {
                currentBatteryLife--;
                contact.addMessage(content);
                //
            } else {
                System.out.println("Phone is dead sau ceva");
            }
        }
    }

    @Override
    public void addContact(Contact contact) {
        list.add(contact);
    }

    @Override
    public ArrayList<Contact> viewHistory() {
    return callHistory;
    }

    @Override
    public ArrayList<Contact> listContacts() {
        return list;
    }

    @Override
    public void listMessages(Contact contact) {
        System.out.println(contact.getMessages());
    }
}


