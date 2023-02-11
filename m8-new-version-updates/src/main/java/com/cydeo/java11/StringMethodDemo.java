package com.cydeo.java11;

public class StringMethodDemo {

    public static void main(String[] args) {

        var str = "Mike \nOzzy \nTom \nEmmy";

        String s = "Cydeo";
        s.lines().forEach(System.out::println);
        str.lines().forEach(System.out::println);

    }
}
