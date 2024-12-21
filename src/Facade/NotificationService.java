package Facade;

public class NotificationService {
    public void sendNotification(String to, String message) {
        System.out.println("Sending notification to " + to + ": " + message);
    }
}
