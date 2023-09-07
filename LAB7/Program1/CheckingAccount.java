package Program1;

public class CheckingAccount extends Account {
    private double limit;

    public CheckingAccount() {
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void withdraw(double value) {
        if (this.getBalance() - value >= -1 * this.limit) {
            this.setBalance(this.getBalance() - value);
        } else {
            System.out.println("Cannot withdraw from Account");
        }
    }
}
