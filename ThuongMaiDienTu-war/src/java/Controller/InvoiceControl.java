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
import session.Invoice_s;

/**
 *
 * @author admins
 */
@WebServlet(name = "InvoiceControl", urlPatterns = {"/InvoiceControl"})
public class InvoiceControl extends HttpServlet {
    @EJB
    private Invoice_s invoice_s;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        String page=request.getParameter("page");
        RequestDispatcher rd=null;
        switch(page){
            case "process":
                int id_p=Integer.valueOf(request.getParameter("id")); 
                entity.Invoice inv=invoice_s.selectById(id_p);
                invoice_s.updateStatus(inv, "1");
                response.sendRedirect("Invoice");
                break;
//            case "add":
//                String cateName_a=request.getParameter("name");
//                String status_a=request.getParameter("status");
//                
//                entity.Category cat_a=new entity.Category(cateName_a, status_a);
//                category_s.insert(cat_a);
//                
//                request.setAttribute("title", "list_category");
//                rd=request.getRequestDispatcher("Category");
//                rd.forward(request, response);
//                break;
                
//            case "edit":
//                int id_e=Integer.valueOf(request.getParameter("id"));                
//                String status_e="1";               
//                entity.Invoice inv_e=new entity.Invoice(id_e,status_e);                
//                invoice_s.update(inv_e);               
//                request.setAttribute("title", "list_invoice");
//                rd=request.getRequestDispatcher("Invoice");
//                rd.forward(request, response);
//                break;
//            case "delete":
//                int id_d=Integer.valueOf(request.getParameter("id"));
//                category_s.delete(id_d);
//                request.setAttribute("title", "list_category");
//                rd=request.getRequestDispatcher("Category");
//                rd.forward(request, response);
//                break;
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
