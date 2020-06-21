package ru.synergyitacademy.oop;

public interface ConsoleWindow extends Window {

    default void display() {
        System.out.println("Console window display");
    }
}
