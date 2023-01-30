package com.cydeo.review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Algorithm {
public static <T> T max(T x, T y) {
return (Integer) x >(Integer) y ? x : y;
}

    public static void main(String[] args) {

    List<Double> list = new ArrayList<>(Arrays.asList(1.,2.,3.,4.,5.,6.));
    print(list);

    }
    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }
}