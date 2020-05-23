package com.ddf.mainteam.service.map;

import com.ddf.mainteam.model.Pet;
import org.springframework.stereotype.Service;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> {
    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }
}
