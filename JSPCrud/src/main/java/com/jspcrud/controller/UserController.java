/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jspcrud.controller;

import com.jspcrud.domain.User;
import com.jspcrud.impl.UserDaoImpl;
import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author chiraran
 */
public class UserController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static final String INSERT_OR_EDIT = "/user.jsp";
    private static final String LIST_USER = "/listUser.jsp";
    private UserDaoImpl ui = new UserDaoImpl();

    public UserController() {
        super();
        //dao = new UserDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            int userId = Integer.parseInt(request.getParameter("userId"));
            ui.deleteUser(userId);
            forward = LIST_USER;
            request.setAttribute("users", ui.getAllUsers());
        } else if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            int userId = Integer.parseInt(request.getParameter("userId"));
            User user = ui.getUserById(userId);
            request.setAttribute("user", user);

        } else if (action.equalsIgnoreCase("listUser")) {
            forward = LIST_USER;
            request.setAttribute("users", ui.getAllUsers());

        } else {
            forward = INSERT_OR_EDIT;
        }
        
        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));
        user.setDob(new Date(request.getParameter("dob")));
        user.setEmail(request.getParameter("email"));
        String userid = request.getParameter("userid");
        if (userid == null || userid.isEmpty()) {
            ui.addUser(user);
        } else {
            user.setUserid(Integer.parseInt(userid));
            ui.updateUser(user);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("users", ui.getAllUsers());
        view.forward(request, response);

    }
}
