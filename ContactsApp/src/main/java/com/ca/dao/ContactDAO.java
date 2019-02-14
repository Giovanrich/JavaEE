package com.ca.dao;

import com.ca.model.Contact;
import java.util.List;

/**
 * @Created on Jan 12, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public interface ContactDAO {

    public abstract List<Contact> getAllContacts();

    public abstract void insert(Contact con);

    public abstract void delete(int id);
//
//    public abstract void update();

}
