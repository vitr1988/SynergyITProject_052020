package ru.synergyitacademy;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
//        int [] fibbonaciArray;
        int fibbonaciArray[] = new int[30];
        fibbonaciArray[0] = 1;
        fibbonaciArray[1] = 1;
        fibbonaciArray[2] = 2;
        for (int i = 3; i < fibbonaciArray.length; i++) {
            fibbonaciArray[i] = fibonachi(i, fibbonaciArray);
        }
//        System.out.println(Arrays.toString(fibbonaciArray));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index of Fibbonachi array:");
        while (scanner.hasNext()) {
            String value = scanner.nextLine();
            if ("exit".equals(value)) {
                break;
            }
            Integer index = Integer.decode(value);
            System.out.printf("%d index of Fibbonachi array %s", index, fibbonaciArray[index -1]);
        }
    }

    public static int fibonachi(int index, int[] fibbonachiArray) {
        return fibbonachiArray[index - 1] + fibbonachiArray[index - 2];
    }
}
