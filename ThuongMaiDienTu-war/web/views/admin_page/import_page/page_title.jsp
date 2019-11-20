<%@ page contentType="text/html; charset=UTF-8" %>
<%
    String title="";
    String value=request.getAttribute("title").toString();
    switch(value){
        case "list_category":
           title ="Danh Sách Danh Mục";
            break;
        case "list_product":
            title ="Danh Sách Sản Phẩm";
            break;
        case "list_staff":
            title="Danh Sách Nhân Viên";
            break;
        case "list_invoice":
            title="Danh Sách Hóa Đơn";
            break;
        case "list_customer":
            title="Danh Sách Người Dùng";
            break;
        case "add_category":
            title="Thêm Danh Mục";
            break;
        case "edit_category":
            title="Chỉnh Sửa Danh Mục";
            break;
        case "add_product":
            title="Thêm Sản Phẩm";
            break;
        case "edit_product":
            title="Sửa Thông Tin Sản Phẩm";
            break;
        case "add_staff":
            title="Thêm Nhân Viên"   ;
            break;
        case "edit_staff":
            title="Sửa Thông Tin Nhân Viên";
            break;
        default:
            title="null";
            break;
    }
    
%>
<div class="app-page-title">
    <div class="page-title-wrapper">
        <div class="page-title-heading">
            <div>
                <%=title %>
            </div>
        </div> 
    </div>
</div>