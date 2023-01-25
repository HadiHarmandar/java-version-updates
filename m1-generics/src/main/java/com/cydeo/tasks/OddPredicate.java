package com.cydeo.tasks;

import tasks.task2.UnaryPredicate;

public class OddPredicate implements UnaryPredicate<Integer> {
    @Override
    public boolean test(Integer obj) {
        return obj % 2 != 0;
    }
}
