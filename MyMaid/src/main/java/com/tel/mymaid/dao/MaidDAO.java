package com.tel.mymaid.dao;

import com.tel.mymaid.model.Maid;
import java.util.List;

/**
 * @Created on Nov 29, 2018
 * @author chiraran (Giovanrich/JWizard)
 */
public interface MaidDAO {

    public List<Maid> getAllMaids();

    public Maid getMaid(String natID);

    public boolean insertMaid(Maid maid);

    public boolean updateMaid(String natID);

    public boolean deleteMaid(String natID);
    public boolean login(String username, String password);

}
