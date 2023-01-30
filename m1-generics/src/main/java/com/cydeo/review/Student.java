package com.cydeo.review;

import lombok.*;

@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor // We use to assign final fields.
//@Getter
//@Setter
//@ToString
@Data
public class Student {
    
    private String name;
    private final int id;

    
}