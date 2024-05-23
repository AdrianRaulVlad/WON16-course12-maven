package org.fasttrackit;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public class PersonLombok {
    private final String name;
    @Getter(AccessLevel.PRIVATE)
    @Setter(AccessLevel.PRIVATE)
    private int age;
    private String country;
    private boolean isMarried;
    private String company;
}
