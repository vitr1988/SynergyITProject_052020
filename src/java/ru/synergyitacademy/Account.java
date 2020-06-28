package ru.synergyitacademy;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Properties;

public class Account {

    private static final NumberFormat decimalFormat = DecimalFormat.getInstance();

    private String accountNumber;
    private String clientName;
    private BigDecimal balance = BigDecimal.ZERO;
    private Currency currency = Currency.RUBLES;
    private Integer expirationPeriod = null;
    private boolean valid = false; // default for boolean and 0 for other one;
    private char value = '\u0000'; // default as 0

    public static String bankName;

    static {
        Properties properties = new Properties();
        int a = 0;
        try {
            properties.load(Account.class.getResourceAsStream("/global.properties"));
            bankName = (String) properties.get("bankName");
        }
        catch (IOException e) {
            e.printStackTrace();
            a = -1;
        }
        catch (IllegalArgumentException | NullPointerException e) {
            e.printStackTrace();
            a = -2;
        }
        int i = a + 1;
    }

    {
        // Логика инициализации для каждого создаваемого объекта
    }

    Account(){
        this(null, null);
    }

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
//        money = new BigDecimal("789"); // will not show at AccountCalculator
        if (balance.compareTo(money) >= 0) { // balance is more or equal money
            balance = balance.subtract(money);
        }
        else {
            System.out.println("Not enough money");
        }
    }

    public String changeOwner(String newClient) {
        this.clientName = newClient;
        newClient = "Vasya Pupkin";
        return newClient;
    }



    protected String formattedBalance() {
        return decimalFormat.format(balance);
    }

    String formattedBalance(String format) { // overloding
        return new DecimalFormat(format).format(balance);
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

    public static Account createAccountAndSetCurrency(Account account, Currency currency) {
        account.setCurrency(currency);
        return account;
    }

    public Account refresh() {
        Account newAccount = new Account();
        newAccount.setBalance(this.getBalance());
        newAccount.setCurrency(this.getCurrency());
        newAccount.setClientName(this.getClientName());
        newAccount.setAccountNumber("4654113241534");
        return newAccount;
    }

    public static Account refresh(Account account) {
        return account.refresh();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", clientName='" + clientName + '\'' +
                ", balance=" + balance +
                ", currency=" + currency +
                ", expirationPeriod=" + expirationPeriod +
                ", valid=" + valid +
                ", value=" + value +
                '}';
    }
}
