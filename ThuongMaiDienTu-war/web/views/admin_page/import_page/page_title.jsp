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
        case "list_customer":
            title="Danh Sách Người Dùng";
            break;
        case "list_individual":
            title="Danh Sách Thành Viên";
            break;
        case "list_avatar":
            title="Danh Sách Ảnh";
            break;
        case "user_info":
            title="Thông Tin Người Dùng";
            break;
        case "change_pass":
            title="Đổi Mật Khẩu Tài Khoản";
            break;
        case "list_parentage":
            title="Danh Sách Gia Phả Đang Quản Lý"   ;
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