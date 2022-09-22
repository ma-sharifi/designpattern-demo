package com.example.creationpattern.factorymethod;

/**
 * @author Mahdi Sharifi
 * @since 9/22/22
 */

public class EmailNotification implements Notification {
    @Override
    public String notifyUser() {
        return "Sending an Email notification";
    }
}
