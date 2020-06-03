package ru.synergyitacademy;

import java.math.BigDecimal;

public class AccountCalculator {

    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber("545645645645");
        account.setClientName("Ivanov Vitalii");
        account.setBalance(new BigDecimal("100000.25"));
        account.setCurrency(Currency.RUBLES);

        System.out.printf("Current balance %s : %s\n", account.getAccountNumber(), account.formattedBalance());
        account.deposit(new BigDecimal("99999.75"));
        System.out.printf("Current balance %s : %s\n", account.getAccountNumber(), account.formattedBalance());
        account.withdraw(new BigDecimal("50000"));
        System.out.printf("Current balance %s : %s\n", account.getAccountNumber(), account.formattedBalance());

        Account anotherAccount = new Account("4564561515", "Petrov Petr");
        System.out.printf("Current balance %s : %s\n", anotherAccount.getAccountNumber(), anotherAccount.formattedBalance());
        anotherAccount.withdraw(new BigDecimal("50000"));
        System.out.printf("Current balance %s : %s\n", anotherAccount.getAccountNumber(), anotherAccount.formattedBalance());
        anotherAccount.deposit(new BigDecimal("99999.75"));
        System.out.printf("Current balance %s : %s\n", anotherAccount.getAccountNumber(), anotherAccount.formattedBalance());
    }
}
