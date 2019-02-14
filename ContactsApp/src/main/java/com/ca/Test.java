
package com.ca;

import com.ca.model.Contact;
import com.ca.util.ContactDAOImpl;
import java.util.List;

/**
 *@Created on Jan 12, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public class Test {
    public static void main(String[] args) {
        ContactDAOImpl im= new ContactDAOImpl();
        List<Contact> cons= im.getAllContacts();
        for(Contact c: cons){
            System.out.println(c);
        }
    }

}
