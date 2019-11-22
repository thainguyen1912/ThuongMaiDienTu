/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.Customer_s;

/**
 *
 * @author thain
 */
@WebServlet(name = "LoginPage", urlPatterns = {"/LoginPage"})
public class LoginPage extends HttpServlet {

    @EJB
    private Customer_s customer_s;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        
        String page=request.getParameter("page");
        RequestDispatcher rd=null;
        switch(page){
            case "userlogin":
                rd=request.getRequestDispatcher("views/login_page/userlogin.jsp");
                rd.forward(request, response);
                break;
            case "adminlogin":
                rd=request.getRequestDispatcher("views/login_page/adminlogin.jsp");
                rd.forward(request, response);
                break;
            case "register_page":
                rd=request.getRequestDispatcher("views/login_page/user_register.jsp");
                rd.forward(request, response);
                break;
            case "register_process":
                String customerName=request.getParameter("customername");
                String gender=request.getParameter("gender");
                Date dateBirth=Date.valueOf(request.getParameter("datebirth"));
                String address=request.getParameter("address");
                String phoneNumber=request.getParameter("phonenumber");
                String transport=request.getParameter("transport");
                String userName=request.getParameter("username");
                String passWord=request.getParameter("password");
                entity.Customer cus=new entity.Customer(customerName, gender, dateBirth, address, phoneNumber, transport, userName, passWord);
                if(customer_s.selectByUsername(userName)==null){
                    customer_s.insert(cus);
                    request.setAttribute("register_success", "Tạo tài khoản thành công");
                    rd=request.getRequestDispatcher("views/login_page/userlogin.jsp");
                    rd.forward(request, response);
                    break;
                }
                else{
                    request.setAttribute("register_error", "Tài khoản này đã tồn tại");
                    rd=request.getRequestDispatcher("views/login_page/user_register.jsp");
                    rd.forward(request, response);
                    break;
                }
        }
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
