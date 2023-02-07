package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareEachNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> square = numbers.stream()
                .map(integer -> integer * integer)
                .collect(Collectors.toList());

        System.out.println(square);

        Stream.iterate(0,n->n+2)
                .limit(5)
                .forEach(System.out::println);

        int[] arr = {};





    }
}
