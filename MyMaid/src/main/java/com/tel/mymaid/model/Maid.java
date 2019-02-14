
package com.tel.mymaid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *@Created on Nov 29, 2018
 * @author chiraran (Giovanrich/JWizard)
 */

@Entity@Table(name = "maids")
public class Maid {
    
    @Id
    @GeneratedValue
    private Long id;
    private String natID;
    private String name;
    private String surname;    
    private String address;
    private String cell;
    private String email;
    private String education;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNatID() {
        return natID;
    }

    public void setNatID(String natID) {
        this.natID = natID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Maid{" + "id=" + id + ", natID=" + natID + ", name=" + name + ", surname=" + surname + ", address=" + address + ", cell=" + cell + ", email=" + email + ", education=" + education + '}';
    }
    

}
