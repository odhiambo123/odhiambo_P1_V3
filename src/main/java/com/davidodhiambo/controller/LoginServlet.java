package com.davidodhiambo.controller;

import com.davidodhiambo.service.LoginService;
import entity.EmployeeEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String empEmail = request.getParameter("empEmail");
        String password = request.getParameter("password");
        LoginService loginService = new LoginService();
        boolean result = loginService.authenticateEmployee(empEmail, password);
        EmployeeEntity employee = LoginService.getEmployeeByEmail(empEmail);
        if (result) {
            HttpSession session = request.getSession();
            session.setAttribute("employee", employee);
            response.sendRedirect("home.jsp");
        } else {
            out.println("You are not a registered user");
        }
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
