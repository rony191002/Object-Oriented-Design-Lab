// Abstract Handler
abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    public abstract void authorize(double amount);
}
