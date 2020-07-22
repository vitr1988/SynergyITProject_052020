package ru.synergyitacademy.collection;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(100); // list of 10 elements
        strList.add("Привет");
        for (int i = 0; i < 1200; i++) {
            strList.add(i + "");
        }
        strList.add("HelloWorld");
        System.out.println("Size: " + strList.size());
        for (String str: strList) {

        }

        for (Iterator<String> iter = strList.iterator(); iter.hasNext();) {
            String currentString = iter.next();

        }
        for (int i = 0; i < 12; i++) {
            System.out.printf("Element of %d index is %s\n", i, strList.get(i));
        }

        strList.remove(11); // remove element of 11 index
        strList.remove("2"); // remove element with value 2
        System.out.println("Size: " + strList.size());
        strList.set(0, "Пока");
        Object[] strArray = strList.toArray();
        System.out.println(Arrays.toString(strArray));

        String[] strNativeArray = new String[strList.size()];
        System.out.println(Arrays.toString(strList.toArray(strNativeArray)));

        System.out.println(strList.subList(3, 7) + "");

        ListIterator<String> stringListIterator = strList.listIterator();

        int i = 0;
//        for (String str: strList) { DO NOT USE THIS CODE
//            if (i % 2 == 0) {
//                strList.remove(i);
//            }
//            i++;
//        }

        for (Iterator<String> iter = strList.iterator(); iter.hasNext();) {
            iter.next();
            if (i % 2 == 0) {
                iter.remove();
            }
            i++;
        }

        System.out.println(strList + "");
    }
}
