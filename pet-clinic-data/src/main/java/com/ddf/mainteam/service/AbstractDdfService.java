package com.ddf.mainteam.service;

import java.util.Set;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
public interface AbstractDdfService<T, ID> {

    T save(T t);

    T findById(ID id);

    Set<T> findAll();

    void delete(T t);

    void deleteById(ID id);
}
