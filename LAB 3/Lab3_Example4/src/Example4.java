import java.util.Scanner;

public class Example4 {
    static Scanner input = new Scanner(System.in);

    class Bankaccount {
        String bankaccount;
        double balance;

        public Bankaccount(String bankaccount, double initial_balance) {
            this.bankaccount = bankaccount;
            this.balance = initial_balance;
        }

        public double get() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount < 0) {
                System.out.println("The money cannot be deposited because the amount is negative!");
            } else {
                balance += amount;
                System.out.println("Amount deposited successfully. New balance: " + balance);
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("The amount to withdraw should be positive!");
            } else if (amount > balance) {
                System.out.println("Insufficient balance! Withdrawal failed.");
            } else {
                balance -= amount;
                System.out.println("Amount withdrawn successfully. New balance: " + balance);
            }
        }
    }

    public static void main(String[] args) {
        String account;
        System.out.println("Enter the Account Number :  ");
        account = input.next();
        double balance;
        System.out.println("Enter the Balance :  ");
        balance = input.nextDouble();
        Example4 example4 = new Example4();
        Bankaccount bankaccount1 = example4.new Bankaccount(account, balance);
        System.out.println("Total Balance : " + bankaccount1.get());

        double amount;
        System.out.println("Enter the Amount you want to deposit : ");
        amount = input.nextDouble();
        bankaccount1.deposit(amount);

        double amount1;
        System.out.println("Enter the Amount you want to withdraw : ");
        amount1 = input.nextDouble();
        bankaccount1.withdraw(amount1);
    }
}
