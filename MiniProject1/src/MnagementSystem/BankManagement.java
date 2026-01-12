package MnagementSystem;

import java.io.*;
import java.util.Scanner;


abstract class BankAccount {
    protected int accNo;
    protected String name;
    protected double balance;

    BankAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    void showDetails() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {

    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Savings Account");
    }

    
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn from Savings Account");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}


class CurrentAccount extends BankAccount {

    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

   
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Current Account");
    }

   
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn from Current Account");
    }
}

// FILE HANDLING CLASS 
class FileUtil {
    static void save(BankAccount acc) {
        try (FileWriter fw = new FileWriter("bank.txt", true)) {
            fw.write(acc.accNo + "," + acc.name + "," + acc.balance + "\n");
        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
}

 MAIN CLASS
public class BankManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account;   

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Choose: ");
        int choice = sc.nextInt();

        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();

        if (choice == 1)
            account = new SavingsAccount(accNo, name, bal);
        else
            account = new CurrentAccount(accNo, name, bal);

        FileUtil.save(account);

        while (true) {
            System.out.println("\n1.Deposit  2.Withdraw  3.Balance  4.Details  5.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Amount: ");
                    account.deposit(sc.nextDouble());
                }
                case 2 -> {
                    System.out.print("Amount: ");
                    account.withdraw(sc.nextDouble());
                }
                case 3 -> account.showBalance();
                case 4 -> account.showDetails();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}

