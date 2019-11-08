<%@page import="entity.Product"%>
<%@page import="entity.Category"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    List<Product> list_pro = (List<Product>) request.getAttribute("list_product");
%>
<!doctype html>
<html lang="en">
    <jsp:include page="import_page/import.jsp" flush="true"/>
    <body>
        <div class="app-container app-theme-white body-tabs-shadow fixed-sidebar fixed-header">
            <jsp:include page="import_page/header.jsp" flush="true"/>
            <jsp:include page="import_page/setting_ui.jsp" flush="true"/>
            <div class="app-main">
                <jsp:include page="import_page/left_menu.jsp" flush="true"/>
                <div class="app-main__outer">
                    <div class="app-main__inner">
                        <jsp:include page="import_page/page_title.jsp" flush="true"/>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="main-card mb-3 card">
                                    <div class="card-body">
                                        <table class="mb-0 table table-hover" style="text-align: center">
                                            <thead>
                                                <tr>
                                                    <th>STT</th>
                                                    <th>Tên Sản Phẩm</th>
                                                    <th>Thuộc Danh Mục</th>
                                                    <th>Số Lượng Hiện Tại</th>
                                                    <th>Số Lượng Đã Bán</th>
                                                    <th>Giá Nhập Vào</th>
                                                    <th>Giá Bán Ra</th>
                                                    <th>Hình Ảnh</th>
                                                    <th>Thông Tin Thêm</th>
                                                    <th style="width: 12%">Tùy Chọn</th>
                                                </tr>
                                            </thead>
                                            <tbody>

                                                <%
                                                    for (int i = 0; i < list_pro.size(); i++) {
                                                %>
                                                <tr>
                                                    <th><%=i + 1%></th>
                                                    <td><%=list_pro.get(i).getProductname() %></td>
                                                    <td><%=list_pro.get(i).getIdcategory().getCategoryname() %></td>
                                                    <td><%=list_pro.get(i).getAmountnow()%></td>
                                                    <td><%=list_pro.get(i).getAmountpaid()%></td>
                                                    <td><%=list_pro.get(i).getPriceinput()%></td>
                                                    <td><%=list_pro.get(i).getPriceoutput()%></td>
                                                    <td><%=list_pro.get(i).getProductimage()%></td>
                                                    <td><%=list_pro.get(i).getMoreinfo()%></td>
                                                    <td>
                                                        <div style="float: left">
                                                            <a href="">
                                                                <button class="mb-2 mr-3 btn-transition btn btn-outline-warning">
                                                                    <i class="pe-7s-tools" style="font-size: 1.5rem">
                                                                    </i>
                                                                </button>
                                                            </a>
                                                        </div>
                                                        <div style="float: right">
                                                            <a onclick="return xacNhan()" href="">
                                                                <button class="mb-2 mr-3 btn-transition btn btn-outline-danger">
                                                                    <i class="pe-7s-trash" style="font-size: 1.5rem">
                                                                    </i>
                                                                </button>
                                                            </a>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <%
                                                    }
                                                %>
                                            </tbody>
                                        </table>
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
