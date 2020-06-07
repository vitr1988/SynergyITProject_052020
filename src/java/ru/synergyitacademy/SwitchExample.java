package ru.synergyitacademy;

public class SwitchExample {

    public static void main(String[] args) {
        int currentValue = 65;
        System.out.printf("Current semaphore color : %s", getColor(currentValue));
    }

    public static String getColor(int currentValue) {
        switch (currentValue) {
            case 0:
            case 25:
            case 3: {
                return "red";
            }
            case 1: {
                return "yellow";
            }
            case 2: {
                return "green";
            }
            case 65:
            default: {
                return "none";
            }
        }
    }
}
