package ru.synergyitacademy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OptionalExample {
    public static void main(String[] args) {
        String str = null;
        Optional<String> stringOptional = Optional.ofNullable(str);
        if (stringOptional.isPresent()) {
            stringOptional.get();
        }
        System.out.println(stringOptional.orElse("Пустота"));
        List<String> sciences = Arrays.asList("MAZDA", "BMW", "SKODA", null);
        List<String> collect = sciences.stream()
                .map(Optional::ofNullable)
                .filter(Optional::isPresent)
                .map(optional -> optional.orElseThrow(() -> new IllegalArgumentException()))
                .collect(Collectors.toList());
        Optional<Optional<String>> options = Optional.of(Optional.of("Привет"));
        String result = options.flatMap(Function.identity()).get();
        System.out.println(result);
        Integer intOpt = Optional.of(122)
                .filter(i -> i % 2 == 1)
                .orElse(1);
        System.out.println(Optional.ofNullable(null).equals(Optional.empty()));
        System.out.println(intOpt);
    }

    static enum Mark {
        MAZDA, BMW, MERCEDEZ, SKODA
    }
}
