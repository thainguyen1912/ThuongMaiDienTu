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
 * @author jamen
 */
@WebServlet(name = "TypeProductController", urlPatterns = {"/TypeProductController"})
public class TypeProductController extends HttpServlet {

    @EJB
    private Category_s category_s;

    @EJB
    private Product_s product_s;
     
    

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
        
        String type_product=request.getParameter("type_product");
        RequestDispatcher rd=null;
        switch(type_product){
            case "laptop": 
                List<entity.Product> list_laptop=product_s.getListLapTop();
                
                request.setAttribute("list_laptop", list_laptop);
                rd=request.getRequestDispatcher("views/home_page/laptop_page.jsp");
                rd.forward(request, response);
                break;
            case "smartphone": 
                List<entity.Product> list_smartphone=product_s.getListSmartPhone();
                request.setAttribute("list_smartphone", list_smartphone);
                rd=request.getRequestDispatcher("views/home_page/smartphone_page.jsp");
                rd.forward(request, response);
                break;
            case "mayanh": 
                List<entity.Product> list_mayanh=product_s.getListMayAnh();
                request.setAttribute("list_mayanh", list_mayanh);
                rd=request.getRequestDispatcher("views/home_page/mayanh_page.jsp");
                rd.forward(request, response);
                break;
            case "tivi": 
                List<entity.Product> list_tivi=product_s.getListTivi();
                request.setAttribute("list_tivi", list_tivi);
                rd=request.getRequestDispatcher("views/home_page/tivi_page.jsp");
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
