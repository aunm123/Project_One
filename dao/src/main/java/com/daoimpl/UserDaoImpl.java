package com.daoimpl;

import com.dao.UserDao;
import domain.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by timhuo on 2017/2/10.
 */
@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {

    @Resource
    private SessionFactory sessionFactory;

    public User findUser(int id) {
        User user = sessionFactory.getCurrentSession().get(User.class,id);
        return user;
    }

    public List<User> findAllUser() {
        return null;
    }

    @Transactional
    public Boolean deleteUser(int id){
        sessionFactory.getCurrentSession()
                .createQuery("delete from User s where s.id = ?")
                .setParameter(0,id)
                .executeUpdate();
        return true;
    }

    @Transactional
    public Boolean saveUser(User user) {
        sessionFactory.getCurrentSession().persist(user);
        return true;
    }
}
