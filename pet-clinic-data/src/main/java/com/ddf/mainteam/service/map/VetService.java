package com.ddf.mainteam.service.map;

import com.ddf.mainteam.model.Vet;
import org.springframework.stereotype.Service;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
@Service
public class VetService extends AbstractMapService<Vet, Long> {
    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }
}
