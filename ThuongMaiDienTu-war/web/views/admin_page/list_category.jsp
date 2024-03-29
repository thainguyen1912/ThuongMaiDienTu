<%@page import="entity.Category"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    List<Category> list_cat = (List<Category>) request.getAttribute("list_category");
    System.out.println(list_cat.toString());
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
                                        
                                        <div class="mb-3">
                                            <a href="AddControl?page=category">
                                                <button class="mb-2 mr-3 btn-transition btn btn-outline-success">
                                                    <span style="font-size: 16px">Thêm Danh Mục
                                                    </span>
                                                </button>
                                            </a>
                                        </div>
                                        
                                        <table class="mb-0 table table-hover" style="text-align: center">
                                            <thead>
                                                <tr>
                                                    <th>STT</th>
                                                    <th>Tên Danh Mục</th>
                                                    <th>Tình Trạng</th>
                                                    <th style="width: 12%">Tùy Chọn</th>
                                                </tr>
                                            </thead>
                                            <tbody>

                                                <%
                                                    for (int i = 0; i < list_cat.size(); i++) {
                                                %>
                                                <tr>
                                                    <th><%=i + 1%></th>
                                                    <td><%=list_cat.get(i).getCategoryname()%></td>
                                                    <td><%=list_cat.get(i).getStatus().equals("0")?"Tạm Ngừng Kinh Doanh":"Đang Kinh Doanh"%></td>
                                                    <td>
                                                        <div style="float: left">
                                                            <a href="EditControl?page=category&id=<%=list_cat.get(i).getIdcategory() %>">
                                                                <button class="mb-2 mr-3 btn-transition btn btn-outline-warning">
                                                                    <i class="pe-7s-tools" style="font-size: 1.5rem">
                                                                    </i>
                                                                </button>
                                                            </a>
                                                        </div>
                                                        <div style="float: left">
                                                            <a onclick="return xacNhan()" 
                                                               href="CategoryControl?page=delete&id=<%=list_cat.get(i).getIdcategory() %>">
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
