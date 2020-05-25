package com.ddf.mainteam.service.map;

import com.ddf.mainteam.model.BaseEntity;
import com.ddf.mainteam.service.AbstractDdfService;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by InnocentTIALO on 5/23/2020.
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements AbstractDdfService<T, ID>{

    protected Map<Long, T> map = new HashMap<>();

    T save(Long id, T t) {
        return map.put(id, t);
    }


    @Override
    public T save(T t) {
        t.setId(Optional.ofNullable(t.getId()).orElse(getNextId()));
        return save(getNextId(), t);
    }

    @Override
    public List<T> save(T... ts) {
        return Arrays.stream(ts)
                .map(this::save)
                .collect(Collectors.toList());
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

    public Long getNextId() {
        return Collections.max(map.keySet()) + 1;
    }
}
