package ru.synergyitacademy.oop.exception;

import java.util.Scanner;

public class ExceptionRunner {

    public static void main(String[] args) {
        System.out.println("Real result is " + square(null, 3));
    }

    private static int square(Integer base, int number) {
        Integer result = 1;
        try {
            for (int i = 0; i < number; i++) {
                try (Scanner scanner = new Scanner(System.in)) {
                    result *= base;
                }
            }
        }
        catch(NullPointerException e) {
            e.printStackTrace();
            result = -1;
        }
        finally {
            System.out.println("Result of operation is " + result);
            if (result > 0) {
                return 1;
            }
        }

        return result;
    }
}
