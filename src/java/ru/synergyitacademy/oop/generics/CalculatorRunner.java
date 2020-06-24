package ru.synergyitacademy.oop.generics;

public class CalculatorRunner {

    public static void main(String[] args) {
        Calculator<Integer> integerCalculator = new Calculator<>();
        System.out.println(integerCalculator.summa(1, 2));

        Calculator<Double> doubleCalculator = new Calculator<>();
        System.out.println(doubleCalculator.summa(1., 2.));

        int a = 0;
        System.out.println(integerCalculator.divided(1, a));

        System.out.println("Hello");

    }
}
