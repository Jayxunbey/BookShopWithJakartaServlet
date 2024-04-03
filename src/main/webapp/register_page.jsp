<%@ page contentType="text/html; charset=UTF-8" errorPage="error_page.jsp" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="utf-8">
    <title>Book Store</title>
    <link rel="stylesheet" href="css/style_login.css">
</head>
<body>
<div class="container">

    <div class="navbar">
        <div id="navbar-login-text">
            Online Book Store
        </div>
        <div id = "sign-right-block">

            <div onclick="show_login_blocks()" id="log-in-navbar" >
                log in
            </div>

            <div onclick="show_sign_blocks()" id="sign-up-navbar" >
                sign up
            </div>
        </div>
    </div>

    <script src="js/login_js.js"></script>

    <div class="container-body">

        <div id="sign-forms">

            <form id="sign-up-form" action="${pageContext.request.contextPath}/sign-up" method="post">
                <div>
                    <h1>Sign up</h1>
                </div>
                <div id="input-values-block-sign">
                    <label>
                        <input class="input-form" type="text" name="username" placeholder="Username">
                    </label>
                    <label>
                        <input class="input-form" type="email" name="email" placeholder="Email">
                    </label>
                    <label>
                        <input class="input-form" type="password" name="new_password" placeholder="Password">
                    </label>
                    <label>
                        <input class="input-form" type="password" name="current_password" placeholder="Repeat password">
                    </label>
                    <input type="submit" id="subm-btn-form-sign" name="submit" value="sigup">

                </div>
            </form>


            <form id="log-in-form" action="${pageContext.request.contextPath}/login" method="post">
                <div>
                    <h1>Log in</h1>
                </div>
                <div id="input-values-block-login">
                    <label>
                        <input class="input-form" type="email" name="email" placeholder="Your Email Address">
                    </label>
                    <label>
                        <input class="input-form" type="password" name="password" placeholder="Password">
                    </label>
                    <input type="submit" id="subm-btn-form-login" name="submit" value="login">

                </div>
            </form>

        </div>



    </div>

    <div class="footer">

        <div id="footer-created-by-jayxunbey">
            Created by Jayxunbey
        </div>

    </div>

</div>
</body>
</html>
