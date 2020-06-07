package ru.synergyitacademy;

import java.math.BigDecimal;

public class PersonalAccount extends Account {

    public void bancruncy() {
        setBalance(BigDecimal.ZERO);
    }

    @Override
    void withdraw(BigDecimal money) {
        System.out.println("Be careful, you withdraw money");
        super.withdraw(money);
    }
}

