
package com.ca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *@Created on Jan 12, 2019
 * @author chiraran (Giovanrich/JWizard)
 */

@Entity
@Table(name="contacts")
public class Contact {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String surname;
    private String cell;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", cell=" + cell + ", email=" + email + '}';
    }

    

   
    
    
    
}
