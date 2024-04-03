package com.example.firstselfprog;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


public class DownloadBook extends HttpServlet {

    @Override
    public void destroy() {
        System.out.println("Destroy ishladi");
    }

    //    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//
//    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("\n\n");
        System.out.println("Do get ishladi");

        Enumeration<String> parameterNames = req.getParameterNames();

        System.out.println("\n\n");
        while (parameterNames.hasMoreElements()) {
            System.out.println(parameterNames.nextElement());
        }

        System.out.println("\n\n");

        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("email"));
        System.out.println(req.getParameter("new_password"));
        System.out.println(req.getParameter("current_password"));

        System.out.println("\n\n");

//        System.out.println("req.changeSessionId() = " + req.changeSessionId());
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


        Enumeration<String> attributeNames = req.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            System.out.println("attributeNames.nextElement() = " + attributeNames.nextElement());
        }


        System.out.println("req.toString() = " + req.toString());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/main_page.jsp");
        requestDispatcher.include(req,resp);




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Do Post ishladi");
        Enumeration<String> parameterNames = req.getParameterNames();

        System.out.println("\n\n");
        while (parameterNames.hasMoreElements()) {
            System.out.println(parameterNames.nextElement());
        }

        System.out.println("\n\n");

        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("email"));
        System.out.println(req.getParameter("new_password"));
        System.out.println(req.getParameter("current_password"));

        System.out.println("\n\n");

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



        Enumeration<String> attributeNames = req.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            System.out.println("attributeNames.nextElement() = " + attributeNames.nextElement());
        }

        System.out.println("req.toString() = " + req.toString());
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("upload-book");
//        requestDispatcher.forward(req,resp);

//        resp.sendRedirect("upload-book");


        String userName = req.getParameter("username");
        String password = req.getParameter("new_password");

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");

        if (userName !=null && !userName.isEmpty() && password !=null && !password.isEmpty()){

            writer.println("""
                    Succesfully added your data
                    
                    <a href = "show" method = get > show my data</a>
                    """);
            writer.close();

            HttpSession session = req.getSession();
            session.setAttribute("username", userName);
            session.setAttribute("password", password);

        }else {
            writer.println("You must enter both username and password");}
            writer.close();

    }
}
