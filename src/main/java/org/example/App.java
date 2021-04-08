package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Phone one = new SamsungGalaxyS6(10,"red","plastic","131321314124141");
        Contact first = new Contact("12","0232131313","Razvan","Meisaros");
        one.addContact(first);
        one.sendMessage(first,"Test");
        one.listMessages(first);

    }
}
