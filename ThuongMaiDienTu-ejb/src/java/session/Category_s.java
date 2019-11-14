
package session;

import Connnection.DBConnection;
import entity.Category;
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

@Stateless
@LocalBean
public class Category_s{
    
    
    
    public List<Category> getAll(){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Category> list_cat=new ArrayList<>();
        String sql="select * from tmdt.category";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int id=rs.getInt("idcategory");
                String name=rs.getString("categoryname");
                String status=rs.getString("status");
                Category cat=new Category(id, name, status);
                list_cat.add(cat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Category_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_cat;
    }
    public Category selectCategoryByID(int idCate){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        Category cat=null;
        String sql="select * from tmdt.category where idcategory='"+idCate+"'";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            if(rs.next()){
                int id=rs.getInt("idcategory");
                String name=rs.getString("categoryname");
                String status=rs.getString("status");
                cat=new Category(id, name, status);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Category_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cat;
    }
    
    public int insert(Category cat){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        String sql="insert into tmdt.category(categoryname, status) values(?, ?)";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1, cat.getCategoryname());
            pre.setString(2, cat.getStatus());
            return pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Category_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public int update(Category cat){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        String sql="update tmdt.category set categoryname=?, status=? where idcategory=?";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);
            pre.setString(1, cat.getCategoryname());
            pre.setString(2, cat.getStatus());
            pre.setInt(3, cat.getIdcategory());
            return pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Category_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public int delete(int id){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        int n=0;
        String sql="delete from tmdt.category where idcategory=?";
        try {
            PreparedStatement pre=conn.prepareStatement(sql);
            pre.setInt(1, id);
            n=pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Category_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
}
