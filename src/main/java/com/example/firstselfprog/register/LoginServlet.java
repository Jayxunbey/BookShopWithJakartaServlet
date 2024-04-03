package com.example.firstselfprog.register;

import com.example.firstselfprog.database.DatabaseService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("req.getParameter(\"username\") = " + req.getParameter("username"));
        System.out.println("req.getParameter(\"email\") = " + req.getParameter("email"));
        System.out.println("req.getParameter(\"password\") = " + req.getParameter("password"));
        System.out.println("req.getParameter(\"current_password\") = " + req.getParameter("current_password"));


        boolean isRegistered = DatabaseService.checkUser(req.getParameter("email"), req.getParameter("password"));

        if (isRegistered){

           String username = DatabaseService.getUserName(req.getParameter("email"), req.getParameter("password"));

            HttpSession session = req.getSession();
            session.setAttribute("username",username);
            session.setAttribute("email",req.getParameter("email"));
            resp.sendRedirect("download-books");
        }

    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
