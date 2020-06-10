package ru.synergyitacademy;

public class Car extends Vehicle {

    @Override
    public final void move() {
        System.out.println("Driving on the road!");
    }

    public void repair(){}

}
