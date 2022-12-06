package savingsAccountTugas;

public class Driver {
    public static void main(String[] args)
    {
        SavingsAccount account = new SavingsAccount();

        // Membuat dua thread
        Thread thread1 = new Thread(() -> account.deposit(30.0f));
        Thread thread2 = new Thread(() -> account.withdraw(20.0f));

        thread1.start();
        //System.out.println("balance titik a: " + account.getBalance());
        thread2.start();
        //System.out.println("balance titik b: " + account.getBalance());
        //System.out.println("balance titik c: " + account.getBalance());
        /* Sinkronisasi menggunakan join()
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // handle the exception
            throw new RuntimeException("Fail to sync");
        }

         */

        // Print balance akhir
        System.out.println("Final balance: " + account.getBalance());
        System.out.println("Final balance: " + account.getBalance());
    }
}
