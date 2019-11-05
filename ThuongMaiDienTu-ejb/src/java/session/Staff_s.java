/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import Connnection.DBConnection;
import entity.Staff;
import java.sql.Connection;
import java.sql.Date;
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
 * @author thain
 */
@Stateless
@LocalBean
public class Staff_s {

    public List<Staff> getAll(){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Staff> list_sta=new ArrayList<Staff>();
        String sql="select * from tmdt.staff";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int idStaff=rs.getInt("idstaff");
                String staffName=rs.getString("staffname");
                String gender=rs.getString("gender");
                Date dateBirth=rs.getDate("datebirth");
                String address=rs.getString("address");
                String phoneNumber=rs.getString("phonenumber");
                Staff sta=new Staff(idStaff, staffName, gender, dateBirth, address, phoneNumber);
                list_sta.add(sta);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Staff_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_sta;
    }
}
