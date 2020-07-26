package ru.synergyitacademy.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<Integer> intQueue = new PriorityQueue<>();
        intQueue.add(1);
        intQueue.add(10);
        intQueue.add(100);

//        System.out.println("Head of queue: " + intQueue.peek());
//        System.out.println("Head of queue: " + intQueue.poll()); // remove element from head
//        intQueue.remove(100);
//        System.out.println("Head of queue: " + intQueue.element());
//        System.out.println("Head of queue: " + intQueue.poll());
//        System.out.println("Head of queue: " + intQueue.poll());
        Integer currentElement;
        while((currentElement = intQueue.poll()) != null) {
            System.out.println(currentElement);
        }
    }
}
