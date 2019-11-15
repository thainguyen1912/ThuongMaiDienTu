/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.Category_s;
import session.Product_s;

/**
 *
 * @author thain
 */
@WebServlet(name = "EditControl", urlPatterns = {"/EditControl"})
public class EditControl extends HttpServlet {

    @EJB
    private Product_s product_s;

    @EJB
    private Category_s category_s;

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
            case "category":
                request.setAttribute("title", "edit_category");
                int id_c=Integer.valueOf(request.getParameter("id"));
                
                entity.Category cat=category_s.selectCategoryByID(id_c);
                
                request.setAttribute("category", cat);
                rd=request.getRequestDispatcher("views/admin_page/edit_category.jsp");
                rd.forward(request, response);
                break;
            case "product":
                request.setAttribute("title", "edit_product");
                int id_p=Integer.valueOf(request.getParameter("id"));
                
                entity.Product pro=product_s.getById(id_p);
                
                request.setAttribute("product", pro);
                List<entity.Category> list_cat=category_s.getAll();
                request.setAttribute("list_category", list_cat);
                rd=request.getRequestDispatcher("views/admin_page/edit_product.jsp");
                rd.forward(request, response);
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
