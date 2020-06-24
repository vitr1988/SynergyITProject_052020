package ru.synergyitacademy.oop.nested;

public class ViewRunner {

    public static void main(String[] args) {
        Viewable viewable = new Viewable() {
            @Override
            public long view(String str, int level) {
                System.out.println("Text");
                return -1L;
            }
        };
        Viewable viewable2 = (str, l) -> {
            System.out.println("Text");
            return -1L;
        };
    }
}
