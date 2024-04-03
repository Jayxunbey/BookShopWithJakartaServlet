<%--
  Created by IntelliJ IDEA.
  User: HPE
  Date: 2/11/2024
  Time: 2:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
  <meta charset="utf-8">
  <title>Book Store</title>
  <link rel="stylesheet" href="css/style_upload_page.css">
</head>
<body>
<div class="container">

  <div class="navbar">
    <div id="navbar-left-block">
      <div id="navbar-first-text" >Online Book Store</div>

<%--      <div id="other-page-referals">--%>
<%--        <div class ="page-referals-block">--%>
<%--          Download books--%>
<%--        </div>--%>

<%--        <div class ="page-referals-block-div" >--%>
<%--          |--%>
<%--        </div>--%>

<%--        <div class ="page-referals-block">--%>
<%--          Upload book--%>
<%--        </div>--%>

<%--      </div>--%>

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


    <a style="text-decoration: none" href="/profile-info">
    <div id = "sign-right-block">

      <div id="user-name-navbar-photo">
        <img  width="35" height="35" style="border-radius: 50%;" src="imgs/user_512.png" alt="user_photo">
      </div>
      <div id="user-name-navbar-text"><%=session.getAttribute("username")%></div>
    </div>
      </a>
  </div>
  <script src="js/js_upload_page.js"></script>

  <div class="container-body"  id="container-body">

    <div class="container-block">
      <h1>Contribute to the online book store Page</h1>
      <div class="container-block-body">
        <form class="container-upload-form" enctype="multipart/form-data" action="/upload-book" method="post">

          <div class="container-upload-form-input">
            <h4>Name: </h4>
            <input type="text" class="container-upload-form-input-place" name="name" placeholder="enter">
          </div>

          <div class="container-upload-form-input">
            <h4>Genre: </h4>
            <input type="text" class="container-upload-form-input-place" name="genre" placeholder="enter">
          </div>

          <div class="container-upload-form-input">
            <h4>Year: </h4>
            <input type="text" class="container-upload-form-input-place" name="year" placeholder="enter">
          </div>


          <div>
            <!--            <div id="choose-file-btn" >-->
            <label for="choose-file" id="btn-choose-file">
                          <span  id="choose-file-btn-text-span">
                              Upload your books
                          </span>
            </label>
            <input id="choose-file" oninput='change_name_file(this.files[0].name,"choose-file-btn-text-span")'
                   style="display: none;" type="file" name="file"  accept=".pdf" >
            <!--            </div>-->


          </div>
          <div>
            <label for="choose-photo" id="btn-choose-photo">
                        <span id="choose-photo-btn-text-span">
                            Upload photo for this book
                        </span>
            </label>
            <input  id="choose-photo" oninput='change_name_file(this.files[0].name,"choose-photo-btn-text-span")'
                    style="display: none;" type="file" name="image"  accept="image/*" >

            <div id="submit-btn-div">
              <button id="submit-btn" type="submit" name="submit">Add</button>
            </div>
          </div>
        </form>
      </div>
    </div>

    <div id = "succes-body">
      <div id="succes-body-text">
        <h1>
          Your book Succesfully Uploaded and Added
        </h1>
      </div>
      <div onmouseover="change_succes_button_color(1)" onmouseout="change_succes_button_color(0)" id = 'succes-body-goto-body'>
        Goto main page
      </div>
    </div>


  </div>

  <div class="footer">

    <div id="footer-created-by-jayxunbey">
      Created by Jayxunbey
    </div>

  </div>

</div>

<script src="scriptjs.js" ></script>
</body>
</html>

