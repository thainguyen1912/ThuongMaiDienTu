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
 * @author thain
 */
@Stateless
@LocalBean
public class Staff_s {

    public List<Staff> getAll(){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Staff> list_sta=new ArrayList<Staff>();
        String sql="select * from tmdt.staff where permission='0'";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int idStaff=rs.getInt("idstaff");
                String staffName=rs.getString("staffname");
                String gender=rs.getString("gender");
                Date dateBirth=rs.getDate("datebirth");
                String address=rs.getString("address");
                String phoneNumber=rs.getString("phonenumber");
                String permission=rs.getString("permission");
                String userName=rs.getString("username");
                String password=rs.getString("password");
                Staff sta=new Staff(idStaff, staffName, gender, dateBirth, address, phoneNumber, permission, userName, password);
                list_sta.add(sta);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Staff_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_sta;
    }
    public Staff getByID(int id){
        Staff sta=null;
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        String sql="select * from tmdt.staff where idstaff='"+id+"'";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int idStaff=rs.getInt("idstaff");
                String staffName=rs.getString("staffname");
                String gender=rs.getString("gender");
                Date dateBirth=rs.getDate("datebirth");
                String address=rs.getString("address");
                String phoneNumber=rs.getString("phonenumber");
                String permission=rs.getString("permission");
                String userName=rs.getString("username");
                String password=rs.getString("password");
                sta=new Staff(idStaff, staffName, gender, dateBirth, address, phoneNumber, permission, userName, password);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Staff_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sta;
    }
    public Staff getByUserPass(String user, String pass){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        Staff sta=null;
        String sql="select * from tmdt.staff where username='"+user+"' and password='"+pass+"'";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int idStaff=rs.getInt("idstaff");
                String staffName=rs.getString("staffname");
                String gender=rs.getString("gender");
                Date dateBirth=rs.getDate("datebirth");
                String address=rs.getString("address");
                String phoneNumber=rs.getString("phonenumber");
                String permission=rs.getString("permission");
                String userName=rs.getString("username");
                String password=rs.getString("password");
                sta=new Staff(idStaff, staffName, gender, dateBirth, address, phoneNumber, permission, userName, password);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sta;
    }

    public int insert(Staff sta){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        int n=0;
        String sql="insert into tmdt.staff(staffname, gender, datebirth, address, phonenumber, permission, username, password) "
                + " values(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement  pre=conn.prepareStatement(sql);
            pre.setString(1, sta.getStaffname());
            pre.setString(2, sta.getGender());
            pre.setDate(3, sta.getDatebirth());
            pre.setString(4, sta.getAddress());
            pre.setString(5, sta.getPhonenumber());
            pre.setString(6, sta.getPermission());
            pre.setString(7, sta.getUsername());
            pre.setString(8, sta.getPassword());
            n=pre.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Staff_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    public int update(Staff sta){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        int n=0;
        String sql="update tmdt.staff set staffname=?, gender=?, datebirth=?, address=?, phonenumber=?, permission=?, username=?, password=? where idstaff=?";
        try {
            PreparedStatement pre=conn.prepareStatement(sql);
            pre.setString(1, sta.getStaffname());
            pre.setString(2, sta.getGender());
            pre.setDate(3, sta.getDatebirth());
            pre.setString(4, sta.getAddress());
            pre.setString(5, sta.getPhonenumber());
            pre.setString(6, sta.getPermission());
            pre.setString(7, sta.getUsername());
            pre.setString(8, sta.getPassword());
            pre.setInt(9, sta.getIdstaff());
            n=pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Staff_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    public int delete(int id){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        int n=0;
        String sql="delete from tmdt.staff where idstaff=?";
        try {
            PreparedStatement pre=conn.prepareStatement(sql);
            pre.setInt(1, id);
            n=pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Category_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    public Staff getStaffByID(int idSta){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        Staff sta=null;
        String sql="select * from tmdt.staff where idstaff='"+idSta+"'";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int idStaff=rs.getInt("idstaff");
                String staffName=rs.getString("staffname");
                String gender=rs.getString("gender");
                Date dateBirth=rs.getDate("datebirth");
                String address=rs.getString("address");
                String phoneNumber=rs.getString("phonenumber");
                String permission=rs.getString("permission");
                String userName=rs.getString("username");
                String password=rs.getString("password");
                sta=new Staff(idStaff, staffName, gender, dateBirth, address, phoneNumber, permission, userName, password);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Customer_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sta;

    }
}
