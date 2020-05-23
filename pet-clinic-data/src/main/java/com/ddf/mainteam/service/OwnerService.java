package com.ddf.mainteam.service;

import com.ddf.mainteam.model.Owner;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
public interface OwnerService extends AbstractDdfService<Owner, Long> {
    Owner findByLastName(String lastName);
}
