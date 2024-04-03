function show_login_blocks(){
    let sign_up_navbar=document.getElementById("sign-up-navbar");
    let sign_up_form=document.getElementById("sign-up-form");

    let log_in_navbar= document.getElementById("log-in-navbar");
    let log_in_form = document.getElementById("log-in-form");



    log_in_navbar.style.display = "none";
    sign_up_navbar.style.display = "block";

    sign_up_form.style.display = "none";
    log_in_form.style.display = "flex";

}

function show_sign_blocks(){
    let sign_up_navbar=document.getElementById("sign-up-navbar");
    let sign_up_form=document.getElementById("sign-up-form");

    let log_in_navbar= document.getElementById("log-in-navbar");
    let log_in_form = document.getElementById("log-in-form");



    log_in_navbar.style.display = "block";
    sign_up_navbar.style.display = "none";

    sign_up_form.style.display = "flex";
    log_in_form.style.display = "none";

}