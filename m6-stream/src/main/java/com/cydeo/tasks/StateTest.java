package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State state1 = new State();
        state1.addCity("Nashville");
        state1.addCity("New York");
        state1.addCity("Los Angelos");
        state1.addCity("Orlando");
        state1.addCity("Las Vegas");

        State state2 = new State();
        state2.addCity("Nashville");
        state2.addCity("New York");
        state2.addCity("Los Angelos");
        state2.addCity("Orlando");
        state2.addCity("Las Vegas");

        State state3 = new State();
        state3.addCity("Nashville");
        state3.addCity("New York");
        state3.addCity("Los Angelos");
        state3.addCity("Orlando");
        state3.addCity("Las Vegas");

        List<State> states = Arrays.asList(state1, state2, state3);
        states.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
