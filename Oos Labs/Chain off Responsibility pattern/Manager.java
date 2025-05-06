// Concrete Handler: Manager
class Manager extends Approver {
    @Override
    public void authorize(double amount) {
        if (amount > 1000000) {
            System.out.println("Manager authorized the withdrawal.");
        } else {
            System.out.println("Manager: No further authorization needed.");
        }
    }
}
