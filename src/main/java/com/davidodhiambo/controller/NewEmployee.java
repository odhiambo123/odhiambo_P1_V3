package com.davidodhiambo.controller;

import com.davidodhiambo.service.RegisterEmployeeService;
import entity.EmployeeEntity;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class NewEmployee extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String empName = request.getParameter("empName");
        String empEmail = request.getParameter("empEmail");
        String password = request.getParameter("password");
        int empl_Type = Integer.parseInt(request.getParameter("empl_Type"));

        EmployeeEntity employee = new EmployeeEntity();
        employee.setEmpName(empName);
        employee.setEmpEmail(empEmail);
        employee.setPassword(password);
        employee.setEmplType(empl_Type);

        RegisterEmployeeService registerEmployeeService = new RegisterEmployeeService();
        boolean result = registerEmployeeService.registerEmployee(employee);
        if (result) {
            response.sendRedirect("login.jsp");
        } else {
            response.sendRedirect("register.jsp");
        }

    }
    @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
