package com.ddf.mainteam.service.map;

import com.ddf.mainteam.model.BaseEntity;
import com.ddf.mainteam.service.AbstractDdfService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
public abstract class AbstractMapService<T extends BaseEntity, ID> implements AbstractDdfService<T, ID>{

    protected Map<ID, T> map = new HashMap<>();

    T save(ID id, T t) {
        return map.put(id, t);
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public void delete(T t) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }
}
