package example.bank;

public class Bank {
    double balance;
    Object object = new Object();

    public Bank(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        synchronized (object) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        synchronized (object) {
            return balance;
        }
    }
}
