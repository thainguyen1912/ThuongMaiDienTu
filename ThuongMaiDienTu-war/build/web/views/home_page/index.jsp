<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="entity.Product"%>
<%@page import="java.util.List"%>
<%@page import="entity.Category"%>
<%
    List<Category> list_cat = (List<Category>) request.getAttribute("list_category");
    List<Product> list_pro = (List<Product>) request.getAttribute("list_product");
    List<Product> list_pro_pop = (List<Product>) request.getAttribute("list_product_popular");
    if (session.getAttribute("adminSess") != null) {
        session.removeAttribute("adminSess");
    }
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Thương Mại Diện Tử</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Little Closet template">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <jsp:include page="home_resources/import_css.jsp" flush="true" />
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
                    <!-- Home Slider -->
                    <div class="home_slider_container">
                        <div class="owl-carousel owl-theme home_slider">

                            <%
                                int itemPro = 0;
                                for (int i = 0; i < list_cat.size(); i++) {
                            %>
                            <!-- Slide -->
                            <div class="owl-item">
                                <div class="background_image" style="background-image:url(resources/home_page/images/home.jpg)"></div>
                                <div class="container fill_height">
                                    <div class="row fill_height">
                                        <div class="col fill_height">
                                            <div class="home_container d-flex flex-column align-items-center justify-content-start">
                                                <div class="home_content">
                                                    <div class="home_title"><%=list_cat.get(i).getCategoryname()%></div>
                                                    <div class="home_subtitle">TOP 3 Sản Phẩm Bán Chạy Nhất</div>
                                                    <div class="home_items">
                                                        <div class="row">


                                                            <div class="col-lg-4 col-md-6 col-sm-8 offset-sm-2 offset-md-0">
                                                                <div class="product home_item_large">
                                                                    <div class="product_tag d-flex flex-column align-items-center justify-content-center">
                                                                        <div>
                                                                            <div>Giá Từ</div>
                                                                            <div>
                                                                                <%=list_pro.get(itemPro).getPriceinput()%> vnđ
                                                                            </div>
                                                                        </div>
                                                                    </div>

                                                                    <div class="product_image"><a href=""><img src="resources/home_page/images/product/<%=list_pro.get(itemPro).getProductimage()%>" alt=""></a></div>

                                                                    <div class="product_content">
                                                                        <div class="product_info d-flex flex-row align-items-start justify-content-start">
                                                                            <div>
                                                                                <div>
                                                                                    <div class="product_name"><a href="product.html"><%=list_pro.get(itemPro).getProductname()%></a></div>
                                                                                    <div class="product_category">In <a href="category.html">Category</a></div>
                                                                                </div>
                                                                            </div>
                                                                            <div class="ml-auto text-right">
                                                                                <div class="rating_r rating_r_4 home_item_rating"><i></i><i></i><i></i><i></i><i></i></div>
                                                                                <div class="product_price text-right">
                                                                                    <span><%=list_pro.get(itemPro).getPriceinput()%> vnđ</span>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <a href="CheckLogin?page=checkloginuser&idproduct=<%=list_pro.get(itemPro).getIdproduct()%>">
                                                                            <div class="product_buttons">
                                                                                <div class="text-right d-flex flex-row align-items-start justify-content-start">

                                                                                    <div class="product_button product_cart text-center d-flex flex-column align-items-center justify-content-center">
                                                                                        <div><div><img src="resources/home_page/images/cart_2.svg" alt=""><div>+</div></div></div>
                                                                                    </div>

                                                                                </div>
                                                                            </div>
                                                                        </a>
                                                                    </div>
                                                                </div>
                                                            </div>

                                                            <% itemPro += 1;%>
                                                            <div class="col-lg-4 col-md-6 col-sm-8 offset-sm-2 offset-md-0">
                                                                <div class="product home_item_large">
                                                                    <div class="product_tag d-flex flex-column align-items-center justify-content-center">
                                                                        <div>
                                                                            <div>Giá Từ</div>
                                                                            <div>
                                                                                <%=list_pro.get(itemPro).getPriceinput()%> vnđ
                                                                            </div>
                                                                        </div>
                                                                    </div>

                                                                    <div class="product_image"><a href=""><img src="resources/home_page/images/product/<%=list_pro.get(itemPro).getProductimage()%>" alt=""></a></div>

                                                                    <div class="product_content">
                                                                        <div class="product_info d-flex flex-row align-items-start justify-content-start">
                                                                            <div>
                                                                                <div>
                                                                                    <div class="product_name"><a href="product.html"><%=list_pro.get(itemPro).getProductname()%></a></div>
                                                                                    <div class="product_category">In <a href="category.html">Category</a></div>
                                                                                </div>
                                                                            </div>
                                                                            <div class="ml-auto text-right">
                                                                                <div class="rating_r rating_r_4 home_item_rating"><i></i><i></i><i></i><i></i><i></i></div>
                                                                                <div class="product_price text-right">
                                                                                    <span><%=list_pro.get(itemPro).getPriceinput()%> vnđ</span>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <a href="CheckLogin?page=checkloginuser&idproduct=<%=list_pro.get(itemPro).getIdproduct()%>">
                                                                            <div class="product_buttons">
                                                                                <div class="text-right d-flex flex-row align-items-start justify-content-start">

                                                                                    <div class="product_button product_cart text-center d-flex flex-column align-items-center justify-content-center">
                                                                                        <div><div><img src="resources/home_page/images/cart_2.svg" alt=""><div>+</div></div></div>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </a>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <% itemPro += 1;%>            
                                                            <div class="col-lg-4 col-md-6 col-sm-8 offset-sm-2 offset-md-0">
                                                                <div class="product home_item_large">
                                                                    <div class="product_tag d-flex flex-column align-items-center justify-content-center">
                                                                        <div>
                                                                            <div>Giá Từ</div>
                                                                            <div>
                                                                                <%=list_pro.get(itemPro).getPriceinput()%> vnđ
                                                                            </div>
                                                                        </div>
                                                                    </div>

                                                                    <div class="product_image"><a href=""><img src="resources/home_page/images/product/<%=list_pro.get(itemPro).getProductimage()%>" alt=""></a></div>

                                                                    <div class="product_content">
                                                                        <div class="product_info d-flex flex-row align-items-start justify-content-start">
                                                                            <div>
                                                                                <div>
                                                                                    <div class="product_name"><a href="product.html"><%=list_pro.get(itemPro).getProductname()%></a></div>
                                                                                    <div class="product_category">In <a href="category.html">Category</a></div>
                                                                                </div>
                                                                            </div>
                                                                            <div class="ml-auto text-right">
                                                                                <div class="rating_r rating_r_4 home_item_rating"><i></i><i></i><i></i><i></i><i></i></div>
                                                                                <div class="product_price text-right">
                                                                                    <span><%=list_pro.get(itemPro).getPriceinput()%> vnđ</span>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <a href="CheckLogin?page=checkloginuser&idproduct=<%=list_pro.get(itemPro).getIdproduct()%>">
                                                                            <div class="product_buttons">
                                                                                <div class="text-right d-flex flex-row align-items-start justify-content-start">

                                                                                    <div class="product_button product_cart text-center d-flex flex-column align-items-center justify-content-center">
                                                                                        <div><div><img src="resources/home_page/images/cart_2.svg" alt=""><div>+</div></div></div>
                                                                                    </div>
                                                                                </div>
                                                                            </div>
                                                                        </a>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <% itemPro += 1; %>      
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>	
                            </div>
                            <%
                                }
                            %>

                        </div>
                        <div class="home_slider_nav home_slider_nav_prev"><i class="fa fa-chevron-left" aria-hidden="true"></i></div>
                        <div class="home_slider_nav home_slider_nav_next"><i class="fa fa-chevron-right" aria-hidden="true"></i></div>

                        <!-- Home Slider Dots -->

                        <div class="home_slider_dots_container">
                            <div class="container">
                                <div class="row">
                                    <div class="col">
                                        <div class="home_slider_dots">
                                            <ul id="home_slider_custom_dots" class="home_slider_custom_dots d-flex flex-row align-items-center justify-content-center">
                                                <li class="home_slider_custom_dot active">01</li>
                                                <li class="home_slider_custom_dot">02</li>
                                                <li class="home_slider_custom_dot">03</li>
                                                <li class="home_slider_custom_dot">04</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>	
                        </div>

                    </div>
                </div>

                <!-- Products -->

                <div class="products">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-6 offset-lg-3">
                                <div class="section_title text-center">Các Sản Phẩm Phổ Biến</div>
                            </div>
                        </div>
                        <div class="row page_nav_row">
                            <div class="col">
                                <div class="page_nav">
                                    <ul class="d-flex flex-row align-items-start justify-content-center">
                                        <li class="active"><a href="category.html">Tất Cả</a></li>
                                        <li class=""><a href="category.html">Laptop</a></li>
                                        <li><a href="category.html">SmartPhone</a></li>
                                        <li><a href="category.html">TiVi</a></li>
                                        <li><a href="category.html">Máy Ảnh</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="row products_row">

                            <%
                                for (int i = 0; i < list_pro_pop.size(); i++) {
                            %>
                            <!-- Product -->
                            <div class="col-xl-4 col-md-6">
                                <div class="product">
                                    <div class="product_image">
                                        <a href="">
                                            <img src="resources/home_page/images/product/<%=list_pro_pop.get(i).getProductimage()%>" alt="" width="320px" height="300px">
                                        </a>
                                    </div>
                                    <div class="product_content">
                                        <div class="product_info d-flex flex-row align-items-start justify-content-start">
                                            <div>
                                                <div>
                                                    <div class="product_name"><a href="product.html"><%=list_pro_pop.get(i).getProductname()%></a></div>
                                                    <div class="product_category">In <a href="category.html">Category</a></div>
                                                </div>
                                            </div>
                                            <div class="ml-auto text-right">
                                                <div class="rating_r rating_r_4 home_item_rating"><i></i><i></i><i></i><i></i><i></i></div>
                                                <div class="product_price text-right"><%=list_pro_pop.get(i).getPriceoutput()%>vnđ</div>
                                            </div>
                                        </div>
                                        <a href="CheckLogin?page=check&idproduct=<%=list_pro_pop.get(i).getIdproduct()%>">    
                                            <div class="product_buttons">
                                                <div class="text-right d-flex flex-row align-items-start justify-content-start">
                                                    <div class="product_button product_cart text-center d-flex flex-column align-items-center justify-content-center">
                                                        <div><div><img src="resources/home_page/images/cart.svg" class="svg" alt=""><div>+</div></div></div>
                                                    </div>
                                                </div>
                                            </div>
                                        </a>
                                    </div>
                                </div>
                            </div>
                            <%}%>


                        </div>
                        <div class="row load_more_row">
                            <div class="col">
                                <div class="button load_more ml-auto mr-auto"><a href="#">hmm   </a></div>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Boxes -->

                <div class="boxes">
                    <div class="container">
                        <div class="row">
                            <div class="col">
                                <div class="boxes_container d-flex flex-row align-items-start justify-content-between flex-wrap">

                                    <!-- Box -->
                                    <div class="box">
                                        <div class="background_image" style="background-image:url(resources/home_page/images/box_1.jpg)"></div>
                                        <div class="box_content d-flex flex-row align-items-center justify-content-start">
                                            <div class="box_left">
                                                <div class="box_image">
                                                    <a href="category.html">
                                                        <div class="background_image" style="background-image:url(resources/home_page/images/box_1_img.jpg)"></div>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="box_right text-center">
                                                <div class="box_title">Trendsetter Collection</div>
                                            </div>
                                        </div>
                                    </div>

                                    <!-- Box -->
                                    <div class="box">
                                        <div class="background_image" style="background-image:url(resources/home_page/images/box_2.jpg)"></div>
                                        <div class="box_content d-flex flex-row align-items-center justify-content-start">
                                            <div class="box_left">
                                                <div class="box_image">
                                                    <a href="category.html">
                                                        <div class="background_image" style="background-image:url(resources/home_page/images/box_2_img.jpg)"></div>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="box_right text-center">
                                                <div class="box_title">Popular Choice</div>
                                            </div>
                                        </div>
                                    </div>

                                    <!-- Box -->
                                    <div class="box">
                                        <div class="background_image" style="background-image:url(resources/home_page/images/box_3.jpg)"></div>
                                        <div class="box_content d-flex flex-row align-items-center justify-content-start">
                                            <div class="box_left">
                                                <div class="box_image">
                                                    <a href="category.html">
                                                        <div class="background_image" style="background-image:url(resources/home_page/images/box_3_img.jpg)"></div>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="box_right text-center">
                                                <div class="box_title">Popular Choice</div>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Features -->

                <div class="features">
                    <div class="container">
                        <div class="row">

                            <!-- Feature -->
                            <div class="col-lg-4 feature_col">
                                <div class="feature d-flex flex-row align-items-start justify-content-start">
                                    <div class="feature_left">
                                        <div class="feature_icon"><img src="resources/home_page/images/icon_1.svg" alt=""></div>
                                    </div>
                                    <div class="feature_right d-flex flex-column align-items-start justify-content-center">
                                        <div class="feature_title">Fast Secure Payments</div>
                                    </div>
                                </div>
                            </div>

                            <!-- Feature -->
                            <div class="col-lg-4 feature_col">
                                <div class="feature d-flex flex-row align-items-start justify-content-start">
                                    <div class="feature_left">
                                        <div class="feature_icon ml-auto mr-auto"><img src="resources/home_page/images/icon_2.svg" alt=""></div>
                                    </div>
                                    <div class="feature_right d-flex flex-column align-items-start justify-content-center">
                                        <div class="feature_title">Premium Products</div>
                                    </div>
                                </div>
                            </div>

                            <!-- Feature -->
                            <div class="col-lg-4 feature_col">
                                <div class="feature d-flex flex-row align-items-start justify-content-start">
                                    <div class="feature_left">
                                        <div class="feature_icon"><img src="resources/home_page/images/icon_3.svg" alt=""></div>
                                    </div>
                                    <div class="feature_right d-flex flex-column align-items-start justify-content-center">
                                        <div class="feature_title">Free Delivery</div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                <jsp:include page="home_resources/footer.jsp" flush="true" />

            </div>

        </div>

        <jsp:include page="home_resources/import_js.jsp" flush="true" />
    </body>
</html>