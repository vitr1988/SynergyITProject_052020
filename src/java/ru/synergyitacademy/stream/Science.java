package ru.synergyitacademy.stream;

public enum Science {
    MATHEMATICS(true), PHYSICS(true), BIOLOGY(false), CHEMISTRY(true);

    private boolean natural;

    Science(boolean natural) {
        this.natural = natural;
    }

    public boolean isNatural() {
        return natural;
    }

    public boolean getNatural(String str) {
        return natural;
    }
}
