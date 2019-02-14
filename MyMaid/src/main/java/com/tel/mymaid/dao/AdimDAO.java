package com.tel.mymaid.dao;

import com.tel.mymaid.model.Admin;

/**
 * @Created on Nov 29, 2018
 * @author chiraran (Giovanrich/JWizard)
 */
public interface AdimDAO {

    public Admin getMaid(String suername);

    public boolean insertAdmin(Admin admin);

    public boolean updateAdmin(String username);

    public boolean deleteMAdmin(String suernane);
}
