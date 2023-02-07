package com.cydeo.builder_review;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Animal {

    String name;
    int age;
    String type;
    int weight;
    String color;
}
