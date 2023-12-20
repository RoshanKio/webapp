package com.takeo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletGeneric extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<html><body><div style='text-align:center; background-color:green;'><h1>");
        out.println("Welcome from GenericServlet");
        out.println("</h1></div></body></html>");
    }

}