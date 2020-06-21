package ru.synergyitacademy.oop;

public class MacOsWindow implements Window {
    @Override
    public void open() {
        System.out.println("Open MacOS window");
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

    public MacOsWindow cloneWindow() {
        System.out.println("Clone MacOS window");
        return new MacOsWindow();
    }

    @Override
    public OperatingSystem getType() {
        return OperatingSystem.MACOS;
    }
}
