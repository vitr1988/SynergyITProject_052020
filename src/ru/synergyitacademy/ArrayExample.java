package ru.synergyitacademy;

import java.util.Arrays;

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
        System.out.println(Arrays.toString(fibbonaciArray));
    }

    public static int fibonachi(int index, int[] fibbonachiArray) {
        return fibbonachiArray[index - 2] + fibbonachiArray[index - 3];
    }
}
