package LooseCoupling;

import java.time.LocalDateTime;
import java.util.UUID;

public class NotificationService {

    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public String sendNotification(String message, String user) {

        // 1. Validate user
        if (!isValidUser(user)) {
            return "User is invalid. Notification aborted.";
        }

        // 2. Add tracking ID
        String trackingId = UUID.randomUUID().toString();

        // 3. Format the message
        String formattedMessage = formatMessage(message, user, trackingId);

        // 4. Log it (simulation)
        logNotification(user, formattedMessage, trackingId);

        // 5. Attempt sending (retry simulation)
        String result = attemptToSend(formattedMessage);

        // 6. Return result
        return result + " | Tracking ID: " + trackingId;
    }

    private boolean isValidUser(String user) {
        return user != null && !user.isBlank();
    }

    private String formatMessage(String message, String user, String trackingId) {
        return "Hello " + user + ", "
                + message + "\n"
                + "Sent at: " + LocalDateTime.now() + "\n"
                + "Track ID: " + trackingId;
    }

    private void logNotification(String user, String message, String trackingId) {
        System.out.println("LOG: Saving notification to DB...");
        System.out.println("User: " + user);
        System.out.println("Message: " + message);
        System.out.println("Tracking ID: " + trackingId);
    }

    private String attemptToSend(String formattedMessage) {
        try {
            return messageSender.sendMessage();
        } catch (Exception ex) {
            return "Failed to send notification.";
        }
    }
}
