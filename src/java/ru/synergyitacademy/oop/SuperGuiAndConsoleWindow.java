package ru.synergyitacademy.oop;

public interface SuperGuiAndConsoleWindow extends GraphicWindow, ConsoleWindow {

    default void display() {
        GraphicWindow.super.display();
    }
}
