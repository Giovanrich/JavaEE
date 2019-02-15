/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myorg.controller;

import com.myorg.domain.Contact;
import com.myorg.impl.ContactDAOImpl;
import com.myorg.impl.UserDAOImpl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chiraran
 */
public class ContactController extends HttpServlet {

    private static final String HOME = "/home.jsp";
    private static final String EDIT = "/edit.jsp";
    private static final String NEW = "/addcontact.jsp";
    private static final String LOGOUT = "/index.jsp";
    private ContactDAOImpl im = ContactDAOImpl.getInstance();
    private UserDAOImpl ui = UserDAOImpl.getInstance();

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
        if (action.equalsIgnoreCase("edit")) {
            forward = EDIT;
            int contactId = Integer.parseInt(request.getParameter("contactId"));
            Contact contact = im.getContact(contactId);
            request.setAttribute("contact", contact);
        } else if (action.equalsIgnoreCase("home")) {
            //processing Cancel on the Add/Edit User page
            forward = HOME;
            request.setAttribute("contacts", im.getContacts());
        } else if (action.equalsIgnoreCase("new")) {
            //Add new contact
            forward = NEW;
            //request.setAttribute("contact", new Contact());
        } else if (action.equalsIgnoreCase("delete")) {
            //Add new contact
            forward = HOME;
            im.delete(Integer.parseInt(request.getParameter("contactId")));
            request.setAttribute("contacts", im.getContacts());
        } else if (action.equalsIgnoreCase("logout")) {
            //logout
            forward = LOGOUT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

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

        String action = request.getParameter("action");

        Contact contact = new Contact();
        contact.setfName(request.getParameter("name"));
        contact.setlName(request.getParameter("surname"));
        contact.setEmail(request.getParameter("email"));
        contact.setPhone(request.getParameter("phone"));

        if (action.equalsIgnoreCase("update")) {
            contact.setId(Integer.parseInt(request.getParameter("id")));
            im.update(contact);
        } else if (action.equalsIgnoreCase("add")) {

            im.save(contact);
        } else if (action.equalsIgnoreCase("login")) {

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            //Here that is where hashing can be done        
            if (ui.getUser(username, password) != null) {
                String forward = HOME;
                request.setAttribute("contacts", im.getContacts());
                RequestDispatcher view = request.getRequestDispatcher(forward);
                view.forward(request, response);
            }
        }

        //Where to go?
        RequestDispatcher view = request.getRequestDispatcher(HOME);
        request.setAttribute("contacts", im.getContacts());
        view.forward(request, response);

    }

}
