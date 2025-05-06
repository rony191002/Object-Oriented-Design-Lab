public class PushNotification implements Notification{
    
    @Override
    public void notifyUser(String push) {
        System.out.println("Notification::push: " + push + "\n");
    }
}
