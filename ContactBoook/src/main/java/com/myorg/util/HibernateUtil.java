package com.myorg.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @Created on Feb 14, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            //Configuration cfg = new Configuration().configure().addAnnotatedClass(Contact.class);
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
            sessionFactory = cfg.buildSessionFactory();
        }
        return HibernateUtil.sessionFactory;
    }

}
