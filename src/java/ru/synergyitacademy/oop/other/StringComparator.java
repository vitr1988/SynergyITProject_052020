package ru.synergyitacademy.oop.other;

public class StringComparator {

    private static final String RUSSIA = "RUSSIA";
    private static final String USA = "USA";

    public static boolean compare(String str) {
//        str.equals(COUNTRY) - так делать не нужно
        return RUSSIA.equals(str);
    }
    
    public static boolean compareTo(String str) {
        return RUSSIA.compareTo(str) == 0;
    }

    public static boolean equals(String str) {
        return RUSSIA == str;
    }

    public static boolean comp(String str) {
        switch(str) {
            case RUSSIA : return true;
            case USA:
            default: return false;
        }
    }

    public static void main(String[] args) {
        String str = "RUSSIA";
        System.out.println(equals(str));
        String ru = new String("ru");
        System.out.println("ru".intern() == ru.intern());
        System.out.println("ru" == ru);
        System.out.println(compare(str));
        System.out.println(compareTo(str));
    }
}
