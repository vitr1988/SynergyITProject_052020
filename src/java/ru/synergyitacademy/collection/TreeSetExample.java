package ru.synergyitacademy.collection;

import ru.synergyitacademy.collection.custom.Device;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        stringSet.add("Журнал");
        stringSet.add("Азбука");
        stringSet.add("Букварь");
        stringSet.add("АБГДейка");
//        stringSet.add(null);
        System.out.println(stringSet);

        Set<Device> devices = new TreeSet<>();

        devices.add(new Device(
                "MobilePhone", "IPhone",
                BigDecimal.valueOf(100_000d)));

        devices.add(new Device(
                "MobilePhone", "Samsung",
                BigDecimal.valueOf(50_000d)));

        devices.add(new Device(
                "MobilePhone", "Xaiomi",
                BigDecimal.valueOf(10_000d)));

        System.out.println(devices);
    }
}
