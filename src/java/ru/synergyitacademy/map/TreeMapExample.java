package ru.synergyitacademy.map;

import java.util.AbstractMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

//    static boolean flag;

    public static void main(String[] args) {
        Map<String, String> countryDictionary = new TreeMap<>();
        countryDictionary.put("ru_RU", "Russia");
        countryDictionary.put("en_US", "USA");
        countryDictionary.put("en_EN", "Great Britain");
        countryDictionary.put("en", "Great Britain");
        countryDictionary.put("de", "Germany");
        countryDictionary.put(null, "Ukraine");
        countryDictionary.put(null, "Belarus");
        countryDictionary.put("az", "Azerbaijan");

        String russia = countryDictionary.get("ru_RU");
        System.out.println(russia);
        System.out.println(countryDictionary.getOrDefault("ru", "Colombia"));
        System.out.println(countryDictionary.get(null));

        if (countryDictionary.get("az") == null) {
            countryDictionary.put("az", "Azerbaijan");
            System.out.println("No data for key az is not correct");
        }

        if (!countryDictionary.containsKey("az")) {
            System.out.println("No data for key az is correct");
        }
//        containsValueInEarlierVersions(countryDictionary);
        countryDictionary.containsValue(countryDictionary);
        System.out.println("------------------");
        for (Map.Entry<String, String> entry : countryDictionary.entrySet()) {
            if ("Great Britain".equals(entry.getValue())) {
                System.out.println(entry);
            }
        }
        String str = "Great Britain";
        countryDictionary.forEach((key, value) -> {
            if (str.equals(value)) {
                System.out.println(key + "=" + value);
            }
        });
        Map.Entry<Integer, String> pair = new AbstractMap.SimpleEntry<>(1, "Russia");
        countryDictionary.remove(null);
        System.out.println("------------------");
        System.out.println(countryDictionary.get(null));
        System.out.println("------------------");
        countryDictionary.computeIfAbsent("tha", key -> "Thailand");
//        System.out.println(countryDictionary.get("tha"));
        countryDictionary.merge("tha", "Kingdom",
                (oldValue, newValue) -> {
                    if (newValue.equals("Kingdom of Thailand")){
                        return newValue;
                    }
                    else {
                        return oldValue;
                    }
                });
        System.out.println(countryDictionary.get("tha"));

        System.out.println(countryDictionary.values().stream()
                .filter(value -> value.startsWith("G"))
                .count());


//        Closeable closeable = () -> {};

        return;

    }

    private static boolean containsValueInEarlierVersions(Map<String, String> countryDictionary) {
        for (String strin : countryDictionary.values()) {
            if ("Belarus".equals(strin)) {
                return true;
            }
        }
        return false;
    }
}
