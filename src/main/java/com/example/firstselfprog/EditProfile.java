package com.example.firstselfprog;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

public class EditProfile extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        resp.sendRedirect();
//        req.getRequestDispatcher(req."").forward(req,resp);
//
        System.out.println("\n\n");
        System.out.println("Do get ishladi");

        System.out.println("\n\n");

        System.out.println("req.getContextPath() = " + req.getContextPath());
        System.out.println("req.getMethod() = " + req.getMethod());
        System.out.println("req.getPathInfo() = " + req.getPathInfo());
        System.out.println("req.getPathTranslated() = " + req.getPathTranslated());
        System.out.println("req.getQueryString() = " + req.getQueryString());
        System.out.println("req.getRemoteUser() = " + req.getRemoteUser());
        System.out.println("req.getRequestedSessionId() = " + req.getRequestedSessionId());
        System.out.println("req.getRequestURI() = " + req.getRequestURI());
        System.out.println("req.getServletPath() = " + req.getServletPath());

        System.out.println("req.getContentType() = " + req.getContentType());
        System.out.println("req.getLocalName() = " + req.getLocalName());
        System.out.println("req.getRemoteAddr() = " + req.getRemoteAddr());
        System.out.println("req.getProtocol() = " + req.getProtocol());
        System.out.println("req.getServerName() = " + req.getServerName());
        System.out.println("req.isSecure() = " + req.isSecure());



        System.out.println("req.toString() = " + req.toString());

        resp.sendRedirect("/download-books");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
