package ru.synergyitacademy.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String[] args) {
        Deque<Integer> intDeque = new ArrayDeque<>();
        intDeque.add(564);
        intDeque.add(259);
        intDeque.add(386);
        for (Integer currentElement : intDeque) {
            System.out.println(currentElement);
        }
    }
}
