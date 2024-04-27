package example.bank;

public class BankDemo {
    public static void main(String[] args) throws InterruptedException {
        var account = new Bank(1000);

        new Thread(() -> {
//            synchronized (account) {
                while (true) {
                    System.out.println(account.getBalance());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }
                }
//            }
        }).start();
        Thread.sleep(3000);
        account.deposit(10_000_000);

        Thread.sleep(3000);
        account.deposit(10_000_000);
    }
}
