package ru.synergyitacademy.oop.utility;

import java.util.Arrays;

public class StringExample {

    public static void main(String[] args) {
        String str = "My favourite string";
        String anotherStr = "My favourite string";
        System.out.println(str.equals(anotherStr));
        System.out.println("".isEmpty());
        System.out.println(str.charAt(4));
        System.out.println(Arrays.toString(str.split("\\s+")));
        // "Test " + " is a fun"
        String testResult = new StringBuilder().append("Test ").append(" is a fun").toString();

    }
}

