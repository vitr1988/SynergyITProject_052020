package ru.synergyitacademy.wrapper;

public class WrapperRunner {
    public static void main(String[] args) {
        Integer a = 127;
        Integer c = 127;
        Integer b = 128;
        Integer d = 128;
        int e = 128;

        System.out.println(a == c); // true - IntegerCache is here
        System.out.println(b == d); // false - IntegerCache is over
        System.out.println(b == e); // true because of b become primitive
    }
}
