package ru.synergyitacademy.oop;

import java.io.Serializable;

public class WindowsWindow extends Object implements Window, Serializable {
    @Override
    public void open() {
        System.out.println("Open Windows window!");
    }

    @Override
    public void close() {

    }

    @Override
    public void maximize() {

    }

    @Override
    public void minimize() {

    }

    @Override
    public void collapse() {

    }

    @Override
    public OperatingSystem getType() {
        return OperatingSystem.WINDOWS;
    }
}
