package notification;

import sender.MessageSender;

import java.sql.SQLOutput;

public class ReminderNotification extends Notification {
    public ReminderNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("--- Friendly Reminder ---");
        sender.sendMessage(message);
    }
}
