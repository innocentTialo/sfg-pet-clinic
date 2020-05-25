package com.ddf.mainteam.service.map;

import com.ddf.mainteam.model.Pet;
import com.ddf.mainteam.service.PetService;
import org.springframework.stereotype.Service;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

}
