package task1;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Aiken", 100);
        
        System.out.printf("Name: %s\n", bankAccount.getName());
        System.out.printf("Balance: %s\n",bankAccount.getBalance());
        System.out.printf("Account Number: %s\n",bankAccount.getNumber());
        System.out.printf("Account Created Date: %s\n",bankAccount.getCreatedDate());
        
        bankAccount.withdraw(100);
        bankAccount.deposit(200);
        bankAccount.deposit(300);

        bankAccount.deposit(200);
        bankAccount.deposit(300);
        bankAccount.withdraw(500);

        ArrayList<String> transactions = bankAccount.getTransactions();
        
        for (String transaction : transactions) {
            System.out.println(transaction);
        
        
        }


        System.out.printf("Balance: %s\n",bankAccount.getBalance());
    }   
}
