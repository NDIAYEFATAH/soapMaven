package sn.dev.dao;

import java.util.List;

public interface Repository <T> {
    public boolean save(T entity);
    public boolean update(T entity);
    public boolean delete(int id,T entity);
    public T findById(int id,T entity);
    public List<T> findAll(T entity);
}
