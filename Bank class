class Account {
    public String customerName;
    public String accountNumber;
    protected double balance; 

    public Account(String customerName, String accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount: " + amount);
    }

    public void displayBalance() {
        System.out.println("Balance amount: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount: " + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal!");
        }
    }

    protected double getBalance() { 
        return balance;
    }
}

class SavAcct extends Account {
    private double interestRate;

    public SavAcct(String customerName, String accountNumber, double interestRate) {
        super(customerName, accountNumber);
        this.interestRate = interestRate;
    }

    public void computeAndDepositInterest() {
        double currentBalance = getBalance();
        double interest = currentBalance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest deposited: " + interest);
    }

    public String toString()
    {   return "Customer Name: "+customerName+"\nAccount Number: "+accountNumber;    }
}

class CurAcct extends Account {
    private double minimumBalance;
    private double serviceCharge;

    public CurAcct(String customerName, String accountNumber, double minimumBalance, double serviceCharge) {
        super(customerName, accountNumber);
        this.minimumBalance = minimumBalance;
        this.serviceCharge = serviceCharge;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount < minimumBalance) {
            System.out.println("Service charge imposed: " + serviceCharge);
            deposit(-serviceCharge); 
            System.out.println("Insufficient balance.");
        } else {
            super.withdraw(amount);
        }
    }
    public String toString()
    {   return "Customer Name: "+customerName+"\nAccount Number: "+accountNumber;    }
}

public class Bank {
    public static void main(String[] args) {
        SavAcct savingsAccount = new SavAcct("Alice", "S12345", 5.0);
        System.out.println("Customer details:\n"+savingsAccount.toString());
        System.out.println("\nTransaction details:");
        savingsAccount.deposit(1000);
        savingsAccount.computeAndDepositInterest();
        savingsAccount.displayBalance();
        savingsAccount.withdraw(500);
        savingsAccount.displayBalance();
        
        System.out.println();

        CurAcct currentAccount = new CurAcct("Bob", "C12345", 1000, 50);
        System.out.println("Customer details:\n"+currentAccount.toString());
        System.out.println("\nTransaction details:");
        currentAccount.deposit(2000);
        currentAccount.displayBalance();
        currentAccount.withdraw(1900);
        currentAccount.displayBalance();
        currentAccount.withdraw(200); 
        currentAccount.displayBalance();
    }
}
