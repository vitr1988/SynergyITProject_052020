package ru.synergyitacademy;

public class VehicleRunner {

    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
        Vehicle train = new Train();
        Aircraft aircraft = new Aircraft();
        Car car = new Car();

        for (Vehicle vehicle : new Vehicle[]{train, aircraft, car}) {
            vehicle.move();
        }

    }
}

