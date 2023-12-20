package com.takeo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletConfig;

public class MainServlet implements Servlet {

    public void init(ServletConfig config) throws ServletException {
        System.out.println("Initializing the Servlet object");
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<html><body><div style='text-align:center; background-color:aqua;'><h1>");
        out.println("Welcome from Servlet");
        out.println("</h1></div></body></html>");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public String getServletInfo() {
        return "From getServletInfo() method";
    }

    public void destroy() {
        System.out.println("Destroying the Servlet object");
    }
}