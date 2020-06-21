package ru.synergyitacademy.oop;

public class LinuxWindow implements Window, Cloneable {

    private double height;
    private double width;

    public LinuxWindow(){}

    public LinuxWindow(LinuxWindow linuxWindow) {
        this.height = linuxWindow.height;
        this.width = linuxWindow.width;
    }

    @Override
    public void open() {
        clone();
        System.out.println("Open Linux window");
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
    public LinuxWindow clone() {
        return new LinuxWindow(this);
    }

    @Override
    public OperatingSystem getType() {
        return OperatingSystem.LINUX;
    }
}
