package com.tel.mymaid.daoimpl;

import com.tel.mymaid.dao.MaidDAO;
import com.tel.mymaid.model.Maid;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @Created on Dec 4, 2018
 * @author chiraran (Giovanrich/JWizard)
 */
public class MaidDataInterfaceObject implements MaidDAO {

    @Override
    public List<Maid> getAllMaids() {
        List<Maid> maids = null;
        Configuration conf = new Configuration().configure().addAnnotatedClass(Maid.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tr = null;
        try {
            tr = session.beginTransaction();
            Query selectAllQuerry = session.createQuery("from Maid");
            maids = selectAllQuerry.list();
            sf.close();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tr != null) {
                tr.rollback();
            }
        }
        return maids;
    }

    @Override
    public Maid getMaid(String natID) {
        Maid maid= new Maid();
        Configuration conf = new Configuration().configure().addAnnotatedClass(Maid.class);
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Query query = session.createQuery("from Maid where natID="+natID);
        try {
            session.beginTransaction();
            maid = (Maid) query.uniqueResult();
            sf.close();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        } 
        return maid;
    }

    @Override
    public boolean insertMaid(Maid maid) {
        boolean status = false;
        Transaction tx = null;
        Session session = null;
        try {
            Configuration con = new Configuration().configure().addAnnotatedClass(Maid.class);
            SessionFactory sf = con.buildSessionFactory();
            session = sf.openSession();
            tx = session.beginTransaction();
            session.save(maid);
            tx.commit();
            sf.close();
            status = true;
        } catch (HibernateException e) {
            e.printStackTrace();
        } 

        return false;
    }

    @Override
    public boolean updateMaid(String natID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteMaid(String natID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean login(String email, String password) {
        boolean status=false;
        Maid temp=null;
        Configuration conf=new Configuration().configure().addAnnotatedClass(Maid.class);
        SessionFactory sf= conf.buildSessionFactory();
        Session session=sf.openSession();
        String select= "FROM Maid WHERE email=:email AND password=:password";
        Query query=session.createQuery(select);
        query.setParameter("email", email);
        query.setParameter("password", password);
        
        try {
            session.beginTransaction();
            temp=(Maid)query.uniqueResult();
            if(temp!=null){
                System.out.println("Found user.."+temp);
                status=true;
            }
        } catch (Exception e) {
        }    
        
        return status;
    }

}
