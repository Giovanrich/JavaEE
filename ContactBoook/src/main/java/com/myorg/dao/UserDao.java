package com.myorg.dao;

import com.myorg.domain.User;

/**
 * @Created on Feb 14, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public interface UserDao {

    public User getUser(String username, String password);

}
