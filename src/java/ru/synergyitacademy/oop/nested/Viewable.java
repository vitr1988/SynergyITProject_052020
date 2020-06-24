package ru.synergyitacademy.oop.nested;

@FunctionalInterface
public interface Viewable {

    long view(String str, int level);

    default void display() {

    }
}
