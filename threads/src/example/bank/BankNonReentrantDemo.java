package example.bank;

public class BankNonReentrantDemo {
    public static void main(String[] args) throws InterruptedException {
        var account = new BankNonReentrant(1000);

        new Thread(() -> {
            synchronized (account) {
                while (true) {
                    System.out.println(account.getBalance());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
            }
        }).start();
        Thread.sleep(3000);
        account.deposit(10_000_000);

        Thread.sleep(3000);
        // thread gets stuck here as we already have a lock over withdraw, and when withdraw calls deposit, it does not get the lock
        // hence, non-entrant
        account.withdraw(10_000_00);
    }
}
