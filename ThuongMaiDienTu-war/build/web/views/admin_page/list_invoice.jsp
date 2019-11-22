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
                                                    <th>Trạng Thái</th>
                                                    <th>Tổng Tiền</th>
                                                    <th>Thao Tác</th>
                                                </tr>
                                         </thead>
                                            <tbody>

                                                <%
                                                    for (int i = 0; i < list_inv.size(); i++) {
                                                %>
                                                <tr>
                                                    <th><%=i + 1%></th>
                                                    <td><%=list_inv.get(i).getIdcustomer().getCustomername() %></td>
                                                        <%
                                                        if(list_inv.get(i).getStatus().equals("0")){
                                                        
                                                        %>
                                                        <td style="color:red">Chưa Thanh Toán</td>
                                                        <%
                                                        }
                                                        %>
                                                        <%
                                                        if(list_inv.get(i).getStatus().equals("1")){
                                                        
                                                        %>
                                                        <td style="color:green">Đã Thanh Toán</td>
                                                        <%
                                                        }
                                                        %>
                                                    
                                                    <td><%=list_inv.get(i).getTotalmoney() %></td>
                                                    
                                                    <td>
                                                        <%
                                                        if(list_inv.get(i).getStatus().equals("0")){
                                                        
                                                        %>
                                                            <a href="InvoiceControl?page=process&id=<%=list_inv.get(i).getIdinvoice() %>" title="Thanh Toán">
                                                                <button class="mb-2 mr-3 btn-transition btn btn-outline-warning">
                                                                    <i class="pe-7s-tools" style="font-size: 1.5rem">
                                                                    </i>
                                                                </button>
                                                            </a>
                                                        <%
                                                        }
                                                        %>
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
