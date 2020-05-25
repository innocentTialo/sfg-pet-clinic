package com.ddf.mainteam.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by InnocentTIALO on 3/23/2020.
 */
@Setter
@Getter
@NoArgsConstructor
public class Vet extends Person {

    @Builder(builderMethodName = "vetBuilder")
    public Vet(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
