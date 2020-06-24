package ru.synergyitacademy.oop.nested;

public class CarLauncher {

    public static void main(String[] args) {
        Car car = new Car();
//        Car.Engine engine = new Car.Engine(); // for static classes
        Car.Engine engine = car.new Engine();
        car.repair(engine);
    }
}
