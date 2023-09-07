package Program1;

import java.util.Scanner;

public class Pro1_64011041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Checking Accouny");
        System.out.print("Overdraft Limit: ");
        double limit = input.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setLimit(limit);
        checkingAccount.setBalance(5000);
        System.out.println("Balance is "+checkingAccount.getBalance());
        System.out.print("Withdraw: ");
        double value = input.nextDouble();
        checkingAccount.withdraw(value);
        System.out.println("Balance is " + checkingAccount.getBalance());
        System.out.println("This account was created at " + checkingAccount.getDateCreated());
    }
}