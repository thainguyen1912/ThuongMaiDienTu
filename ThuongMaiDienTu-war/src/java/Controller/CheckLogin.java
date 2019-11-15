/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.Customer_s;
import session.Staff_s;

/**
 *
 * @author thain
 */
@WebServlet(name = "CheckLogin", urlPatterns = {"/CheckLogin"})
public class CheckLogin extends HttpServlet {

    @EJB
    private Staff_s staff_s;

    @EJB
    private Customer_s customer_s;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        
        String page=request.getParameter("page");
        HttpSession session=request.getSession();
        switch(page){
            case "checkloginuser":
                
                if(session.getAttribute("cusSession")==null){
                    response.sendRedirect("LoginPage?page=userlogin");
                }
                else{
                    int idPro=Integer.valueOf(request.getParameter("idproduct"));
                    request.setAttribute("idProduct", idPro);
                    RequestDispatcher rd=request.getRequestDispatcher("Cart");
                    rd.forward(request, response);
                }
                break;
                
            case "checkloginadmin":
                
                if(session.getAttribute("adminSess")==null){
                    response.sendRedirect("LoginPage?page=adminlogin");
                }
                else{
                    RequestDispatcher rd=request.getRequestDispatcher("AdminPage?key=category");
                    rd.forward(request, response);
                }
                break;  
                
            case"checklogininfouser":
                String user=request.getParameter("username");
                String pass=request.getParameter("pass");
                entity.Customer cus=customer_s.getByUserPass(user, pass);
                if(cus==null){
                    
                    response.sendRedirect("LoginPage?page=userlogin");
                }
                else{
                    session.setAttribute("cusSession", cus);
                    RequestDispatcher rd=request.getRequestDispatcher("HomePage");
                    rd.forward(request, response);
                }
                break;
                
            case"checklogininfoadmin":
                String user1=request.getParameter("username");
                String pass1=request.getParameter("pass");
                entity.Staff sta=staff_s.getByUserPass(user1, pass1);
                if(sta==null){
                    response.sendRedirect("LoginPage?page=adminlogin");
                }
                else{
                    if(sta.getPermission().equals("1")){
                        session.setAttribute("adminSess", sta);
                        response.sendRedirect("Category");
                    }
                }
                break;    
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
