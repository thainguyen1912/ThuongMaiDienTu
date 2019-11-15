<%@page import="java.util.List"%>
<%@page import="entity.Category"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    List<Category> list_cat = (List<Category>) request.getAttribute("list_category");
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
                                        <form class="" style="width: 100%" action="ProductControl?page=add" method="post" enctype="multipart/form-data">
                                            <div>
                                                <div style="width: 60%; float: left">
                                                    <div class="position-relative row form-group">
                                                        <label for="productname" class="col-sm-2 col-form-label">
                                                            Tên Sản Phẩm
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <input value="" name="productname" id="name" placeholder="" type="text" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="idcategory" class="col-sm-2 col-form-label">
                                                            Thuộc Danh Mục
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <select name="idcategory" class="form-control">
                                                                <%
                                                                    for (int i = 0; i < list_cat.size(); i++) {
                                                                %>
                                                                <option value="<%=list_cat.get(i).getIdcategory()%>"><%=list_cat.get(i).getCategoryname()%></option>>
                                                                <%}%>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="amountnow" class="col-sm-2 col-form-label">
                                                            Số Lượng Nhập Kho
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <input value="" name="amountnow" id="name" placeholder="" type="text" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="priceinput" class="col-sm-2 col-form-label">
                                                            Giá Nhập Kho
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <input value="" name="priceinput" id="name" placeholder="" type="text" class="form-control">
                                                        </div>
                                                    </div>
                                                    <div class="position-relative row form-group">
                                                        <label for="moreinfo" class="col-sm-2 col-form-label">
                                                            Thông Tin Thêm
                                                        </label>
                                                        <div class="col-sm-10">
                                                            <textarea name="moreinfo" id="moreinfo" class="form-control">Không Có</textarea>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div style="width: 40%; float: left">
                                                    <div>
                                                        <div class="file-upload" style="width: 85%;">
<!--                                                            <div style="margin-bottom: 10%">
                                                                <img style="max-width: 100%" src="resources/admin_page/images/imagenotfound.png" alt="your image" />
                                                            </div>-->

                                                            <button class="file-upload-btn" type="button" onclick="$('.file-upload-input').trigger('click')">Chọn Ảnh</button>

                                                            <div class="image-upload-wrap">
                                                                <input class="file-upload-input" type="file" name="image" size="50" onchange="readURL(this);" accept="image/*" />
                                                                <div class="drag-text">
                                                                    <h3>
                                                                        Kéo Và Thả một File Vào Đây
                                                                    </h3>
                                                                </div>
                                                            </div>
                                                            <div class="file-upload-content">
                                                                <img class="file-upload-image" src="#" style="max-width: 100%"  alt="your image" />
                                                                <div class="image-title-wrap">
                                                                    <button type="button" onclick="removeUpload()" class="remove-image">Xóa Bỏ  <span class="image-title">Uploaded Image</span></button>
                                                                </div>
                                                            </div>

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
