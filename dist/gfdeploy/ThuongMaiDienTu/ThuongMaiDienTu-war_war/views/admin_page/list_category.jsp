<%@page import="entity.Category"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    List<Category> list_cat=(List<Category>)request.getAttribute("list_category");
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
                                        <table class="mb-0 table table-hover" style="text-align: center">
                                            <thead>
                                                <tr>
                                                    <th>STT</th>
                                                    <th>Tên Danh Mục</th>
                                                </tr>
                                            </thead>
                                            <tbody>

                                                <%
                                                    for (int i = 0; i < list_cat.size(); i++) {
                                                %>
                                                <tr>
                                                    <th><%=i + 1%></th>
                                                    <td><%=list_cat.get(i).getCategoryname() %></td>
                                                    <td>
                                                        <div class="dropdown d-inline-block">
                                                            <button type=button" aria-haspopup="true" aria-expanded="false" data-toggle="dropdown" class="mb-2 mr-2 dropdown-toggle btn btn-outline-info"></button>
                                                            <div tabindex="-1" role="menu" aria-hidden="true" class="dropdown-menu">
                                                                <a href="">
                                                                    <button class="dropdown-item mb-2 mr-2 btn-transition btn btn-outline-warning">
                                                                        <i class="pe-7s-tools" style="font-size: 1.2rem">
                                                                            <span style="font-size:16px">   Sửa</span>
                                                                        </i>
                                                                    </button>
                                                                </a>
                                                                <a onclick="return xacNhan()" href="">
                                                                    <button class="dropdown-item mb-2 mr-2 btn-transition btn btn-outline-danger"><i class="pe-7s-trash" style="font-size: 1.2rem">
                                                                            <span style="font-size:16px">   Xóa</span>
                                                                        </i>
                                                                    </button>
                                                                </a>
                                                                <a>
                                                                    <button class="dropdown-item mb-2 mr-2 btn-transition btn btn-outline-info">
                                                                        <i class="pe-7s-add-user" style="font-size: 1.2rem">
                                                                            <span style="font-size:16px">   Thêm Con</span>
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
