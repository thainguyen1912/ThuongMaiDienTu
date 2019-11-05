<%@ page contentType="text/html; charset=UTF-8" %>
<%
    String title="";
    try{
        title=request.getAttribute("title").toString();
    }
    catch(Exception e){
        
    }
%>
<div class="app-sidebar sidebar-shadow">
    <div class="app-header__logo">
        <div class="logo-src"></div>
        <div class="header__pane ml-auto">
            <div>
                <button type="button" class="hamburger close-sidebar-btn hamburger--elastic" data-class="closed-sidebar">
                    <span class="hamburger-box">
                        <span class="hamburger-inner"></span>
                    </span>
                </button>
            </div>
        </div>
    </div>
    <div class="app-header__mobile-menu">
        <div>
            <button type="button" class="hamburger hamburger--elastic mobile-toggle-nav">
                <span class="hamburger-box">
                    <span class="hamburger-inner"></span>
                </span>
            </button>
        </div>
    </div>
    <div class="app-header__menu">
        <span>
            <button type="button" class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
                <span class="btn-icon-wrapper">
                    <i class="fa fa-ellipsis-v fa-w-6"></i>
                </span>
            </button>
        </span>
    </div>
    <div class="scrollbar-sidebar">
        <div class="app-sidebar__inner">
            <ul class="vertical-nav-menu">
                <li class="app-sidebar__heading">Dòng họ</li>
                <li>
                    <a href="AdminPage?key=category" class="<%=title.equals("list_category")?"mm-active":"" %>">
                        <i class="metismenu-icon pe-7s-notebook"></i>
                        Danh Mục 
                    </a>
                </li>
                <li>
                    <a href="AdminPage?key=product" class="<%=title.equals("list_product")?"mm-active":"" %>"> 
                        <i class="metismenu-icon pe-7s-network"></i>
                        Sản Phẩm
                    </a>
                </li>
                <li>
                    <a href="AdminPage?key=staff" class="<%=title.equals("list_staff")?"mm-active":"" %>">
                        <i class="metismenu-icon pe-7s-album"></i>
                        Nhân Viên
                    </a>
                </li>
                <li>
                    <a href="AdminPage?key=customer" class="<%=title.equals("list_customer")?"mm-active":"" %>">
                        <i class="metismenu-icon pe-7s-album"></i>
                        Khách Hàng
                    </a>
                </li>

                <li class="app-sidebar__heading">Tin tức</li>
                <li>
                    <a href="#">
                        <i class="metismenu-icon pe-7s-note"></i>
                        Viết bài
                        <i class=""></i>
                    </a>
                </li>
                <li>
                    <a href="#">
                        <i class="metismenu-icon pe-7s-helm"></i>
                        Quản lý tin tức
                        <i class=""></i>
                    </a>
                </li>
                
                <li class="app-sidebar__heading">Tin nhắn</li>
                <li>
                    <a href="forms-controls.html">
                        <i class="metismenu-icon pe-7s-note">
                        </i>Soạn tin nhắn
                    </a>
                </li>
                <li>
                    <a href="forms-layouts.html">
                        <i class="metismenu-icon pe-7s-paper-plane">
                        </i>Hộp thư đến
                    </a>
                </li>
                <li>
                    <a href="forms-validation.html">
                        <i class="metismenu-icon pe-7s-shuffle">
                        </i>Tin đã gửi
                    </a>
                </li>
                <!-- <li class="app-sidebar__heading">Charts</li>
                <li>
                    <a href="charts-chartjs.html">
                        <i class="metismenu-icon pe-7s-graph2">
                        </i>ChartJS
                    </a>
                </li>
                <li class="app-sidebar__heading">PRO Version</li>
                <li>
                    <a href="https://dashboardpack.com/theme-details/architectui-dashboard-html-pro/" target="_blank">
                        <i class="metismenu-icon pe-7s-graph2">
                        </i>
                        Upgrade to PRO
                    </a>
                </li> -->
            </ul>
        </div>
    </div>
</div>