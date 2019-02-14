/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ca.controller;

import com.ca.model.Contact;
import com.ca.util.ContactDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chiraran
 */
@WebServlet(name = "AddNewContact", urlPatterns = {"/AddNewContact"})
public class AddNewContact extends HttpServlet {

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Contact temp= new Contact();
        temp.setName(request.getParameter("name"));
        temp.setSurname(request.getParameter("surname"));
        temp.setCell(request.getParameter("cell"));
        temp.setEmail(request.getParameter("email"));
        ContactDAOImpl con= new ContactDAOImpl();
        con.insert(temp);
        System.out.println(temp);
        response.sendRedirect("index.jsp");
        
        
        

    }

}
