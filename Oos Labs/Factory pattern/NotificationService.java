public class NotificationService {
    
    public static void main(String[] args) {

        NotificationFactory singleNotificationFactory  = NotificationFactory.getInstance();

        Notification sms = singleNotificationFactory.createNotification("sms");
        sms.notifyUser("new SMS notification");

        Notification email = singleNotificationFactory.createNotification("email");
        email.notifyUser("new email notification");

        Notification push = singleNotificationFactory.createNotification("push");
        push.notifyUser("new push notfication");
    }
}
