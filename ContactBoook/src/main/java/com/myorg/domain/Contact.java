
package com.myorg.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *@Created on Feb 14, 2019
 *@author chiraran (Giovanrich/JWizard)
 */

@Entity
@Table(name="contacts")
public class Contact implements Serializable{
    
    
    @Id
    @GeneratedValue
    private int id;
    private String fName;
    private String lName;
    private String email;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", phone=" + phone + '}';
    }

}
