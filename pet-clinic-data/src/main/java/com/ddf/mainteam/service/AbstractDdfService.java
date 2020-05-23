package com.ddf.mainteam.service;

import java.util.List;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
public abstract class AbstractDdfService<T, ID> {

    protected T save(T t){
        return null;
    }

    protected T findById(ID id) {
        return null;
    }

    protected List<T> findAll() {
        return null;
    }
}
