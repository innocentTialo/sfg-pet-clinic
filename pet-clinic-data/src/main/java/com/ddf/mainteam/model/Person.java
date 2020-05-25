package com.ddf.mainteam.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by InnocentTIALO on 3/23/2020.
 */
@Getter
@Setter
@NoArgsConstructor
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    @Builder
    Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
