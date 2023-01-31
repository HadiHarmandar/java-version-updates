package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 0, 15, 5, 20);
        System.out.println(list);

        // Ascending
        Collections.sort(list);
        System.out.println(list);

        // Descending
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, (x, y) -> (x > y) ? -1 : (y > x) ? 1 : 0);

    }
}
