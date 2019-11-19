/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.Staff_s;

/**
 *
 * @author thain
 */
@WebServlet(name = "StaffControl", urlPatterns = {"/StaffControl"})
public class StaffControl extends HttpServlet {

    @EJB
    private Staff_s staff_s;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        
        String page=request.getParameter("page");
        switch(page){
            case "add":
                List<entity.Staff> list_sta=staff_s.getAll();
                String staffName=request.getParameter("name");
                String gender=request.getParameter("gender");
                Date dateBirth=Date.valueOf(request.getParameter("datebirth"));
                String address=request.getParameter("address");
                String phoneNumber=request.getParameter("phonenumber");
                String permission=request.getParameter("permission");
                String userName=request.getParameter("username");
                String passWord=request.getParameter("password");
                
                boolean check=true;
                for(int i=0;i<list_sta.size();i++){
                    if(list_sta.get(i).getUsername().equals(userName)){
                        check=false;
                        break;
                    }
                }
                if(check==true){
                    entity.Staff sta=new entity.Staff(staffName, gender, dateBirth, address, phoneNumber, permission, userName, passWord);
                    staff_s.insert(sta);
                    response.sendRedirect("Staff");
                }
                else{
                    response.sendRedirect("AddControl?page=staff");
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
