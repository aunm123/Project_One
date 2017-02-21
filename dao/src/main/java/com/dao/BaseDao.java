package com.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by timhuo on 2017/2/21.
 */
public interface BaseDao<T> {
    public void save(T entity);
    public void delete(T entity);
    public void update(T entity);
    public T findByID(Serializable id);
    public List<T> findAll();
}
