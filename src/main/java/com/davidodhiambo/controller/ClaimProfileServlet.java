package com.davidodhiambo.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ClaimProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("header1.html").include(request, response);

        out.println("<h1>Claim Profile Page</h1>");
        out.println("<form action='claim' method='post'>");
        out.println("<table>");
        out.println("<tr><td>First Name:</td><td><input type='text' name='firstName'/></td></tr>");
        out.println("<tr><td>Last Name:</td><td><input type='text' name='lastName'/></td></tr>");
        out.println("<tr><td>Email:</td><td><input type='text' name='email'/></td></tr>");
        //claim id
        out.println("<tr><td>Claim ID:</td><td><input type='text' name='claimId'/></td></tr>");
        //claim date
        out.println("<tr><td>Claim Date:</td><td><input type='text' name='claimDate'/></td></tr>");
        //claim amount
        out.println("<tr><td>Claim Amount:</td><td><input type='text' name='claimAmount'/></td></tr>");
        //claim status
        out.println("<tr><td>Claim Status:</td><td><input type='text' name='claimStatus'/></td></tr>");
        //claim description
        out.println("<tr><td>Claim Description:</td><td><input type='text' name='claimDescription'/></td></tr>");


        out.println("<tr><td colspan='2'><input type='submit' value='Claim'/></td></tr>");
        out.println("</table>");
        out.println("</form>");
        request.getRequestDispatcher("footer.html").include(request, response);
        out.close();


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);



    }
}
