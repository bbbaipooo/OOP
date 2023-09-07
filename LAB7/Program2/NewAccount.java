package Program2;

import java.util.*;

public class NewAccount {
    // Attributes
    private String name;
    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated;
    ArrayList<Transaction> transactions = new ArrayList<Transaction>(); //Array list flexible index

    // Constructor
    NewAccount(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Method
    public String getName() {
        return this.name;
    }

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

    public void withdraw(double value) { // use void : only receive value and change balance in this class
        this.balance -= value;
        transactions.add(new Transaction('w', value, this.balance, "NULL"));
    }

    public void deposit(double value) {
        this.balance += value;
        transactions.add(new Transaction('d', value, this.balance, "NULL"));
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }
}
