<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link rel="stylesheet" type="text/css" href="resources/home_page/styles/checkout.css">
        <link rel="stylesheet" type="text/css" href="resources/home_page/styles/checkout_responsive.css">
    </head>
    <body>
        <div class="menu">
            <jsp:include page="home_resources/menuhide.jsp" flush="true" />
        </div>

        <div class="super_container">
            <jsp:include page="home_resources/header.jsp" flush="true" />
            <div class="super_container_inner">
                <div class="super_overlay"></div>
                <div class="home">
                    <div class="home_container d-flex flex-column align-items-center justify-content-end">
                        <div class="home_content text-center">
                            <div class="home_title">Thanh Toán</div>
                            <div class="breadcrumbs d-flex flex-column align-items-center justify-content-center">
                                <ul class="d-flex flex-row align-items-start justify-content-start text-center">
                                    <li><a href="#">Trang Chủ</a></li>
                                    <li>Thanh Toán</li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Checkout -->

                <div class="checkout">
                    <div class="container">
                        <div class="row">

                            <!-- Billing -->
                            <div class="col-lg-6">
                                <div class="billing">
                                    <div class="checkout_title">Hóa Đơn</div>
                                    <div class="checkout_form_container">
                                        <form action="#" id="checkout_form" class="checkout_form">
                                            <div class="row">
                                                <div class="col-lg-6">
                                                    <!-- Name -->
                                                    <input type="text" id="checkout_name" class="checkout_input" placeholder="First Name" required="required">
                                                </div>
                                                <div class="col-lg-6">
                                                    <!-- Last Name -->
                                                    <input type="text" id="checkout_last_name" class="checkout_input" placeholder="Last Name" required="required">
                                                </div>
                                            </div>

                                            <div>
                                                <!-- Country -->
                                                <select name="checkout_country" id="checkout_country" class="dropdown_item_select checkout_input" require="required">
                                                    <option>Thành Phố</option>
                                                    <option value="01">Thành phố Hà Nội</option>
                                                    <option value="02">Tỉnh Hà Giang</option>
                                                    <option value="04">Tỉnh Cao Bằng</option>
                                                    <option value="06">Tỉnh Bắc Kạn</option>
                                                    <option value="08">Tỉnh Tuyên Quang</option>
                                                    <option value="10">Tỉnh Lào Cai</option>
                                                    <option value="11">Tỉnh Điện Biên</option>
                                                    <option value="12">Tỉnh Lai Châu</option>
                                                    <option value="14">Tỉnh Sơn La</option>
                                                    <option value="15">Tỉnh Yên Bái</option>
                                                    <option value="17">Tỉnh Hoà Bình</option>
                                                    <option value="19">Tỉnh Thái Nguyên</option>
                                                    <option value="20">Tỉnh Lạng Sơn</option>
                                                    <option value="22">Tỉnh Quảng Ninh</option>
                                                    <option value="24">Tỉnh Bắc Giang</option>
                                                    <option value="25">Tỉnh Phú Thọ</option>
                                                    <option value="26">Tỉnh Vĩnh Phúc</option>
                                                    <option value="27">Tỉnh Bắc Ninh</option>
                                                    <option value="30">Tỉnh Hải Dương</option>
                                                    <option value="31">Thành phố Hải Phòng</option>
                                                    <option value="33">Tỉnh Hưng Yên</option>
                                                    <option value="34">Tỉnh Thái Bình</option>
                                                    <option value="35">Tỉnh Hà Nam</option>
                                                    <option value="36">Tỉnh Nam Định</option>
                                                    <option value="37">Tỉnh Ninh Bình</option>
                                                    <option value="38">Tỉnh Thanh Hóa</option>
                                                    <option value="40">Tỉnh Nghệ An</option>
                                                    <option value="42">Tỉnh Hà Tĩnh</option>
                                                    <option value="44">Tỉnh Quảng Bình</option>
                                                    <option value="45">Tỉnh Quảng Trị</option>
                                                    <option value="46">Tỉnh Thừa Thiên Huế</option>
                                                    <option value="48">Thành phố Đà Nẵng</option>
                                                    <option value="49">Tỉnh Quảng Nam</option>
                                                    <option value="51">Tỉnh Quảng Ngãi</option>
                                                    <option value="52">Tỉnh Bình Định</option>
                                                    <option value="54">Tỉnh Phú Yên</option>
                                                    <option value="56">Tỉnh Khánh Hòa</option>
                                                    <option value="58">Tỉnh Ninh Thuận</option>
                                                    <option value="60">Tỉnh Bình Thuận</option>
                                                    <option value="62">Tỉnh Kon Tum</option>
                                                    <option value="64">Tỉnh Gia Lai</option>
                                                    <option value="66">Tỉnh Đắk Lắk</option>
                                                    <option value="67">Tỉnh Đắk Nông</option>
                                                    <option value="68">Tỉnh Lâm Đồng</option>
                                                    <option value="70">Tỉnh Bình Phước</option>
                                                    <option value="72">Tỉnh Tây Ninh</option>
                                                    <option value="74">Tỉnh Bình Dương</option>
                                                    <option value="75">Tỉnh Đồng Nai</option>
                                                    <option value="77">Tỉnh Bà Rịa - Vũng Tàu</option>
                                                    <option value="79">Thành phố Hồ Chí Minh</option>
                                                    <option value="80">Tỉnh Long An</option>
                                                    <option value="82">Tỉnh Tiền Giang</option>
                                                    <option value="83">Tỉnh Bến Tre</option>
                                                    <option value="84">Tỉnh Trà Vinh</option>
                                                    <option value="86">Tỉnh Vĩnh Long</option>
                                                    <option value="87">Tỉnh Đồng Tháp</option>
                                                    <option value="89">Tỉnh An Giang</option>
                                                    <option value="91">Tỉnh Kiên Giang</option>
                                                    <option value="92">Thành phố Cần Thơ</option>
                                                    <option value="93">Tỉnh Hậu Giang</option>
                                                    <option value="94">Tỉnh Sóc Trăng</option>
                                                    <option value="95">Tỉnh Bạc Liêu</option>
                                                    <option value="96">Tỉnh Cà Mau</option>
                                                </select>
                                            </div>
                                            <div>
                                                <!-- Address -->
                                                <input type="text" id="checkout_address" class="checkout_input" placeholder="Địa Chỉ" required="required">
                                            </div>
<!--                                            <div>
                                                 Zipcode 
                                                <input type="text" id="checkout_zipcode" class="checkout_input" placeholder="Zip Code" required="required">
                                            </div>
                                            <div>
                                                 City / Town 
                                                <select name="checkout_city" id="checkout_city" class="dropdown_item_select checkout_input" require="required">
                                                    <option>City / Town</option>
                                                    <option>City</option>
                                                    <option>City</option>
                                                    <option>City</option>
                                                    <option>City</option>
                                                </select>
                                            </div>
                                            <div>
                                                 Province 
                                                <select name="checkout_province" id="checkout_province" class="dropdown_item_select checkout_input" require="required">
                                                    <option>Province</option>
                                                    <option>Province</option>
                                                    <option>Province</option>
                                                    <option>Province</option>
                                                    <option>Province</option>
                                                </select>
                                            </div>-->
                                            <div>
                                                <!-- Phone no -->
                                                <input type="phone" id="checkout_phone" class="checkout_input" placeholder="Số Điện Thoại" required="required">
                                            </div>
                                            <div>
                                                <!-- Email -->
                                                <input type="phone" id="checkout_email" class="checkout_input" placeholder="Email" required="required">
                                            </div>
                                            
                                        </form>
                                    </div>
                                </div>
                            </div>

                            <!-- Cart Total -->
                            <div class="col-lg-6 cart_col">
                                <div class="cart_total">
                                    <div class="cart_extra_content cart_extra_total">
                                        <div class="checkout_title">Thanh Toán</div>
                                        <ul class="cart_extra_total_list">
                                            <li class="d-flex flex-row align-items-center justify-content-start">
                                                <div class="cart_extra_total_title">Tổng Tiền Ban Đầu</div>
                                                <div class="cart_extra_total_value ml-auto">$29.90</div>
                                            </li>
                                            <li class="d-flex flex-row align-items-center justify-content-start">
                                                <div class="cart_extra_total_title">Phí Vận Chuyển</div>
                                                <div class="cart_extra_total_value ml-auto">Free</div>
                                            </li>
                                            <li class="d-flex flex-row align-items-center justify-content-start">
                                                <div class="cart_extra_total_title">Tổng</div>
                                                <div class="cart_extra_total_value ml-auto">$29.90</div>
                                            </li>
                                        </ul>
                                        <div class="cart_text">
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integ er bibendum sodales arcu id te mpus. Ut consectetur lacus.</p>
                                        </div>
                                        <div class="checkout_button trans_200"><a href="checkout.html">Xác Nhận</a></div>
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
        <script src="resources/home_page/js/checkout.js"></script>
    </body>
</html>