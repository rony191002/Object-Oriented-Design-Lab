class Cashier extends Approver {
    @Override
    public void authorize(double amount) {
        if (amount < 10000) {
            System.out.println("Cashier authorized the withdrawal.");
        } else if (nextApprover != null) {
            System.out.println("Cashier forwards the request.");
            nextApprover.authorize(amount);
        }
    }
}
