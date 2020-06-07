package ru.synergyitacademy;

import java.math.BigDecimal;

/**
 * Счета для юридических лиц
 */
public class BusinessAccount extends Account {

    private boolean changeBalance = true;

    public BusinessAccount(){
        super(null, "");
    }

    public void blockBalance() {
        this.changeBalance = false;
    }

    public void unblockBalance() {
        this.changeBalance = true;
    }

    @Override
    public void withdraw(BigDecimal money) {
        if (changeBalance) {
            super.withdraw(money);
        } else {
            System.out.println("Money is reserved and you can't perform this action");
        }
    }

    @Override
    public void deposit(BigDecimal money) {
        if (changeBalance) {
            super.deposit(money);
        } else {
            System.out.println("Money is reserved and you can't perform this action");
        }
    }
}
