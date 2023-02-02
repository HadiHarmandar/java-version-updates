package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        //list.forEach(System.out::println);

        // FILTER
        System.out.println("Filter");
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        // DISTINCT
        System.out.println("Distinct");
        Stream<Integer> stream = list.stream()
                .filter(i -> i % 2 == 0)
                .distinct(); // avoid duplicate

        stream.forEach(System.out::println); // Stream is closed

        // LIMIT
        System.out.println("Limit");
        list.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);

        // SKIP
        System.out.println("Skip");
        list.stream()
                .filter(i -> i % 2 == 0)
                .skip(1)
                .forEach(System.out::println);

        // MAP
        System.out.println("Map");
        list.stream()
                .map(number -> number * 2)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);

        // TASK
        System.out.println("Task");
        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");
        words.stream()
                .map(w -> w.length())
                .forEach(System.out::println);

        // WITHOUT STREAM
        System.out.println("Without Stream");
        for (String word : words) {
            System.out.println(word.length());
        }

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);



    }
}
