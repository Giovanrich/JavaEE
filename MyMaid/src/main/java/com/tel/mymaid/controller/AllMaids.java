/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tel.mymaid.controller;

import com.tel.mymaid.daoimpl.MaidDataInterfaceObject;
import com.tel.mymaid.model.Maid;
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
@WebServlet(name = "list", urlPatterns = {"/list"})
public class AllMaids extends HttpServlet {



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        MaidDataInterfaceObject md= new MaidDataInterfaceObject();
        List<Maid> maids= md.getAllMaids();
        request.setAttribute("maids",maids);
        request.getRequestDispatcher("mymaid/maids.jsp").forward(request, response);     
    }



}
