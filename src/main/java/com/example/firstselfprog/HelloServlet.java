package com.example.firstselfprog;

import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Hello_Servlet", value = "/show")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");

//        HttpSession session = req.getSession();

        Enumeration<String> parameterNames = req.getParameterNames();
        System.out.println("Showdagi req");
        while (parameterNames.hasMoreElements()) {
            System.out.println(parameterNames.nextElement());
        }

        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("email"));
        System.out.println(req.getParameter("new_password"));
        System.out.println(req.getParameter("current_password"));

        System.out.println("req.getRequestedSessionId() = " + req.getRequestedSessionId());

        System.out.println("req.getContextPath() = " + req.getContextPath());
        System.out.println("req.getMethod() = " + req.getMethod());
        System.out.println("req.getPathInfo() = " + req.getPathInfo());
        System.out.println("req.getPathTranslated() = " + req.getPathTranslated());
        System.out.println("req.getQueryString() = " + req.getQueryString());
        System.out.println("req.getRemoteUser() = " + req.getRemoteUser());
        System.out.println("req.getRequestURI() = " + req.getRequestURI());
        System.out.println("req.getServletPath() = " + req.getServletPath());

        System.out.println("req.getContentType() = " + req.getContentType());
        System.out.println("req.getLocalName() = " + req.getLocalName());
        System.out.println("req.getRemoteAddr() = " + req.getRemoteAddr());
        System.out.println("req.getProtocol() = " + req.getProtocol());
        System.out.println("req.getServerName() = " + req.getServerName());
        System.out.println("req.isSecure() = " + req.isSecure());


        HttpSession session = req.getSession();

        Enumeration<String> attributeNames = session.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            System.out.println("attributeNames.nextElement() = " + attributeNames.nextElement());
        }

        System.out.println("req.toString() = " + req.toString());

        
        writer.println("Username: "+(String)session.getAttribute("username"));
        writer.println("Password: "+(String)session.getAttribute("password"));

    }
    public void destroy() {
    }

}