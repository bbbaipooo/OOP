package Program1;

public class SavingAccount extends Account {
    public SavingAccount() {
    }

    @Override
    public void withdraw(double value) {
        if (this.getBalance() - value >= 0) {
            this.setBalance(this.getBalance() - value);
        } else {
            System.out.println("Cannot withdraw from Account");
        }
    }
}
