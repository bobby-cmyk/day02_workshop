package task2;

import task1.BankAccount;

public class FixedDepositAccount extends BankAccount {

    private float interest;
    private int duration;
    private boolean interestChanged;
    private boolean durationChanged;

    public FixedDepositAccount(String name, float balance, float interest, int duration) {
        super(name, balance);
        this.interest = interest;
        this.duration = duration;
        this.interestChanged = false;
        this.durationChanged = false;
    }

    public FixedDepositAccount(String name, float balance, float interest) {
        this(name, balance, interest, 6);
    }

    public FixedDepositAccount(String name, float balance) {
        this(name, balance, 3, 6);
    }

    @Override
    public void setBalance(float amount) {
        System.out.println("Balance cannot be changed!");
    }

    @Override
    public void withdraw(float amount) {
        // Does nothing
        System.out.println("Fixed deposit balance cannot be withdrawn");
    }

    @Override
    public void deposit(float amount) {
        //Does nothing
        System.out.println("Cannot deposit amount into fixed deposit");
    }

    @Override
    public float getBalance() {
        return this.interest + super.getBalance();
    }

    public void setInterest(float interest) {
        if (interestChanged) {
            throw new IllegalArgumentException("Action denied: Interest has already been changed once!");
        }

        else {
            this.interest = interest;
            this.interestChanged = true;
        }
    }

    public void setDuration (int duration) {
        if (durationChanged) {
            throw new IllegalArgumentException("Action denied: Duration has already been changed once.");
        }

        else {
            this.duration = duration;
            this.durationChanged = true;
        }
    }
    
    public int getDuration() {
        return duration;
    }

    public float getInterest() {
        return interest;
    }

    public boolean isInterestChanged() {
        return interestChanged;
    }

    public boolean isDurationChanged() {
        return durationChanged;
    }
}