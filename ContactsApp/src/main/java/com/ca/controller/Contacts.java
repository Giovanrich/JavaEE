/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.controller;

import com.ca.model.Contact;
import com.ca.util.ContactDAOImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chiraran
 */
@WebServlet(name = "Contacts", urlPatterns = {"/Contacts"})
public class Contacts extends HttpServlet {

    public Contacts() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContactDAOImpl im = new ContactDAOImpl();
        List<Contact> contacts = im.getAllContacts();
        request.setAttribute("contactsList", contacts);
    }
}
