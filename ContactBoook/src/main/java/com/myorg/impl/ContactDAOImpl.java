package com.myorg.impl;

import com.myorg.dao.ContactDAO;
import com.myorg.domain.Contact;
import com.myorg.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @Created on Feb 14, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public class ContactDAOImpl implements ContactDAO {

    private final SessionFactory sf = HibernateUtil.getSessionFactory();
    private static ContactDAOImpl contactDAOImpl = null;

    public static ContactDAOImpl getInstance() {
        if (contactDAOImpl == null) {
            contactDAOImpl = new ContactDAOImpl();
        }
        return contactDAOImpl;
    }

    @Override
    public boolean save(Contact contact) {
        boolean status = false;
        Session session = this.sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(contact);
        transaction.commit();
        status = true;
        session.close();
        return status;
    }

    @Override
    public boolean delete(int contactId) {
        boolean status = false;
        Session session = this.sf.openSession();
        Transaction transaction = session.beginTransaction();
        Contact contact = session.get(Contact.class, contactId);
        session.delete(contact);
        transaction.commit();
        status = true;
        session.close();
        return status;
    }

    @Override
    public boolean update(Contact contact) {
        boolean status = false;
        Session session = this.sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(contact);
        transaction.commit();
        status = true;
        session.close();
        return status;
    }

    @Override
    public Contact getContact(int contactId) {
        Session session = this.sf.openSession();
        Contact contact = session.get(Contact.class, contactId);
        session.close();
        //sf.close();
        return contact;
    }

    @Override
    public List<Contact> getContacts() {
        Session session = this.sf.openSession();
        List<Contact> conatcList = session.createCriteria(Contact.class).list();
        session.close();
        //sf.close();
        return conatcList;
    }

}
