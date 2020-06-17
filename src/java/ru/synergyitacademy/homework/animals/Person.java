package ru.synergyitacademy.homework.animals;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void feed(Pet pet) {
        Integer amountSort = pet.AMOUNT_SORT;
        System.out.printf("%s покормил %s\n", name, pet.getType());
    }
}
