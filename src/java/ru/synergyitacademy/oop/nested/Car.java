package ru.synergyitacademy.oop.nested;

public class Car {
    private String model;
    private String mark;

    public void repair(Engine engine) {
        class Util {
            public String convert(float value) {
                return value + "";
            }
        }
        new Util().convert(engine.getVolume());
    }

    class Engine { // inner class
        private float volume;
        private int horsePower;
        private boolean injector;

        public float getVolume() {
//            Car.this.repair(this);
            return volume;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public boolean isInjector() {
            return injector;
        }
    }

    static class Tyre {
        public void help() {

        }
    }
}
