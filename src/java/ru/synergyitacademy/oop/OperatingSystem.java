package ru.synergyitacademy.oop;

public enum OperatingSystem {

    WINDOWS("windows", "win", "winows"),
    LINUX("linux", "lx", "unix"),
    MACOS("macos", "ms", "unix");

    OperatingSystem(String name, String code, String baseName){
        this.name = name;
        this.code = code;
        this.baseName = baseName;
    }

    private String name;
    private String code;
    private String baseName;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getBaseName() {
        return baseName;
    }
}
