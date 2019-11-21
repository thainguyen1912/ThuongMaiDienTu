/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import Connnection.DBConnection;
import entity.Customer;
import entity.Invoice;
import entity.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author admins
 */
@Stateless
@LocalBean
public class Invoice_s {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public List<Invoice> getAll(){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Invoice> list_inv = new ArrayList<>();
        String sql="select * from tmdt.invoice";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int id=rs.getInt("idinvoice");
                Staff staff=new Staff_s().getStaffByID(rs.getInt("idstaff"));             
                Customer customer = new Customer_s().getCustomerByID(rs.getInt("idcustomer"));
                long total = rs.getLong("totalmoney");   
                String status = rs.getString("status");
                Invoice inv = new Invoice(id, total, status, customer, staff);
                list_inv.add(inv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Category_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_inv;
    }
}
