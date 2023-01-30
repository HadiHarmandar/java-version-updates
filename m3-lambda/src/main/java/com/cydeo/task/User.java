package com.cydeo.task;

import lombok.*;

import javax.management.ConstructorParameters;

//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
@Data // @Getter @Setter @ToString ==> and if you don't have any constructor + @NoArgsConstructor
@AllArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private int age;
}
