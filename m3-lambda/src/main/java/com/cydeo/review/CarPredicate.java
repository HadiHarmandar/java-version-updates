package com.cydeo.review;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}
