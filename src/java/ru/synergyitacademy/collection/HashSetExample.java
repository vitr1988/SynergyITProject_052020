package ru.synergyitacademy.collection;

import ru.synergyitacademy.collection.custom.Device;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Device> devices = new HashSet<>(3);
        Device xaiomiFirst = new Device(
                "MobilePhone", "Xaiomi",
                BigDecimal.valueOf(10_000d));
        devices.add(xaiomiFirst);

        Device xaiomiSecond = new Device(
                "MobilePhone", "Xaiomi",
                BigDecimal.valueOf(10_000d));
        devices.add(xaiomiSecond);

        devices.add(new Device(
                "MobilePhone", "Samsung",
                BigDecimal.valueOf(50_000d)));

        devices.add(new Device(
                "MobilePhone", "IPhone",
                BigDecimal.valueOf(100_000d)));

        System.out.println(devices);
        System.out.println("Length of set: " + devices.size());
    }
}
