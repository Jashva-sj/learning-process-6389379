public class NotificationService {

    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notifyUser(String userName) {
        String message = "Hello " + userName + ", You have a new notification.";
        messageSender.sendMessage(message);
    }
}
