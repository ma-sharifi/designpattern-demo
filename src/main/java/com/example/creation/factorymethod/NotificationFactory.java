package com.example.creation.factorymethod;

/**
 * @author Mahdi Sharifi
 * @since 9/22/22
 */
//https://refactoring.guru/design-patterns/factory-method
//Factory Method: It is a creational design pattern that talks about the creation of an object.
//The factory design pattern says that define an interface ( A java interface or an abstract class) for creating object and let the subclasses decide which class to instantiate. 
//Factory Method: is a creational design pattern which solves the problem of creating product objects without specifying their concrete classes.
/**
 Pros:
 1- You avoid tight coupling between the creator and the concrete products.
 2- Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
 3- Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.

 Cons:
 1- The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern.
    The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.
 **/
public class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        return switch (channel) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown channel " + channel);
        };
    }
}
