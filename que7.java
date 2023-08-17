class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

class TransactionThread extends Thread {
    private BankAccount account;
    private boolean isDeposit;
    private double amount;

    public TransactionThread(BankAccount account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class que7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread depositThread1 = new TransactionThread(account, true, 200);
        Thread depositThread2 = new TransactionThread(account, true, 300);
        Thread withdrawalThread1 = new TransactionThread(account, false, 150);
        Thread withdrawalThread2 = new TransactionThread(account, false, 400);

        depositThread1.start();
        depositThread2.start();
        withdrawalThread1.start();
        withdrawalThread2.start();
    }
}
