package com.davidodhiambo.controller;

import com.davidodhiambo.service.RegisterClaimService;
import entity.ClaimEntity;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterClaimServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        String claimDate = request.getParameter("claimDate");
        String claimAmount = request.getParameter("claimAmount");
        String description = request.getParameter("description");
        int approved = 0;
        int empId = Integer.parseInt(request.getParameter("empId"));


        ClaimEntity claim = new ClaimEntity();
        claim.setClaimDate(claimDate);
        claim.setClaimAmount(Integer.parseInt(claimAmount));
        claim.setDescription(description);
        claim.setApproved(false);
        claim.setEmpId(empId);

        RegisterClaimService registerClaimService = new RegisterClaimService();
        boolean result = registerClaimService.registerClaim(claim);
        if (result) {
            out.println("Claim registered successfully");
        } else {
            out.println("Claim registration failed");
        }
    }
}