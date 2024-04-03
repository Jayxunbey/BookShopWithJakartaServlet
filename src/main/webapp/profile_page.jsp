<%--
  Created by IntelliJ IDEA.
  User: HPE
  Date: 2/11/2024
  Time: 2:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Book Store</title>
  <link rel="stylesheet" href="css/style_profile_page.css">
</head>
<body>
<div class="container">

  <div class="navbar">
    <div id="navbar-left-block">
      <div id="navbar-first-text" >Online Book Store</div>

      <div id="other-page-referals">
        <a style="text-decoration: none" href="${pageContext.request.contextPath}/download-books">
          <div class ="page-referals-block">
            Download books
          </div>
        </a>

        <div class ="page-referals-block-div" >
          |
        </div>
        <a style="text-decoration: none" href="${pageContext.request.contextPath}/upload-book">
          <div class ="page-referrals-block">
            Upload book
          </div>
        </a>
      </div>


    </div>



    <div id = "sign-right-block">

      <div id="user-name-navbar-photo">
        <img  width="35" height="35" style="border-radius: 50%;" src="imgs/user_512.png" alt="user_photo">
      </div>
      <div id="user-name-navbar-text"><%=session.getAttribute("username")%></div>
    </div>
  </div>

  <div class="container-body"  id="container-body">

    <div id="container-body-user-photo">
      <img  width="200" style="border-radius: 50%;" height="200" src="imgs/user_512.png" alt="user_photo">
    </div>

<%--    <div class="upload-photo">--%>
<%--      <form action="/profile-info/upload-photo" id="photo-form" method="post"></form>--%>

<%--      <label for="choose-photo" id="btn-choose-photo">--%>
<%--            <span id="choose-photo-btn-text-span">--%>
<%--              upload photo for avatar--%>
<%--            </span>--%>
<%--      </label>--%>

<%--      <input  id="choose-photo" oninput="document.getElementById('photo-form').submit()"--%>
<%--              style="display: none;" type="file" name="image"  accept="image/*" >--%>
<%--    </div>--%>

    <div class="container-body-user-names-block">
      <div class="container-body-user-name-block-caption">
        Username:
      </div>
      <div class="container-body-user-name-block-name">
          <%=session.getAttribute("username")%>
      </div>
    </div>
    <div class="container-body-user-names-block">
      <div class="container-body-user-name-block-caption">
        Email:
      </div>
      <div class="container-body-user-name-block-name">
          <%=session.getAttribute("email")%>
      </div>
    </div>

    <div class = "edit-button">
      <a href="${pageContext.request.requestURI}/logout" style="text-decoration: none">
        <h3>logout</h3>
      </a>
    </div>

  </div>



  <div class="footer">

    <div id="footer-created-by-jayxunbey">
      Created by Jayxunbey
    </div>

  </div>

</div>
<script src="js/js_profile_page.js"></script>
</body>
</html>
