package com.cydeo.tasks;

import com.cydeo.Apple;
import com.cydeo.ApplePredicate;
import com.cydeo.Color;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrintApple {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        ApplePredicate1 printColor = apple -> "A Light " + apple.getColor() + " apple";
        prettyPrintApple(inventory, printColor);

        prettyPrintApple(inventory, apple -> "An apple of " + apple.getWeight() + "g");

        // extra
        for (Apple apple : inventory) {
            List<Apple> apples = new ArrayList<>();
            if (apple.getColor().equals(Color.RED)) {
                apples.add(apple);
            }
            prettyPrintApple(apples, apple1 -> "A Light " + apple1.getColor() + " apple");
        }

    }

    public static void prettyPrintApple(List<Apple> inventory, ApplePredicate1 applePredicate){
        for(Apple apple : inventory){
            String output = applePredicate.print(apple);
            System.out.println(output);
        }
    }
}
