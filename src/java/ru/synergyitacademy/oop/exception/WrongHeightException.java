package ru.synergyitacademy.oop.exception;

public class WrongHeightException extends RuntimeException {

    public WrongHeightException(String message) {
        super(message);
    }

    public WrongHeightException(Throwable throwable) {
        super(throwable);
    }

//    public String toString() {
//        return "There is " + getLocalizedMessage();
//    }
}
