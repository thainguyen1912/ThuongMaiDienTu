/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import Connnection.DBConnection;
import entity.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author thain
 */
@Stateless
@LocalBean
public class Customer_s {

    public List<Customer> getAll(){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Customer> list_cus=new ArrayList<Customer>();
        String sql="select * from tmdt.customer";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int idCustomer=rs.getInt("idcustomer");
                String customerName=rs.getString("customername");
                String gender=rs.getString("gender");
                Date dateBirth=rs.getDate("datebirth");
                String address=rs.getString("address");
                String phoneNumber=rs.getString("phonenumber");
                String transport=rs.getString("transport");
                String userName=rs.getString("username");
                String passWord=rs.getString("password");
                
                Customer cus=new Customer(idCustomer, customerName, gender, dateBirth, address, phoneNumber, transport, userName, passWord);
                list_cus.add(cus);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Customer_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_cus;
    }
}
