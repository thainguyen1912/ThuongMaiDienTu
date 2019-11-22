<%@page import="entity.Product"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%
    
    List<Product> list_tivi = (List<Product>) request.getAttribute("list_tivi");
    if (session.getAttribute("adminSess") != null) {
        session.removeAttribute("adminSess");
    }
    int d = list_tivi.size();
    %>
    <head>
        <title>Category</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Little Closet template">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <jsp:include page="home_resources/import_css.jsp" flush="true" />
        <link rel="stylesheet" type="text/css" href="resources/home_page/styles/category.css">
        <link rel="stylesheet" type="text/css" href="resources/home_page/styles/category_responsive.css">
    </head>
    <body>

        <!-- Menu -->

        <div class="menu">
            <jsp:include page="home_resources/menuhide.jsp" flush="true" />
        </div>

        <div class="super_container">

            <!-- Header -->


            <jsp:include page="home_resources/header.jsp" flush="true" />


            <div class="super_container_inner">
                <div class="super_overlay"></div>

                <!-- Home -->

                <div class="home">
                    <div class="home_container d-flex flex-column align-items-center justify-content-end">
                        <div class="home_content text-center">
                            <div class="home_title">Tivi Page</div>
                            <div class="breadcrumbs d-flex flex-column align-items-center justify-content-center">
                                <ul class="d-flex flex-row align-items-start justify-content-start text-center">
                                    <li><a href="#">Home</a></li>
                                    <li><a href="category.html">Woman</a></li>
                                    <li>New Products</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Products -->

                <div class="products">
                    <div class="container">
                        <!--                        <div class="row products_bar_row">
                                                    <div class="col">
                                                        <div class="products_bar d-flex flex-lg-row flex-column align-items-lg-center align-items-start justify-content-lg-start justify-content-center">
                                                            <div class="products_bar_links">
                                                                <ul class="d-flex flex-row align-items-start justify-content-start">
                                                                    <li><a href="#">All</a></li>
                                                                    <li><a href="#">Hot Products</a></li>
                                                                    <li class="active"><a href="#">New Products</a></li>
                                                                    <li><a href="#">Sale Products</a></li>
                                                                </ul>
                                                            </div>
                                                            <div class="products_bar_side d-flex flex-row align-items-center justify-content-start ml-lg-auto">
                                                                <div class="products_dropdown product_dropdown_sorting">
                                                                    <div class="isotope_sorting_text"><span>Default Sorting</span><i class="fa fa-caret-down" aria-hidden="true"></i></div>
                                                                    <ul>
                                                                        <li class="item_sorting_btn" data-isotope-option='{ "sortBy": "original-order" }'>Default</li>
                                                                        <li class="item_sorting_btn" data-isotope-option='{ "sortBy": "price" }'>Price</li>
                                                                        <li class="item_sorting_btn" data-isotope-option='{ "sortBy": "name" }'>Name</li>
                                                                    </ul>
                                                                </div>
                                                                <div class="product_view d-flex flex-row align-items-center justify-content-start">
                                                                    <div class="view_item active"><img src="images/view_1.png" alt=""></div>
                                                                    <div class="view_item"><img src="images/view_2.png" alt=""></div>
                                                                    <div class="view_item"><img src="images/view_3.png" alt=""></div>
                                                                </div>
                                                                <div class="products_dropdown text-right product_dropdown_filter">
                                                                    <div class="isotope_filter_text"><span>Filter</span><i class="fa fa-caret-down" aria-hidden="true"></i></div>
                                                                    <ul>
                                                                        <li class="item_filter_btn" data-filter="*">All</li>
                                                                        <li class="item_filter_btn" data-filter=".hot">Hot</li>
                                                                        <li class="item_filter_btn" data-filter=".new">New</li>
                                                                        <li class="item_filter_btn" data-filter=".sale">Sale</li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>-->
                        <h3>Có <%=d %> sản phẩm</h3>
                        <div class="row products_row products_container grid">
                            <%
                                for (int i = 0; i < list_tivi.size(); i++) {
                            %>
                            <!-- Product -->
                            <div class="col-xl-4 col-md-6">
                                <div class="product">
                                    <div class="product_image">
                                        <a href="">
                                            <img src="resources/home_page/images/product/<%=list_tivi.get(i).getProductimage()%>" alt="" width="320px" height="300px">
                                        </a>
                                    </div>
                                    <div class="product_content">
                                        <div class="product_info d-flex flex-row align-items-start justify-content-start">
                                            <div>
                                                <div>
                                                    <div class="product_name"><a href="product.html"><%=list_tivi.get(i).getProductname()%></a></div>
                                                    <div class="product_category">In <a href="category.html">Category</a></div>
                                                </div>
                                            </div>
                                            <div class="ml-auto text-right">
                                                <div class="rating_r rating_r_4 home_item_rating"><i></i><i></i><i></i><i></i><i></i></div>
                                                <div class="product_price text-right"><%=list_tivi.get(i).getPriceoutput()%>vnđ</div>
                                            </div>
                                        </div>
                                        <a href="CheckLogin?page=check&idproduct=<%=list_tivi.get(i).getIdproduct()%>">    
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
                            <%
                                }
                            %>


                        </div>
                        <div class="row page_nav_row">
                            <div class="col">
                                <div class="page_nav">
                                    <ul class="d-flex flex-row align-items-start justify-content-center">
                                        <li class="active"><a href="#">01</a></li>
                                        <li><a href="#">02</a></li>
                                        <li><a href="#">03</a></li>
                                        <li><a href="#">04</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Footer -->

                <jsp:include page="home_resources/footer.jsp" flush="true"/>
            </div>

        </div>

        <jsp:include page="home_resources/import_js.jsp" flush="true"/>
        <script src="resources/home_page/js/category.js"></script>
    </body>
</html>