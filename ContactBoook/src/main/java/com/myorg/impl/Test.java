
package com.myorg.impl;

import com.myorg.domain.Contact;

/**
 *@Created on Feb 14, 2019
 *@author chiraran (Giovanrich/JWizard)
 */
public class Test {
    public static void main(String[] args) {
        Contact c= new Contact();
        ContactDAOImpl im= ContactDAOImpl.getInstance();
        c.setEmail("chiraranw@gmail.com");
        c.setPhone("777777");
        c.setfName("Nation");
        c.setlName("Chirara");
       
        System.out.println("btrththtrhtt "+im.save(c));
    }

}
