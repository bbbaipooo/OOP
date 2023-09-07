import java.util.*;

public class Account {
    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated;

    // Constructor
    Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Method
    public int getId() {
        return this.id;
    }

    public void setId(int id) {// not return use voin method : use only in this class : just only change value
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / (12 * 100);
    }

    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate();
    }

    public void withdraw(int value) { // use void : only receive value and change balance in this class
        this.balance -= value;
    }

    public void deposit(int value) {
        this.balance += value;
    }

}
