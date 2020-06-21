package ru.synergyitacademy.oop;

public class WindowRunner {
    public static void main(String[] args) {
        Window[] windows = new Window[] {
          new WindowsWindow(), new LinuxWindow()
        };

        for (Window window: windows) {
            window.open();
            System.out.println("--------------");
            window.remove();
            System.out.println(window.getType().getName());
        }

        OperatingSystem os = Enum.valueOf(OperatingSystem.class, "WINDOWS");
        System.out.println("Current os: " + os.getName());

        windowHandler();
    }

    public static void windowHandler() {
        Window window = new MacOsWindow();
        window.open();//
        window.minimize();
        window.maximize();
        window.close();
        window = null;
        if (window instanceof MacOsWindow) { // NPE пройдет
            ((MacOsWindow) window).cloneWindow();
        }
    }
}
