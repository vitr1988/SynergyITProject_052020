package ru.synergyitacademy.oop.exception;

public class CarExample {

    private static final double MAX_HEIGHT = 4.;
    private static final double MAX_WIDTH = 2.5;

    public static void main(String[] args) {
        Car car = new Car();
        car.setHeight(4.3);
        car.setLength(4.5);
        car.setWidth(2.0);

        try {
            if (checkSize(car)) {
                System.out.println("Everything is OK!");
            }
        }
        catch (WrongHeightException e) {
            System.out.println("Not everything is OK!");
            e.printStackTrace();
        }
    }

    private static boolean checkSize(Car car) {
        if (car.getHeight() > MAX_HEIGHT) {
            throw new WrongHeightException("Not appropriate height!");
        }
        if (car.getWidth() > MAX_WIDTH) {
            //TODO:
        }

        return true;
    }
}
