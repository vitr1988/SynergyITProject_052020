package ru.synergyitacademy.collection;

import ru.synergyitacademy.collection.custom.Device;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<Device> devices = new LinkedHashSet<>();

        devices.add(new Device(
                "MobilePhone", "Samsung",
                BigDecimal.valueOf(50_000d)));

        devices.add(new Device(
                "MobilePhone", "IPhone",
                BigDecimal.valueOf(100_000d)));

        devices.add(new Device(
                "MobilePhone", "Xaiomi",
                BigDecimal.valueOf(10_000d)));

        devices.add(null);

        System.out.println(devices);
    }
}
