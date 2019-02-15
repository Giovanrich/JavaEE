package com.myorg.impl;

import com.myorg.dao.UserDao;
import com.myorg.domain.User;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @Created on Feb 14, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public class UserDAOImpl implements UserDao {

    private static UserDAOImpl userDAOImpl = null;

    public static UserDAOImpl getInstance() {
        if (userDAOImpl == null) {
            userDAOImpl = new UserDAOImpl();
        }
        return userDAOImpl;
    }

    @Override
    public User getUser(String username, String password) {
        User temp = null;
        try {

            Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction trans = session.beginTransaction();
            Query query = session.createQuery("FROM User WHERE username=:u and password=:p");
            query.setParameter("u", username);
            query.setParameter("p", password);
            temp = (User) query.uniqueResult();
            session.close();
            sf.close();
        } catch (HibernateException e) {
            e.printStackTrace();

        }
        return temp;
    }

}
