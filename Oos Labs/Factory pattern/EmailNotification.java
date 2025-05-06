public class EmailNotification implements Notification {

    @Override
    public void notifyUser(String email) {
        System.out.println("Notification::Email: " + email + "\n");
    }
}