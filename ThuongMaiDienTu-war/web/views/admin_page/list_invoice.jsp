<%@page import="entity.Invoice"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    List<Invoice> list_inv = (List<Invoice>)request.getAttribute("list_invoice");
    System.out.println(list_inv.toString());
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
                                            
                                        </div>
                                        
                                        <table class="mb-0 table table-hover" style="text-align: center">
                                            <thead>
                                                <tr>
                                                    <th>STT</th>
                                                    <th>Tên Khách Hàng</th>
                                                    <th>Tổng tiền</th>
                                                    
                                                </tr>
                                         </thead>
                                            <tbody>

                                                <%
                                                    for (int i = 0; i < list_inv.size(); i++) {
                                                %>
                                                <tr>
                                                    <th><%=i + 1%></th>
                                                    <td><%=list_inv.get(i).getIdcustomer().getCustomername() %></td>
                                                    <td><%=list_inv.get(i).getTotalmoney() %></td>
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
