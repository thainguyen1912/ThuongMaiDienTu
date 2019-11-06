<%-- 
    Document   : header
    Created on : Nov 5, 2019, 10:08:39 PM
    Author     : thain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header class="header">
    <div class="header_overlay"></div>
    <div class="header_content d-flex flex-row align-items-center justify-content-start">
        <div class="logo">
            <a href="#">
                <div class="d-flex flex-row align-items-center justify-content-start">
                    <div><img src="resources/home_page/images/logo_1.png" alt=""></div>
                    <div>Điện Tử TN</div>
                </div>
            </a>	
        </div>
        <div class="hamburger"><i class="fa fa-bars" aria-hidden="true"></i></div>
        <nav class="main_nav">
            <ul class="d-flex flex-row align-items-start justify-content-start">
                <li class="active"><a href="#">Trang Chủ</a></li>
                <li class=""><a href="#">Laptop</a></li>
                <li><a href="#">SmartPhone</a></li>
                <li><a href="#">TiVi</a></li>
                <li><a href="#">Máy Ảnh</a></li>
            </ul>
        </nav>
        <div class="header_right d-flex flex-row align-items-center justify-content-start ml-auto">
            <!-- Search -->
            <div class="header_search">
                <form action="#" id="header_search_form">
                    <input type="text" class="search_input" placeholder="Tìm Kiếm " required="required">
                    <button class="header_search_button"><img src="resources/home_page/images/search.png" alt=""></button>
                </form>
            </div>
            <!-- Login -->
            <div class="user"><a href="AdminPage?key=category"><div><img src="resources/home_page/images/login.svg" alt="https://www.flaticon.com/authors/freepik"></div></a></div>
            <!-- User -->
            <div class="user"><a href="#"><div><img src="resources/home_page/images/user1.svg" alt="https://www.flaticon.com/authors/freepik"></div></a></div>
            <!-- Cart -->
            <div class="cart"><a href="cart.html"><div><img class="svg" src="resources/home_page/images/cart.svg" alt="https://www.flaticon.com/authors/freepik"></div></a></div>
            <!-- Phone -->
            <div class="header_phone d-flex flex-row align-items-center justify-content-start">
                <div><div><img src="resources/home_page/images/phone.svg" alt="https://www.flaticon.com/authors/freepik"></div></div>
                <div>0123456789</div>
            </div>
        </div>
    </div>
</header>
