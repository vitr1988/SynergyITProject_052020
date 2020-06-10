package ru.synergyitacademy;

import java.math.BigDecimal;

public class AccountRunner {

    public static void main(String[] args) {
        Account account = new PersonalAccount();
        account.setCurrency(Currency.RUBLES);
        account.setAccountNumber("5415315");
        account.setClientName("Vitalii Ivanov");
        account.setBalance(new BigDecimal("100000"));

        Account newAccount = account.refresh();
        System.out.println(newAccount);
    }

}
