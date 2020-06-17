package ru.synergyitacademy.homework.animals;

import ru.synergyitacademy.homework.animals.specialized.Dog;

public class PetRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        dog.setNickName("Тузик");
        dog.setSort("Дворняжка");
        dog.setColor("Черный");
        dog.setLength(0.05); // в метрах
        dog.setWidth(0.02); // в метрах
        Dog smallDog = new Dog("Крепыш");
        Pet[] pets = new Pet[] {dog, smallDog};
        for (Pet pet : pets) {
            pet.voice();
        }
        Person hozyain = new Person("Виталий");
        dog.eat(hozyain);
    }
}
