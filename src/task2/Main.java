package task2;

public class Main {
    
    public static void main(String[] args) {
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("Aiken", 1000);
        
        fixedDepositAccount.deposit(100);

        fixedDepositAccount.withdraw(100);

        fixedDepositAccount.setBalance(100);

        System.out.println(fixedDepositAccount.getBalance());

        fixedDepositAccount.setInterest(10);

        System.out.println(fixedDepositAccount.getBalance());

        fixedDepositAccount.setInterest(100);
    }
}
