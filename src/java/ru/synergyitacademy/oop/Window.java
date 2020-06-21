package ru.synergyitacademy.oop;

public interface Window {

    /*public static final */int MAX = 124;

    /*public abstract */void open();
    void close();
    void maximize();
    void minimize();
    void collapse();

    OperatingSystem getType();

    default void remove() {
        System.out.println("Remove работает идентично во всех ОС");
    }

    static Window getWindowsInstance() {
        return new WindowsWindow();
    }

    static Window getMacOsInstance() {
        return new MacOsWindow();
    }
}
