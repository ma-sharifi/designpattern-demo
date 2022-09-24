package com.example.creation.factorymethod;

import lombok.extern.java.Log;

/**
 * @author Mahdi Sharifi
 * @since 9/22/22
 */
@Log
public class SMSNotification implements Notification {

    @Override
    public String notifyUser() {
        return "Sending an SMS notification";
    }
}