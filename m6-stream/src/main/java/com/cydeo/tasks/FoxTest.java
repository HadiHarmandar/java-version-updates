package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FoxTest {

    public static void main(String[] args) {

        Fox fox1 = new Fox("Fox1", true, true, "Black", 0);
        Fox fox2 = new Fox("Fox2", true, true, "Black", 2);
        Fox fox3 = new Fox("Fox3", true, true, "Black", 3);
        Fox fox4 = new Fox("Fox4", false, true, "Gray", 3);
        List<Fox> foxes = Arrays.asList(fox1, fox2, fox3, fox4);

        String suspect = foxes.stream()
                .filter(Fox::isWearCoat)
                .filter(Fox::isHasATorch)
                .filter(fox -> fox.getColorOfCoat().equals("Black"))
                .filter(fox -> fox.getNumberOfBag() == 3)
                .map(Fox::getName)
                .findFirst().get();

        System.out.println(suspect);

        System.out.println("Other Foxes");

        List<String> others = foxes.stream()
                .filter(fox -> !fox.getName().equals(suspect))
                .map(Fox::getName)
                .collect(Collectors.toList());

        System.out.println(others);

        for (Fox fox : foxes) {
            if (!(fox.getName().equals(suspect))) {
                System.out.println(fox.getName());
            }
        }

        for (Fox fox : foxes) {
            if (fox.isWearCoat()) {
                if (fox.isHasATorch()) {
                    if (fox.getColorOfCoat().equals("Black")) {
                        if (fox.getNumberOfBag() == 3) {
                            System.out.println(fox);
                        }
                    }
                }
            }
        }


    }
}
