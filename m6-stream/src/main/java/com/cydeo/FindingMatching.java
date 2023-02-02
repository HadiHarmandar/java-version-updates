package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Optional;

public class FindingMatching {

    public static void main(String[] args) {

        // ALL MATCH
        System.out.println("ALL MATCH");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        // ALL MATCH
        System.out.println("ANY MATCH");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is vegetarian friendly");
        }

        // NONE MATCH
        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);

        // FIND MATCH
        System.out.println("FIND MATCH");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

    }
}
