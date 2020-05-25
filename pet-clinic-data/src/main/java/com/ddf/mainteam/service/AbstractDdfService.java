package com.ddf.mainteam.service;

import java.util.List;
import java.util.Set;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
public interface AbstractDdfService<T, ID> {

    List<T> save(T... t);

    T save(T t);

    T findById(ID id);

    Set<T> findAll();

    void delete(T t);

    void deleteById(ID id);
}
