package com.ddf.mainteam.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created by InnocentTIALO on 3/23/2020.
 */
@Getter
@Setter
@NoArgsConstructor
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    @Builder
    public Pet(Long id, PetType petType, Owner owner, LocalDate birthDate) {
        super(id);
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }
}
