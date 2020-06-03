package ru.synergyitacademy;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
//        int [] fibbonaciArray;
        Integer fibbonaciArray[] = new Integer[256];
        fibbonaciArray[0] = 1;
        fibbonaciArray[1] = 1;
        fibbonaciArray[2] = 2;

//        System.out.println(Arrays.toString(fibbonaciArray));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index of Fibbonachi array:");
        while (scanner.hasNext()) {
            String value = scanner.nextLine();
            if ("exit".equals(value)) {
                break;
            }
            Integer index = Integer.decode(value);
            if (fibbonaciArray[index - 1] == null ||
                    fibbonaciArray[index - 1] == 0) {
                System.out.println("Value has been calculated");
                for (int i = 3; i < index; i++) {
                    fibbonaciArray[i] = fibonachi(i, fibbonaciArray);
                }
            }
            else {
                System.out.println("Value has got from cache");
            }
            int calculatedFibbonachiValue = fibbonaciArray[index -1];
            System.out.printf("%d index of Fibbonachi array %s\n", index, calculatedFibbonachiValue);
            System.out.println("Enter index of Fibbonachi array:");
        }
    }

    public static int fibonachi(int index, Integer[] fibbonachiArray) {
        return fibbonachiArray[index - 1] + fibbonachiArray[index - 2];
    }
}
