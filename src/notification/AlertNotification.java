package notification;

import sender.MessageSender;

public class AlertNotification extends Notification {
    public AlertNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("!!! WARNING !!!");
        sender.sendMessage(message);
    }

}
