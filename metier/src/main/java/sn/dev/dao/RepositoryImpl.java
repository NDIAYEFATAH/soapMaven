package sn.dev.dao;

import org.hibernate.Session;
import sn.dev.config.HibernateUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

public class RepositoryImpl<T> implements Repository<T> {
    private final Session session = HibernateUtil.getSessionFactory().openSession();
    @Override
    @Transactional
    public boolean save(T entity) {
        try {
            session.getTransaction().begin();
            session.save(entity);
            session.getTransaction().commit();
            return true;
        }catch (Exception e2)
        {
            return false;
        }
    }

    @Override
    public boolean update(T entity) {
        try {
            session.getTransaction().begin();
            session.update(entity);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(int id,T entity) {
        try {
            session.getTransaction().begin();
            session.delete(session.get(entity.getClass(), id));
            session.getTransaction().commit();
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    @Override
    public T findById(int id, T entity) {
        return (T) session.get(entity.getClass(), id);
    }

    @Override
    public List<T> findAll(T entity) {
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<T> cq = (CriteriaQuery<T>) cb.createQuery(entity.getClass());
        Root<T> root = (Root<T>) cq.from(entity.getClass());
        cq.select(root);
        return session.createQuery(cq).getResultList();
    }
}
