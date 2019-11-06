/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import Connnection.DBConnection;
import entity.Category;
import entity.Product;
import java.math.BigInteger;
import java.sql.Connection;
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
public class Product_s {

    public List<Product> getAll(){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Product> list_pro=new ArrayList<Product>();
        String sql="select * from tmdt.product";
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int idProduct=rs.getInt("idproduct");
                Category  category=new Category_s().selectCategoryByID(rs.getInt("idcategory"));
                String productName=rs.getString("productname");
                int amountNow=rs.getInt("amountnow");
                int amountPaid=rs.getInt("amountpaid");
                long priceInput=rs.getLong("priceinput");
                long priceoutput=rs.getLong("priceoutput");
                String productImage=rs.getString("productimage");
                String moreInfo=rs.getString("moreinfo");
                Product pro=new Product(idProduct, productName, amountNow, amountPaid, BigInteger.valueOf(priceInput), BigInteger.valueOf(priceoutput), productImage, moreInfo, category);
                list_pro.add(pro);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_pro;
    }
    public List<Product> selectTopByIdCat(int idCat, int limit){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Product> list_pro=new ArrayList<Product>();
        String sql="select * from tmdt.product where idcategory='"+idCat+"' order by amountpaid desc limit "+limit;
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int idProduct=rs.getInt("idproduct");
                Category  category=new Category_s().selectCategoryByID(rs.getInt("idcategory"));
                String productName=rs.getString("productname");
                int amountNow=rs.getInt("amountnow");
                int amountPaid=rs.getInt("amountpaid");
                long priceInput=rs.getLong("priceinput");
                long priceoutput=rs.getLong("priceoutput");
                String productImage=rs.getString("productimage");
                String moreInfo=rs.getString("moreinfo");
                Product pro=new Product(idProduct, productName, amountNow, amountPaid, BigInteger.valueOf(priceInput), BigInteger.valueOf(priceoutput), productImage, moreInfo, category);
                list_pro.add(pro);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_pro;
    }
    public List<Product> selectTop(int limit){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Product> list_pro=new ArrayList<Product>();
        String sql="select * from tmdt.product order by amountpaid desc limit "+limit;
        try {
            ResultSet rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                int idProduct=rs.getInt("idproduct");
                Category  category=new Category_s().selectCategoryByID(rs.getInt("idcategory"));
                String productName=rs.getString("productname");
                int amountNow=rs.getInt("amountnow");
                int amountPaid=rs.getInt("amountpaid");
                long priceInput=rs.getLong("priceinput");
                long priceoutput=rs.getLong("priceoutput");
                String productImage=rs.getString("productimage");
                String moreInfo=rs.getString("moreinfo");
                Product pro=new Product(idProduct, productName, amountNow, amountPaid, BigInteger.valueOf(priceInput), BigInteger.valueOf(priceoutput), productImage, moreInfo, category);
                list_pro.add(pro);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_pro;
    }
}
