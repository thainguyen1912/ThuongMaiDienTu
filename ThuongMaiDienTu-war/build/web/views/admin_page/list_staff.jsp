<%@page import="entity.Staff"%>
<%@page import="entity.Product"%>
<%@page import="entity.Category"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    List<Staff> list_sta = (List<Staff>) request.getAttribute("list_staff");
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
                                                    <th>Tên Nhân Viên</th>
                                                    <th>Giới Tính</th>
                                                    <th>Ngày Sinh</th>
                                                    <th>Địa Chỉ</th>
                                                    <th>Số Điện Thoại</th>
                                                    <th>Quyền</th>
                                                    <th>Tài Khoản</th>
                                                    <th style="width: 12%">Tùy Chọn</th>
                                                </tr>
                                            </thead>
                                            <tbody>

                                                <%
                                                    for (int i = 0; i < list_sta.size(); i++) {
                                                %>
                                                <tr>
                                                    <th><%=i + 1%></th>
                                                    <td><%=list_sta.get(i).getStaffname()%></td>
                                                    <td><%=list_sta.get(i).getGender()%></td>
                                                    <td><%=list_sta.get(i).getDatebirth()%></td>
                                                    <td><%=list_sta.get(i).getAddress()%></td>
                                                    <td><%=list_sta.get(i).getPhonenumber()%></td>
                                                    <td><%=list_sta.get(i).getPermission().equals("0")?"Nhân Viên":"Quản Trị"%></td>
                                                    <td><%=list_sta.get(i).getUsername()%></td>
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
