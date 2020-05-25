package com.ddf.mainteam.service.map;

import com.ddf.mainteam.model.Owner;
import com.ddf.mainteam.service.OwnerService;
import org.springframework.stereotype.Service;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
