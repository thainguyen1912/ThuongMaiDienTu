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
                List<entity.Staff> list_sta_a=staff_s.getAll();
                String staffName_a=request.getParameter("name");
                String gender_a=request.getParameter("gender");
                Date dateBirth_a=Date.valueOf(request.getParameter("datebirth"));
                String address_a=request.getParameter("address");
                String phoneNumber_a=request.getParameter("phonenumber");
                String permission_a=request.getParameter("permission");
                String userName_a=request.getParameter("username");
                String passWord_a=request.getParameter("password");
                
                boolean check_a=true;
                for(int i=0;i<list_sta_a.size();i++){
                    if(list_sta_a.get(i).getUsername().equals(userName_a)){
                        check_a=false;
                        break;
                    }
                }
                if(check_a==true){
                    entity.Staff sta_a=new entity.Staff(staffName_a, gender_a, dateBirth_a, address_a, phoneNumber_a, permission_a, userName_a, passWord_a);
                    staff_s.insert(sta_a);
                    response.sendRedirect("Staff");
                }
                else{
                    response.sendRedirect("AddControl?page=staff");
                }
                break;
            case "edit":
                List<entity.Staff> list_sta_e=staff_s.getAll();
                int id=Integer.valueOf(request.getParameter("id"));
                String staffName_e=request.getParameter("name");
                String gender_e=request.getParameter("gender");
                Date dateBirth_e=Date.valueOf(request.getParameter("datebirth"));
                String address_e=request.getParameter("address");
                String phoneNumber_e=request.getParameter("phonenumber");
                String permission_e=request.getParameter("permission");
                String userName_e=request.getParameter("username");
                String passWord_e=request.getParameter("password");
                
                boolean check_e=true;
                for(int i=0;i<list_sta_e.size();i++){
                    if(list_sta_e.get(i).getUsername().equals(userName_e)){
                        check_e=false;
                        break;
                    }
                }
                if(check_e==true){
                    entity.Staff sta_e=new entity.Staff(id, staffName_e, gender_e, dateBirth_e, address_e, phoneNumber_e, permission_e, userName_e, passWord_e);
                    staff_s.update(sta_e);
                    response.sendRedirect("Staff");
                }
                else{
                    response.sendRedirect("AddControl?page=staff");
                }
                break;
            case "delete":
                int id_d=Integer.valueOf(request.getParameter("id"));
                staff_s.delete(id_d);
                response.sendRedirect("Staff");
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
