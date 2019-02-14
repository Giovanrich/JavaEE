package com.jspcrud.impl;

import com.jspcrud.dao.UserDao;
import com.jspcrud.domain.User;
import com.jspcrud.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @Created on Feb 13, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public class UserDaoImpl implements UserDao {

    private static UserDaoImpl userDaoImpl = null;
    private SessionFactory sf = HibernateUtil.getSessionFactory();

    public static UserDaoImpl getInstance() {
        if (userDaoImpl == null) {
            userDaoImpl = new UserDaoImpl();
        }
        return userDaoImpl;
    }

    @Override
    public void addUser(User user) {
        Session session = this.sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
        //sf.close();
        
    }

    @Override
    public void deleteUser(int userId) {
        Session session = this.sf.openSession();
        Transaction transaction = session.beginTransaction();
        User customer = session.get(User.class, userId);
        session.delete(customer);
        transaction.commit();
        session.close();
       // sf.close();
    }

    @Override
    public void updateUser(User user) {
        Session session = this.sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
        //sf.close();
    }

    @Override
    public List<User> getAllUsers() {
        Session session = this.sf.openSession();
        List<User> userList = session.createCriteria(User.class).list();
        session.close();
        //sf.close();
        return userList;
    }

    @Override
    public User getUserById(int userId) {
        Session session = this.sf.openSession();
        User user = session.get(User.class, userId);
        session.close();
        //sf.close();
        return user;
    }

}
