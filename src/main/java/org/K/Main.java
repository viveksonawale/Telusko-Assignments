package org.K;

import java.util.Scanner;

abstract class BankAccount {
    protected int balance = 0;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    abstract void deposit(int amount);

    abstract void withDraw(int amount);

    void displayBalance() {
        System.out.println("Your Balance is: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int initialBalance) {
        super(initialBalance);
    }

    @Override
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Savings Account.");
        displayBalance();
    }

    @Override
    void withDraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in Savings Account.");
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account.");
        }
        displayBalance();
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(int initialBalance) {
        super(initialBalance);
    }

    @Override
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into Checking Account.");
        displayBalance();
    }

    @Override
    void withDraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in Checking Account.");
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Checking Account.");
        }
        displayBalance();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount savingsAccount = new SavingsAccount(10000);
        CheckingAccount checkingAccount = new CheckingAccount(5000);

        System.out.println("Welcome to the Bank!");

        while (true) {
            System.out.println("\nChoose Account:");
            System.out.println("1. Savings Account");
            System.out.println("2. Checking Account");
            System.out.println("3. Exit");
            int accountChoice = scanner.nextInt();

            if (accountChoice == 3) {
                System.out.println("Thank you for using the Bank. Goodbye!");
                break;
            }

            BankAccount currentAccount;
            if (accountChoice == 1) {
                currentAccount = savingsAccount;
                System.out.println("You are in Savings Account.");
            } else if (accountChoice == 2) {
                currentAccount = checkingAccount;
                System.out.println("You are in Checking Account.");
            } else {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    currentAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    currentAccount.withDraw(withdrawAmount);
                    break;
                case 3:
                    currentAccount.displayBalance();
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
        }

        scanner.close();
    }
}
