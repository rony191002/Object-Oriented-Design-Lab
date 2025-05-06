// Main class to test the chain
public class WithdrawalAuthorization {
    public static void main(String[] args) {
        // Create handlers
        Approver manager = new Manager();
        Approver seniorOfficer = new SeniorOfficer();
        Approver cashier = new Cashier();

        // Set the chain of responsibility
        cashier.setNextApprover(seniorOfficer);
        seniorOfficer.setNextApprover(manager);

        // Test with different withdrawal amounts
        double[] testAmounts = {5000, 50000, 2000000};

        for (double amount : testAmounts) {
            System.out.println("\nProcessing withdrawal of Tk " + amount + ":");
            cashier.authorize(amount);
        }
    }
}
