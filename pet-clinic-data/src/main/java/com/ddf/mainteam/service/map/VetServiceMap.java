package com.ddf.mainteam.service.map;

import com.ddf.mainteam.model.Vet;
import com.ddf.mainteam.service.VetService;
import org.springframework.stereotype.Service;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }
}
