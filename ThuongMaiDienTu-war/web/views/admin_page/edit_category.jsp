<%@page import="entity.Category"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Category cat=(Category)request.getAttribute("category");
%>
<!doctype html>
<html lang="en">
    <jsp:include page="import_page/import.jsp" flush="true"/>
    <script src="resources/admin_page/js/upload_image.js"></script>
    <script class="jsbin" src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="resources/admin_page/css/upload_image.css">
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
                                        <form class="" style="width: 100%" action="CategoryControl?page=edit" method="post">
                                            <div>
                                                <div style="width: 60%; float: left">
                                                    <div class="position-relative row form-group">
                                                        <label for="name" class="col-sm-2 col-form-label">
                                                            Tên Danh Mục
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <input value="<%=cat.getIdcategory() %>" name="id" id="name" placeholder="" type="text" class="form-control" hidden="true">
                                                            <input value="<%=cat.getCategoryname() %>" name="name" id="name" placeholder="" type="text" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="status" class="col-sm-2 col-form-label">
                                                            Tình Trạng
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <select name="status" id="gender" class="form-control">
                                                                <option value="1" <%=cat.getStatus().equals("1")?"selected":"" %>>Đang Kinh Doanh</option>
                                                                <option value="0" <%=cat.getStatus().equals("0")?"selected":"" %>>Tạm Ngừng Kinh Doanh</option>
                                                            </select>
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
