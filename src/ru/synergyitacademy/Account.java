package ru.synergyitacademy;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Account {

    private static final NumberFormat decimalFormat = DecimalFormat.getInstance();

    private String accountNumber;
    private String clientName;
    private BigDecimal balance = BigDecimal.ZERO;
    private Currency currency = Currency.RUBLES;
    private Integer expirationPeriod = null;
    private boolean valid = false; // default for boolean and 0 for other one;
    private char value = '\u0000'; // default as 0

    Account(){}

    Account(String accountNumber, String clientName) {
        this.accountNumber = accountNumber;
        this.clientName = clientName;
    }

    public Account(String accountNumber, String clientName, BigDecimal balance, Currency currency) {
        this.accountNumber = accountNumber;
        this.clientName = clientName;
        this.balance = balance;
        this.currency = currency;
    }

    void deposit(BigDecimal money) {
        balance = balance.add(money);
    }

    void withdraw(BigDecimal money) {
        if (balance.compareTo(money) >= 0) { // balance is more or equal money
            balance = balance.subtract(money);
        }
        else {
            System.out.println("Not enough money");
        }
    }

    String formattedBalance() {
        return decimalFormat.format(balance);
    }

    void setBalance(BigDecimal money) {
        this.balance = money;
    }

    BigDecimal getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
