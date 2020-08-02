package ru.synergyitacademy.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Stream API с точки зрения работы с данными (а не потоки ввода-вывода)
 */
public class StreamExample {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Mathematics",
                "Physics", "Biology", "Chemistry");
        List<Science> sciences = new ArrayList<>(strList.size());
        for (String science: strList) {
            sciences.add(Science.valueOf(science.toUpperCase()));
        }
        System.out.println(sciences);
        List<Science> sciencesBasedOnStream =
//                Stream.of("Mathematics",
//                "Physics", "Biology", "Chemistry")
                stream("Mathematics", "Physics", "Biology", "Chemistry")
                .sorted(Comparator.<String>naturalOrder().reversed())
                .map(String::toUpperCase)
                .map(Science::valueOf)
//                .map(science -> Science.valueOf(science.toUpperCase()))
                .filter(Science::isNatural)
//                .filter(science -> science.isNatural())
                .collect(Collectors.toList());
        Map<String, Science> mapSciences = strList.stream()
                .collect(Collectors.toMap(Function.identity(), str -> Science.valueOf(str.toUpperCase())));
        System.out.println(sciencesBasedOnStream);
        System.out.println(mapSciences);
        List<Integer> intSet = IntStream.range(0, 200).filter(i -> i % 2 == 0).limit(10)
                .boxed() // -> Stream<Integer>
                .sorted(Comparator.<Integer>naturalOrder().reversed())
                .collect(Collectors.toList());
        System.out.println("------------");
        System.out.println(intSet);

        List<List<String>> listOfStrList = Arrays.asList(Arrays.asList("Hello", "World"), Arrays.asList("Привет", "Мир"));
        List<String> strings = listOfStrList.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(strings);
        System.out.println(strings.stream().reduce("Результат конкатенации:", (a, b) -> a + " " + b));
        System.out.println("Результат конкатенации: " + strings.stream().collect(Collectors.joining(" ")));
    }

    public static <T> Stream<T> stream(T... t) {
        return Arrays.stream(t);
    }

//    public <T> T value(T t) { аналог Function.identity()
//        return t;
//    }
}
