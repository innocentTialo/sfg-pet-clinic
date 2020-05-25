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
public class PetType extends BaseEntity {

    private String name;

    @Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }
}
