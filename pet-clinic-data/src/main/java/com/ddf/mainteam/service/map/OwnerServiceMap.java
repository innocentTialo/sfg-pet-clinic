package com.ddf.mainteam.service.map;

import com.ddf.mainteam.model.Owner;
import org.springframework.stereotype.Service;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> {
    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }
}
