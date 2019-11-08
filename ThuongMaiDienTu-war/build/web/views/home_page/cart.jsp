<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="entity.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Product pro=(Product)request.getAttribute("product");
    List<Product> list_cart=new ArrayList<>();
    list_cart.add(pro);
    ServletContext ct=getServletContext();
    ct.setAttribute("list_cart", list_cart);
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Thương Mại Điện Tử</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Little Closet template">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="resources/home_page/styles/bootstrap-4.1.2/bootstrap.min.css">
        <link href="resources/home_page/plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="resources/home_page/styles/cart.css">
        <link rel="stylesheet" type="text/css" href="resources/home_page/styles/cart_responsive.css">
    </head>
    <body>
        <div class="menu">
            <jsp:include page="home_resources/menuhide.jsp" flush="true" />
        </div>
        <div class="super_container">
            <jsp:include page="home_resources/header.jsp" flush="true" />
            <div class="super_container_inner">
                <div class="super_overlay"></div>
                <!-- Home -->
                <div class="home">
                    <div class="home_container d-flex flex-column align-items-center justify-content-end">
                        <div class="home_content text-center">
                            <div class="home_title">Giỏ Hàng</div>
                            <div class="breadcrumbs d-flex flex-column align-items-center justify-content-center">
                                <ul class="d-flex flex-row align-items-start justify-content-start text-center">
                                    <li><a href="#">Trang Chủ</a></li>
                                    <li>Giỏ Hàng</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Cart -->
                <div class="cart_section">
                    <div class="container">
                        <div class="row">
                            <div class="col">
                                <div class="cart_container">
                                    <!-- Cart Bar -->
                                    <div class="cart_bar">
                                        <ul class="cart_bar_list item_list d-flex flex-row align-items-center justify-content-end">
                                            <li class="mr-auto">Sản Phẩm</li>
                                            <li style="width: auto;margin-right: 6.5%;">Đặc Điểm</li>
                                            <li style="width: auto;margin-right: 7.5%;">Giá</li>
                                            <li style="width: auto">Số Lượng</li>
                                            <li style="width: auto">Tổng Tiền</li>
                                        </ul>
                                    </div>
                                    <!-- Cart Items -->
                                    <div class="cart_items">
                                        <ul class="cart_items_list">
                                            <!-- Cart Item -->
                                            <li class="cart_item item_list d-flex flex-lg-row flex-column align-items-lg-center align-items-start justify-content-lg-end justify-content-start">
                                                <div class="product d-flex flex-lg-row flex-column align-items-lg-center align-items-start justify-content-start mr-auto">
                                                    <div><div class="product_number">1</div></div>
                                                    <div><div class="product_image"><img src="resources/home_page/images/product/<%=pro.getProductimage() %>" alt=""></div></div>
                                                    <div class="product_name_container">
                                                        <div class="product_name"><a href="product.html"><%=pro.getProductname() %></a></div>
                                                        <div class="product_text">Second line for additional info</div>
                                                    </div>
                                                </div>
                                                <div class="product_color product_text"><%=pro.getMoreinfo() %></div>
                                                <div class="product_price product_text"><%=pro.getPriceoutput()%> vnđ</div>
                                                <div class="product_quantity_container">
                                                    <div class="product_quantity ml-lg-auto mr-lg-auto text-center">
                                                        <span class="product_text product_num">1</span>
                                                        <div class="qty_sub qty_button trans_200 text-center"><span>-</span></div>
                                                        <div class="qty_add qty_button trans_200 text-center"><span>+</span></div>
                                                    </div>
                                                </div>
                                                <div class="product_total product_text"><%=pro.getPriceoutput()%> vnđ</div>
                                            </li>
                                        </ul>
                                    </div>
                                    <!-- Cart Buttons -->
                                    <div class="cart_buttons d-flex flex-row align-items-start justify-content-start">
                                        <div class="cart_buttons_inner ml-sm-auto d-flex flex-row align-items-start justify-content-start flex-wrap">
                                            <div class="button button_clear trans_200"><a href="categories.html">Xóa Bỏ</a></div>
                                            <div class="button button_continue trans_200"><a href="categories.html">Thêm Sản Phẩm</a></div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row cart_extra_row">
                            <div class="col-lg-6">
                                <div class="cart_extra cart_extra_1">
                                    <div class="cart_extra_content cart_extra_coupon">
                                        <div class="cart_extra_title">Mã Giảm Giá</div>
                                        <div class="coupon_form_container">
                                            <form action="#" id="coupon_form" class="coupon_form">
                                                <input type="text" class="coupon_input" required="required">
                                                <button class="coupon_button">Áp Dụng</button>
                                            </form>
                                        </div>
                                        <div class="coupon_text">Phasellus sit amet nunc eros. Sed nec congue tellus. Aenean nulla nisl, volutpat blandit lorem ut.</div>
                                        <div class="shipping">
                                            <div class="cart_extra_title">Cách Thức Vận Chuyển</div>
                                            <ul>
                                                <li class="shipping_option d-flex flex-row align-items-center justify-content-start">
                                                    <label class="radio_container">
                                                        <input type="radio" id="radio_1" name="shipping_radio" class="shipping_radio">
                                                        <span class="radio_mark"></span>
                                                        <span class="radio_text">Next day delivery</span>
                                                    </label>
                                                    <div class="shipping_price ml-auto">$4.99</div>
                                                </li>
                                                <li class="shipping_option d-flex flex-row align-items-center justify-content-start">
                                                    <label class="radio_container">
                                                        <input type="radio" id="radio_2" name="shipping_radio" class="shipping_radio">
                                                        <span class="radio_mark"></span>
                                                        <span class="radio_text">Standard delivery</span>
                                                    </label>
                                                    <div class="shipping_price ml-auto">$1.99</div>
                                                </li>
                                                <li class="shipping_option d-flex flex-row align-items-center justify-content-start">
                                                    <label class="radio_container">
                                                        <input type="radio" id="radio_3" name="shipping_radio" class="shipping_radio" checked>
                                                        <span class="radio_mark"></span>
                                                        <span class="radio_text">Personal Pickup</span>
                                                    </label>
                                                    <div class="shipping_price ml-auto">Free</div>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 cart_extra_col">
                                <div class="cart_extra cart_extra_2">
                                    <div class="cart_extra_content cart_extra_total">
                                        <div class="cart_extra_title">Tổng Tiền</div>
                                        <ul class="cart_extra_total_list">
                                            <li class="d-flex flex-row align-items-center justify-content-start">
                                                <div class="cart_extra_total_title">Tổng Tiền Ban Đầu</div>
                                                <div class="cart_extra_total_value ml-auto">$29.90</div>
                                            </li>
                                            <li class="d-flex flex-row align-items-center justify-content-start">
                                                <div class="cart_extra_total_title">Vận Chuyển</div>
                                                <div class="cart_extra_total_value ml-auto">Free</div>
                                            </li>
                                            <li class="d-flex flex-row align-items-center justify-content-start">
                                                <div class="cart_extra_total_title">Tổng Tiền Sau Cùng</div>
                                                <div class="cart_extra_total_value ml-auto">$29.90</div>
                                            </li>
                                        </ul>
                                        <div class="checkout_button trans_200"><a href="Checkout">Thanh Toán</a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Footer -->
                <jsp:include page="home_resources/footer.jsp" flush="true" />
            </div>
        </div>
        <script src="resources/home_page/js/jquery-3.2.1.min.js"></script>
        <script src="resources/home_page/styles/bootstrap-4.1.2/popper.js"></script>
        <script src="resources/home_page/styles/bootstrap-4.1.2/bootstrap.min.js"></script>
        <script src="resources/home_page/plugins/greensock/TweenMax.min.js"></script>
        <script src="resources/home_page/plugins/greensock/TimelineMax.min.js"></script>
        <script src="resources/home_page/plugins/scrollmagic/ScrollMagic.min.js"></script>
        <script src="resources/home_page/plugins/greensock/animation.gsap.min.js"></script>
        <script src="resources/home_page/plugins/greensock/ScrollToPlugin.min.js"></script>
        <script src="resources/home_page/plugins/easing/easing.js"></script>
        <script src="resources/home_page/plugins/parallax-js-master/parallax.min.js"></script>
    <script src="resources/home_page/js/cart.js"></script>
    </body>
</html>