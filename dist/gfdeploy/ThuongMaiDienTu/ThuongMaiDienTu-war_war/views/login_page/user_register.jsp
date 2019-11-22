<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Đăng Nhập</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="icon" type="image/png" href="resources/login_page/images/icons/favicon.ico"/>
        <link rel="stylesheet" type="text/css" href="resources/login_page/vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="resources/login_page/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="resources/login_page/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
        <link rel="stylesheet" type="text/css" href="resources/login_page/vendor/animate/animate.css">
        <link rel="stylesheet" type="text/css" href="resources/login_page/vendor/css-hamburgers/hamburgers.min.css">
        <link rel="stylesheet" type="text/css" href="resources/login_page/vendor/animsition/css/animsition.min.css">
        <link rel="stylesheet" type="text/css" href="resources/login_page/vendor/select2/select2.min.css">
        <link rel="stylesheet" type="text/css" href="resources/login_page/vendor/daterangepicker/daterangepicker.css">
        <link rel="stylesheet" type="text/css" href="resources/login_page/css/util.css">
        <link rel="stylesheet" type="text/css" href="resources/login_page/css/main.css">
    </head>
    <body>

        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100 p-t-50 p-b-90">
                        <%=request.getAttribute("register_error")==null?"":request.getAttribute("register_error") %>
                    <form class="login100-form validate-form flex-sb flex-w" action="LoginPage?page=register_process" method="post">
                        <span class="login100-form-title p-b-51">
                            Điền Thông Tin
                        </span>


                        <div class="wrap-input100 validate-input m-b-16" data-validate = "required">
                            <input class="input100" type="text" name="customername" placeholder="họ tên">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-16" data-validate = "required">
                            <select name="gender" class="input100">
                                <option value="1">Nam</option>
                                <option value="0">Nữ</option>
                            </select>
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-16" data-validate = "required">
                            <input class="input100" type="date" name="datebirth" placeholder="ngày sinh">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-16" data-validate = "required">
                            <input class="input100" type="text" name="address" placeholder="thành phố">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-16" data-validate = "required">
                            <input class="input100" type="text" name="phonenumber" placeholder="số điện thoại">
                            <span class="focus-input100"></span>
                        </div>
                        <div class="wrap-input100 validate-input m-b-16" data-validate = "required">
                            <input class="input100" type="text" name="transport" placeholder="địa chỉ nhận hàng">
                            <span class="focus-input100"></span>
                        </div>
                        
                        <div class="wrap-input100 validate-input m-b-16" data-validate = "Username is required">
                            <input class="input100" type="text" name="username" placeholder="Username">
                            <span class="focus-input100"></span>
                        </div>


                        <div class="wrap-input100 validate-input m-b-16" data-validate = "Password is required">
                            <input class="input100" type="password" name="password" placeholder="Password">
                            <span class="focus-input100"></span>
                        </div>

                        <div class="flex-sb-m w-full p-t-3 p-b-24">
                            
                        </div>

                        <div class="container-login100-form-btn m-t-17">
                            <button class="login100-form-btn">
                                Đăng Ký
                            </button>
                        </div>
                        
                    </form>
                    <div class="container-login100-form-btn m-t-17" style="margin-left: 36%">
                            <a href="LoginPage?page=userlogin">
                                <button class="login100-form-btn">
                                    Quay Lại
                                </button>
                            </a>
                        </div>
                </div>
            </div>
        </div>


        <div id="dropDownSelect1"></div>

        <script src="resources/login_page/vendor/jquery/jquery-3.2.1.min.js"></script>
        <script src="resources/login_page/vendor/animsition/js/animsition.min.js"></script>
        <script src="resources/login_page/vendor/bootstrap/js/popper.js"></script>
        <script src="resources/login_page/vendor/bootstrap/js/bootstrap.min.js"></script>
        <script src="resources/login_page/vendor/select2/select2.min.js"></script>
        <script src="resources/login_page/vendor/daterangepicker/moment.min.js"></script>
        <script src="resources/login_page/vendor/daterangepicker/daterangepicker.js"></script>
        <script src="resources/login_page/vendor/countdowntime/countdowntime.js"></script>
        <script src="resources/login_page/js/main.js"></script>

    </body>
</html>