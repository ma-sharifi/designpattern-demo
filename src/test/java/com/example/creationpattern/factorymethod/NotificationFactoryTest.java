package com.example.creationpattern.factorymethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Mahdi Sharifi
 * @since 9/22/22
 */
class NotificationFactoryTest {

    @Test
    void main() {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification smsNotification = notificationFactory.createNotification("SMS");
        Notification emailNotification = notificationFactory.createNotification("EMAIL");
        Notification pushNotification = notificationFactory.createNotification("PUSH");

        Assertions.assertEquals("Sending an SMS notification",smsNotification.notifyUser());
        Assertions.assertEquals("Sending an Email notification",emailNotification.notifyUser());
        Assertions.assertEquals("Sending an Push notification",pushNotification.notifyUser());
    }
}