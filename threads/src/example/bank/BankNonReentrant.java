package example.bank;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.StampedLock;

public class BankNonReentrant {
    private final Lock lock = new StampedLock().asWriteLock();
    double balance;

    public BankNonReentrant(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {

        lock.lock();
        try {
            deposit(-amount);
        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}
