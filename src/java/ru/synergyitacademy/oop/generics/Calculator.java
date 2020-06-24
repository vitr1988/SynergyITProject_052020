package ru.synergyitacademy.oop.generics;

public class Calculator<T extends Number> {

    public double summa(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public double minus(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public int divided(T a, T b) {
        try {
            return a.intValue() / b.intValue();
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
