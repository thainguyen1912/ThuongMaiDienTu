
package session;

import Connnection.DBConnection;
import entity.Category;
import java.sql.Connection;
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
            while(rs.next()){
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
}
