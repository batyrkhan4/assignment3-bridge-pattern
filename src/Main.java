import notification.AlertNotification;
import notification.Notification;
import notification.ReminderNotification;
import sender.EmailSender;
import sender.MessageSender;
import sender.SmsSender;

public class Main {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SmsSender();

        Notification alert = new AlertNotification(emailSender);

        System.out.println("=== Original submission ===");
        alert.notifyUser("Critical error: server unavailable!");

        //demonstration
        System.out.println("\n=== Switching to backup SMS channel... ===");
        alert.setSender(smsSender); // the magic of Bridge
        alert.notifyUser("Critical error: server unavailable!");

        System.out.println("\n-----------------------------------\n");

        Notification reminder = new ReminderNotification(emailSender);
        System.out.println("=== Daily Schedule ===");
        reminder.notifyUser("Team meeting in 15 minutes.");
    }
}