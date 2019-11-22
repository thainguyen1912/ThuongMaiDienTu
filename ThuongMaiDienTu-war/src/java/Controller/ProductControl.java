/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import session.Category_s;
import session.Product_s;

/**
 *
 * @author thain
 */
@WebServlet(name = "ProductControl", urlPatterns = {"/ProductControl"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB 
        maxFileSize = 1024 * 1024 * 50, // 50 MB
        maxRequestSize = 1024 * 1024 * 100, // 100 MB
        location = "D:/Java/ThuongMaiDienTu/ThuongMaiDienTu-war/web/resources/home_page/images/product")
public class ProductControl extends HttpServlet {

    @EJB
    private Product_s product_s;

    @EJB
    private Category_s category_s;

    public static final String SAVE_DIRECTORY = "product";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");

        String page = request.getParameter("page");
        switch (page) {
            case "add":
                String productName_a = request.getParameter("productname");
                int idCategory_a = Integer.valueOf(request.getParameter("idcategory"));
                entity.Category cat_a = category_s.selectCategoryByID(idCategory_a);
                int amountNow_a = Integer.valueOf(request.getParameter("amountnow"));
                long priceInput_a = Long.valueOf(request.getParameter("priceinput"));
                String moreInfo_a = request.getParameter("moreinfo");

                String filePath = "";
                String fileName_a = "";
                for (Part part : request.getParts()) {
                    if (part.getName().equals("image")) {
                        fileName_a = extractFileName(part);
                        entity.Product pro = new entity.Product(productName_a, amountNow_a, 0, priceInput_a, 0, fileName_a, moreInfo_a, cat_a);
                        product_s.insert(pro);

                        if (fileName_a != null && fileName_a.length() > 0) {
                            part.write(fileName_a);
                        }
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        response.sendRedirect("Product");
                    }
                }

                break;
            case "edit":
                int idProduct=Integer.valueOf(request.getParameter("idproduct"));
                String productName_e = request.getParameter("productname");
                int idCategory_e = Integer.valueOf(request.getParameter("idcategory"));
                entity.Category cat_e = category_s.selectCategoryByID(idCategory_e);
                int amountNow_e = Integer.valueOf(request.getParameter("amountnow"));
                int amountPaid_e = Integer.valueOf(request.getParameter("amountpaid"));
                long priceInput_e = Long.valueOf(request.getParameter("priceinput"));
                long priceOutput_e = Long.valueOf(request.getParameter("priceoutput"));
                String moreInfo_e = request.getParameter("moreinfo");

                String fileName_e = "";
                for (Part part : request.getParts()) {
                    if (part.getName().equals("image")) {
                        fileName_e = extractFileName(part);
                        entity.Product pro = new entity.Product(idProduct, productName_e, amountNow_e, amountPaid_e, priceInput_e, priceOutput_e, fileName_e, moreInfo_e, cat_e);
                        product_s.update(pro);

                        if (fileName_e != null && fileName_e.length() > 0) {
                            part.write(fileName_e);
                        }
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        response.sendRedirect("Product");
                    }
                }
                break;
            case "delete":
                int id_d=Integer.valueOf(request.getParameter("id"));
                product_s.delete(id_d);
                response.sendRedirect("Product");
                break;
            case "detail":
                int idProduct_d=Integer.valueOf(request.getParameter("idproduct"));
                String productName_d = request.getParameter("productname");
                int idCategory_d = Integer.valueOf(request.getParameter("idcategory"));
                entity.Category cat_d = category_s.selectCategoryByID(idCategory_d);
                int amountNow_d = Integer.valueOf(request.getParameter("amountnow"));
                int amountPaid_d = Integer.valueOf(request.getParameter("amountpaid"));
                long priceInput_d = Long.valueOf(request.getParameter("priceinput"));
                long priceOutput_d = Long.valueOf(request.getParameter("priceoutput"));
                String moreInfo_d = request.getParameter("moreinfo");

                String fileName_d = "";
                for (Part part : request.getParts()) {
                    if (part.getName().equals("image")) {
                        fileName_e = extractFileName(part);
                        entity.Product pro = new entity.Product(idProduct_d, productName_d, amountNow_d, amountPaid_d, priceInput_d, priceOutput_d, fileName_d, moreInfo_d, cat_d);
                        product_s.update(pro);

                        if (fileName_e != null && fileName_e.length() > 0) {
                            part.write(fileName_e);
                        }
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ProductControl.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        response.sendRedirect("Product");
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

    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }
}
