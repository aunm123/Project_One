package com.daoimpl;

import com.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by timhuo on 2017/2/21.
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

    private Class<T> entityClass;

    @Autowired
    public void setMySessionFactory(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    public BaseDaoImpl() {
        ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
        Type[] arguments = genericSuperclass.getActualTypeArguments();
        entityClass =  (Class<T>)arguments[0];
    }

    @Transactional
    public void save(T entity) {
        this.getHibernateTemplate().save(entity);
    }

    @Transactional
    public void delete(T entity) {
        this.getHibernateTemplate().delete(entity);
    }

    @Transactional
    public void update(T entity) {
        this.getHibernateTemplate().update(entity);
    }

    public T findByID(Serializable id) {
        return this.getHibernateTemplate().get(entityClass, id);
    }

    public List<T> findAll() {
        String hql = "From "+entityClass.getSimpleName();
        return (List<T>) this.getHibernateTemplate().find(hql);
    }
}
