package ru.synergyitacademy.oop;

public interface GraphicWindow extends Window {

    default void display() {
        System.out.println("Console window display");
    }
}
