import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter notification type (EMAIL/SMS/PUSH): ");
        String input = sc.nextLine();

        Notification notification = NotificationFactory.createNotification(input);

        if (notification != null) {
            notification.notifyUser();
        } else {
            System.out.println("Invalid notification type");
        }
    }
}
