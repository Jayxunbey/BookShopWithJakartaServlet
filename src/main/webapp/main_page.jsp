<%--
  Created by IntelliJ IDEA.
  User: HPE
  Date: 2/11/2024
  Time: 2:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <title>Book Store</title>
    <link rel="stylesheet" href="css/style_main_page.css">
</head>
<body>
<div class="container">

    <div class="navbar">
        <div id="navbar-left-block">
            <div id="navbar-first-text" >Online Book Store</div>

            <div id="other-page-referals">
                <a style="text-decoration: none" href="/download-books">
                    <div class ="page-referals-block">
                        Download books
                    </div>
                </a>

                <div class ="page-referals-block-div" >
                    |
                </div>
                <a style="text-decoration: none" href="/upload-book">
                    <div class ="page-referals-block">
                        Upload book
                    </div>
                </a>
            </div>


        </div>



        <a style="text-decoration: none" href="${pageContext.request.contextPath}/profile-info">
        <div id = "sign-right-block">

            <div id="user-name-navbar-photo">
                <img  width="35" height="35" style="border-radius: 50%;" src="imgs/user_512.png" alt="user_photo">
            </div>
            <div id="user-name-navbar-text"><%=session.getAttribute("username")%></div>
        </div>
        </a>
    </div>


    <div class="container-body" id="container-body">

        <div class="books-block" id="books-block">

            <div class="books-block-book-body">
                <div class="books-block-book-body-info">
                    <div class="books-block-book-body-block-img">
                        <img class="books-block-book-body-block-img-value" src="https://i.ibb.co/xjRTnJ6/book.jpg"  alt="book photo" >
                    </div>
                    <div class="books-block-book-body-about">
                        <div>
                            <h4 class="books-block-book-body-about-name">Name:</h4>
                            <h4 class="books-block-book-body-about-genre">Genre:</h4>
                            <h4 class="books-block-book-body-about-year">Year:</h4>
                        </div>
                        <div>
                            <p class="books-block-book-body-about-name-value">Atom Odatlar</p>
                            <p class="books-block-book-body-about-genre-value">Ilmlar</p>
                            <p class="books-block-book-body-about-year-value">2016</p>
                        </div>
                    </div>
                </div>
                <div class="books-block-book-body-down" onclick='backgroundColor = red'>
                    Click for Download
                </div>
            </div>





        </div>

    </div>

    <div class="footer">

        <div id="footer-created-by-jayxunbey">
            Created by Jayxunbey
        </div>

    </div>

    <script src="js/js_main_page.js"></script>

</div>
</body>
</html>
