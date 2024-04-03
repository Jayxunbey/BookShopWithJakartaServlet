package com.example.firstselfprog;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;


@MultipartConfig
public class UploadBook extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("upload_page.jsp").include(req,resp);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        final Path path = Path.of("");


        System.out.println("req.getParameter(\"name\") = " + req.getParameter("name"));
        System.out.println("req.getParameter(\"genre\") = " + req.getParameter("genre"));
        System.out.println("req.getParameter(\"year\") = " + req.getParameter("year"));

        Part file = req.getPart("file");
        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.getSize() = " + file.getSize());

        System.out.println("file.getSubmittedFileName() = " + file.getSubmittedFileName());

        InputStream inputStream = file.getInputStream();

        Files.write(path.resolve(file.getSubmittedFileName()),inputStream.readAllBytes(),StandardOpenOption.CREATE_NEW);

        System.out.println("\n\n");
        Part image = req.getPart("image");
        System.out.println("image.getName() = " + image.getName());
        System.out.println("image.getSubmittedFileName() = " + image.getSubmittedFileName());
        System.out.println("image.getSize() = " + image.getSize());

        InputStream inputStreamImg = image.getInputStream();

        Files.write(path.resolve(image.getSubmittedFileName()),inputStreamImg.readAllBytes(),StandardOpenOption.CREATE_NEW);




    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
