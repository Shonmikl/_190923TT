package org.example.TESTING._2024_02_08.mock.taski2;

public class SimpleNotificationService implements NotificationService {

    @Override
    public void sendPaymentNotification(String message) {
        System.out.println("Notification sent: " + message);
    }
}