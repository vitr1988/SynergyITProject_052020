package ru.synergyitacademy.collection.custom;

import java.math.BigDecimal;
import java.util.Objects;

public class Device /*implements Comparable<Device>*/ {
    private String type; // mobile phone
    private String brand;
    private BigDecimal price;

    public Device() {}

    public Device(String type, String brand, BigDecimal price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equals(type, device.type) &&
                Objects.equals(brand, device.brand) &&
                Objects.equals(price, device.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand, price);
    }

    @Override
    public String toString() {
        return "Device{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

//    @Override
//    public int compareTo(Device d) {
//        return this.price.compareTo(d.price);
//    }
}
