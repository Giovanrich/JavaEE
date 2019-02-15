package com.myorg.dao;

import com.myorg.domain.Contact;
import java.util.List;

/**
 * @Created on Feb 14, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public interface ContactDAO {

    public boolean save(Contact contact);

    public boolean delete(int contactId);

    public boolean update(Contact contact);

    public Contact getContact(int contactId);

    public List<Contact> getContacts();

}
