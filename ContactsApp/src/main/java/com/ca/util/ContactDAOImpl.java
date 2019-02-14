package com.ca.util;

import com.ca.dao.ContactDAO;
import com.ca.model.Contact;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @Created on Jan 12, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public class ContactDAOImpl implements ContactDAO {

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contacts = new ArrayList<>();
        Configuration conf = new Configuration().configure().addAnnotatedClass(Contact.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();

        try {

            Query selectAllQuerry = session.createQuery("from Contact");
            contacts = selectAllQuerry.list();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (tr != null) {
                tr.rollback();
            }
        } finally {
//           sf.close();
//            session.close(); 
        }

        return contacts;
    }

    @Override
    public void insert(Contact con) {
        Configuration conf = new Configuration().configure().addAnnotatedClass(Contact.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        try {
            session.save(con);
            tr.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {

            Configuration con = new Configuration().configure().addAnnotatedClass(Contact.class);
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction trans = session.beginTransaction();
            Query query = session.createQuery("DELETE FROM Contact WHERE id=:id");
            query.setParameter("id",id);
            query.executeUpdate();

            session.close();
            sf.close();
        } catch (HibernateException e) {
            e.printStackTrace();

        }
    }

}
