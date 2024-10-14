package task1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.time.format.FormatStyle;

public class BankAccount {

    private String name;
    private String number;
    private float balance;
    private ArrayList<String> transactions;
    private boolean closed;
    private LocalDateTime createdDate;
    private LocalDateTime closingDate;
    private final ZoneId ZONE_ID = ZoneId.of("Asia/Singapore");



    public BankAccount(String name, float balance) {
        this.name = name;
        this.balance = balance;
        
        // Set random account number, lets do 8 digits
        Random rand = new Random();
        this.number = "";
        for (int i = 0; i < 8; i++) {
            this.number += rand.nextInt(10);
        }

        this.transactions = new ArrayList<>();

        this.closed = false;

        this.createdDate = LocalDateTime.now(ZONE_ID);
    }

    public BankAccount(String name) {
        this(name, 0);
    }

    public void deposit(float amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Please provide a positive deposit amount.");
        }

        else if (this.closed) {
            throw new IllegalArgumentException("Unable to deposit as account is closed.");
        }

        else {
            // Add deposit amount into the balance
            this.balance += amount;

            this.transactions.add(
                ">>> deposit $%.2f at <%s>".formatted(
                    amount, 
                    LocalDateTime.now(ZONE_ID)
                        .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT))
                )
            );

        }
    }

    public void withdraw(float amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Please provide a positive deposit amount");
        }

        else if (this.closed) {
            throw new IllegalArgumentException("Unable to deposit as account is closed.");
        }

        else if (amount > this.balance) {
            throw new IllegalArgumentException("Not enough balance in account.");
        }

        else {
            this.balance -= amount;

            this.transactions.add(
                ">>> withdraw $%.2f at <%s>".formatted(
                    amount, 
                    LocalDateTime.now(ZONE_ID)
                        .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT))
                )
            );
        }
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDateTime closingDate) {
        this.closingDate = closingDate;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

}

