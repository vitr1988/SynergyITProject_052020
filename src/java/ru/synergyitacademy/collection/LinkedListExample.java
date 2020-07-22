package ru.synergyitacademy.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListExample {

    public static void main(String[] args) {
        List<Integer> linkedListOfIntegers = new LinkedList<>();
        Random random = new Random();
        for (int i = 1; i <= 10_000; i++) {
            linkedListOfIntegers.add(random.nextInt());
        }
        System.out.println(linkedListOfIntegers + "");
        System.out.println(linkedListOfIntegers.size());
    }
}
