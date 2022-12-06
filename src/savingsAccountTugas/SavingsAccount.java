package savingsAccountTugas;

public class SavingsAccount implements Runnable{
    private float balance;

    public void withdraw(float anAmount)
    {
        if (anAmount<0.0)
            throw new IllegalArgumentException("Withdraw amount negative");

        if (anAmount<=balance) {
            synchronized(this){
                balance = balance - anAmount;
            }
        }
    }

    public void deposit(float anAmount)
    {
        if (anAmount<0.0)
            throw new IllegalArgumentException("Deposit amount negative");

        synchronized(this)
        {
            balance = balance + anAmount;
        }
    }

    @Override
    public void run(){
        withdraw(999.99f);
    }

    public float getBalance(){
        return this.balance;
    }
}
