package com.jspcrud.dao;

import com.jspcrud.domain.User;
import java.util.List;

/**
 * @Created on Feb 13, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public interface UserDao {

    public void addUser(User user);

    public void deleteUser(int userId);

    public void updateUser(User user);

    public List<User> getAllUsers();

    public User getUserById(int userId);

}
