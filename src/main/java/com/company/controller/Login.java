/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.controller;

import com.company.dao.MembersDao;
import com.company.dto.Members;
import com.company.services.LoginService;
import java.io.IOException;

import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anumey
 */
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       System.out.println(" Inside login");
       
        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        
        LoginService loginService = new LoginService();
        boolean auth = loginService.authenticateUsers(password, Integer.parseInt(userId));
        System.out.println( "passowrd == "+password +" id== "+userId + "auth == "+auth);
        if(auth){
            MembersDao memberDao = new MembersDao();
            ArrayList<Members> memeberList = memberDao.getMembers();
            
            request.setAttribute("memberList", memeberList);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("companyDetails.jsp");
            requestDispatcher.forward(request, response);
        }else{
            response.sendRedirect("login.jsp");
        }
        
    }

 
}
