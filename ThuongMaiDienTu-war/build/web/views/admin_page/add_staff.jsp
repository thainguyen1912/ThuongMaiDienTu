<%@ page contentType="text/html; charset=UTF-8" %>

<!doctype html>
<html lang="en">
    <jsp:include page="import_page/import.jsp" flush="true"/>
    <body>
        <div class="app-container app-theme-white body-tabs-shadow fixed-sidebar fixed-header">
            <jsp:include page="import_page/header.jsp" flush="true"/> 
            <jsp:include page="import_page/setting_ui.jsp" flush="true"/>
            <div class="app-main" style="overflow: auto">
                <jsp:include page="import_page/left_menu.jsp" flush="true"/>
                <div class="app-main__outer">
                    <div class="app-main__inner">
                        <jsp:include page="import_page/page_title.jsp" flush="true"/>
                        <div class="tab-content">
                            <div class="tab-pane tabs-animation fade active show" id="tab-content-1" role="tabpanel">
                                <div class="main-card mb-3 card">
                                    <div class="card-body">
                                        <form class="" style="width: 100%" action="StaffControl?page=add" method="post">
                                            <div>
                                                <div style="width: 60%; float: left">
                                                    <div class="position-relative row form-group">
                                                        <label for="name" class="col-sm-2 col-form-label">
                                                            Tên Nhân Viên
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <input value="" name="name" id="name" placeholder="" type="text" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="gender" class="col-sm-2 col-form-label">
                                                            Giới Tính
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <select name="gender" id="gender" class="form-control">
                                                                <option value="1" >Nam</option>
                                                                <option value="0" >Nữ</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="datebirth" class="col-sm-2 col-form-label">
                                                            Ngày Sinh
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <input value="" name="datebirth" id="name" placeholder="" type="date" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="address" class="col-sm-2 col-form-label">
                                                            Địa Chỉ
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <input value="" name="address" id="name" placeholder="" type="text" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="phonenumber" class="col-sm-2 col-form-label">
                                                            Số Điện Thoại
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <input value="" name="phonenumber" id="name" placeholder="" type="text" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="permission" class="col-sm-2 col-form-label">
                                                            Quyền
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <select name="permission" id="gender" class="form-control">
                                                                <option value="1" >Admin</option>
                                                                <option value="0" >Quản Lý</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="username" class="col-sm-2 col-form-label">
                                                            Tên Tài Khoản
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <input value="" name="username" id="name" placeholder="" type="text" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="password" class="col-sm-2 col-form-label">
                                                            Mật Khẩu
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <input value="" name="password" id="name" placeholder="" type="text" class="form-control">
                                                        </div>
                                                    </div>

                                                </div>
                                                <div class="position-relative row form-check" style="clear: both">
                                                    <div class="col-sm-10 offset-sm-2">
                                                        <button style="margin-left: 30%;" class="btn btn-primary" type="submit">
                                                            Cập Nhật Thông Tin
                                                        </button>
                                                    </div>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
