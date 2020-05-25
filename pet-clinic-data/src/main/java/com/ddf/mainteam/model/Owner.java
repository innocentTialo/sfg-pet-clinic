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
public class Owner extends Person {

    @Builder(builderMethodName = "ownerBuilder")
    public Owner(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
