
package com.jspcrud.util;

import com.jspcrud.domain.User;
import com.jspcrud.impl.UserDaoImpl;
import java.util.Date;

/**
 *@Created on Feb 13, 2019
 *@author chiraran (Giovanrich/JWizard)
 */
public class Test {
    public static void main(String[] args) {
        User u1=new User();
        u1.setFirstName("Nation");
        u1.setLastName("Chirara");
        u1.setEmail("dfgdf@gmail.com");
        u1.setDob(new Date());
        
        UserDaoImpl ui= new UserDaoImpl();
        System.out.println(ui.getUserById(4));
    }
}
