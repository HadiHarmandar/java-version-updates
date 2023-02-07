package com.cydeo.builder_review;

public class MainApp {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Hook", 10, "Dog", 10, "White");
        Animal animal2 = Animal.builder().age(10).color("White").build();
        System.out.println("animal2 = " + animal2);

    }
}
