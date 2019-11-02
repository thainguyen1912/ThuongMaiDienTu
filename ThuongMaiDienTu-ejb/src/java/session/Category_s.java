
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
        List<Category> list_cat=new ArrayList<Category>();
        String sql="select * from tmdt.category";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int id=rs.getInt("idcategory");
                String name=rs.getString("categoryname");
                Category cat=new Category(id, name);
                list_cat.add(cat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Category_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_cat;
    }
}
