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
        BigDecimal cash = new BigDecimal("50000");
        account.withdraw(cash);
        System.out.printf("Current balance %s : %s\n", account.getAccountNumber(), account.formattedBalance());

        Account anotherAccount = new Account("4564561515", "Petrov Petr");
//        anotherAccount.bankName = "Sberbank";
        System.out.printf("Current balance %s : %s\n", anotherAccount.getAccountNumber(), anotherAccount.formattedBalance());
        anotherAccount.withdraw(new BigDecimal("50000"));
        System.out.printf("Current balance %s : %s\n", anotherAccount.getAccountNumber(), anotherAccount.formattedBalance());
        anotherAccount.deposit(new BigDecimal("99999.75"));
        System.out.printf("Current balance %s : %s\n", anotherAccount.getAccountNumber(), anotherAccount.formattedBalance());
        System.out.printf("Formatted current balance %s : %s\n", anotherAccount.getAccountNumber(), anotherAccount.formattedBalance("#0.0"));

        System.out.println("Bank name of account : " + Account.bankName);

        String newClient = "Ivanov Ivan";
        System.out.println("Desirable client name : " + newClient);
        anotherAccount.changeOwner(newClient);
        System.out.println("Actual client name : " + newClient);

        Account currentAccountWithCurrency =
                Account.createAccountAndSetCurrency(account, Currency.DOLLARS);


    }
}
