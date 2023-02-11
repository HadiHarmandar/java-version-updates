package com.cydeo.java12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuestTask {


    public static void main(String[] args) {

        var result =
                Stream.of(
                                new Guest("Marco", true, 3),
                                new Guest("David", false, 2),
                                new Guest("Roger", true, 6))
                        .collect(Collectors.teeing(
                                // first collector, we select only confirmed the participation
                                Collectors.filtering(Guest::isParticipating,
                                        // we want to collect only the first name in a list
                                        Collectors.mapping(Guest::getName, Collectors.toList())),
                                // second collector, we want the total number of participation
                                Collectors.filtering(Guest::isParticipating, Collectors.summingInt(Guest::getParticipantsNumber)),
                                // we merge the collectors on a new Object,
                                // the values ar implicitly passed
                                EventParticipation::new));

        System.out.println(result);

        // without teeing()
        System.out.println("*******************Without teeing()*******************");

        List<String> list = Stream.of(
                new Guest("Marco", true, 3),
                new Guest("David", false, 2),
                new Guest("Roger", true, 6))
                .filter(Guest::isParticipating)
                .map(Guest::getName)
                .collect(Collectors.toList());

        Integer sum = Stream.of(
                new Guest("Marco", true, 3),
                new Guest("David", false, 2),
                new Guest("Roger", true, 6))
                .filter(Guest::isParticipating)
                .map(Guest::getParticipantsNumber)
                .reduce(Integer::sum)
                .get();

        EventParticipation participation = new EventParticipation(list, sum);
        System.out.println(participation);



    }
}