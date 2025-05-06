// Concrete Handler: Senior Officer
class SeniorOfficer extends Approver {
    @Override
    public void authorize(double amount) {
        if (amount >= 10000 && amount <= 1000000) {
            System.out.println("Senior Officer authorized the withdrawal.");
        } else if (nextApprover != null) {
            System.out.println("Senior Officer forwards the request.");
            nextApprover.authorize(amount);
        }
    }
}