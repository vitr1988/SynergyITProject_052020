package ru.synergyitacademy.collection;

import ru.synergyitacademy.collection.custom.Device;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>(3);
        devices.add(new Device(
                "MobilePhone", "Xaiomi",
                BigDecimal.valueOf(10_000d)));

        devices.add(new Device(
                "MobilePhone", "Samsung",
                BigDecimal.valueOf(50_000d)));

        devices.add(new Device(
                "MobilePhone", "IPhone",
                BigDecimal.valueOf(100_000d)));

        System.out.println(devices);

        Collections.sort(devices, (d1, d2) ->
            d1.getBrand().compareTo(d2.getBrand())
        );

        System.out.println(devices);

        devices = Collections.unmodifiableList(devices);
        devices.add(new Device("Computer", "DLink", BigDecimal.valueOf(150_000d)));

        Collections.emptyList();
    }
}
