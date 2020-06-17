package ru.synergyitacademy.homework.animals;

public abstract class Pet {

    protected static final Integer AMOUNT_SORT = 100;

    private int id;
    private int age;
    private double width;
    private double length;
    private String color;

    private final String type;

    public Pet(String type) {
        this.type = type;
    }

    public int beOlder() {
        return ++age;
    }

    public abstract void voice();

    public int getAge() {
        return age;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(Person person) {
        person.feed(this);
    }

    public String getType() {
        return type;
    }
}
