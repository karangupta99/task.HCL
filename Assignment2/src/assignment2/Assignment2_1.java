package assignment2;

// Interface for banking operations
interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double getBalance();
}

// Interface for customer operations
interface CustomerOperations {
    void showCustomerDetails();
    void updateAddress(String newAddress);
}

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount class implementing multiple interfaces
class BankAccount implements BankOperations, CustomerOperations {

    private String name;
    private String accountNo;
    private String address;
    private double balance;

    // Constructor
    BankAccount(String name, String accountNo, String address, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.address = address;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid deposit amount");
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient Balance");
        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void showCustomerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accountNo);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }

    @Override
    public void updateAddress(String newAddress) {
        address = newAddress;
        System.out.println("Address Updated Successfully");
    }
}

// Main Class
public class Assignment2_1 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "Karan Gupta",
                "ACC101",
                "Bhopal",
                5000
        );

        try {
            account.showCustomerDetails();
            account.deposit(2000);
            account.withdraw(3000);
            account.updateAddress("Indore");

            System.out.println("Final Balance: " + account.getBalance());

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
