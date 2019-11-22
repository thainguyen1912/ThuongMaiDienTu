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
                Product pro=new Product(idProduct, productName, amountNow, amountPaid, priceInput, priceoutput, productImage, moreInfo, category);
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
                Product pro=new Product(idProduct, productName, amountNow, amountPaid, priceInput, priceoutput, productImage, moreInfo, category);
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
                Product pro=new Product(idProduct, productName, amountNow, amountPaid, priceInput, priceoutput, productImage, moreInfo, category);
                list_pro.add(pro);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_pro;
    }
    public List<Product> getListLapTop(){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Product> list_pro=new ArrayList<Product>();
        String sql="select * from tmdt.product where idcategory= 3 ";
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
                Product pro=new Product(idProduct, productName, amountNow, amountPaid, priceInput, priceoutput, productImage, moreInfo, category);
                list_pro.add(pro);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_pro;
    }
    
    public List<Product> getListSmartPhone(){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Product> list_pro=new ArrayList<Product>();
        String sql="select * from tmdt.product where idcategory= 1 ";
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
                Product pro=new Product(idProduct, productName, amountNow, amountPaid, priceInput, priceoutput, productImage, moreInfo, category);
                list_pro.add(pro);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_pro;
    }
    
    public List<Product> getListTivi(){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Product> list_pro=new ArrayList<Product>();
        String sql="select * from tmdt.product where idcategory= 2 ";
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
                Product pro=new Product(idProduct, productName, amountNow, amountPaid, priceInput, priceoutput, productImage, moreInfo, category);
                list_pro.add(pro);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_pro;
    }
    
    public List<Product> getListMayAnh(){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        List<Product> list_pro=new ArrayList<Product>();
        String sql="select * from tmdt.product where idcategory= 4 ";
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
                Product pro=new Product(idProduct, productName, amountNow, amountPaid, priceInput, priceoutput, productImage, moreInfo, category);
                list_pro.add(pro);
            }
        } catch (SQLException ex) { 
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list_pro;
    }
    public Product getById(int id){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        Product pro=null;
        String sql="select * from tmdt.product where idproduct='"+id+"'";
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
                pro=new Product(idProduct, productName, amountNow, amountPaid, priceInput, priceoutput, productImage, moreInfo, category);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pro;
    }
    
    public int selectCount(int idCat){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        int count =0;
        String sql="select count(idproduct) as 'count' from tmdt.product where idcategory=?";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);
            pre.setInt(1, idCat);
            ResultSet rs=pre.executeQuery();
            if(rs.next()){
                count=rs.getInt("count");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    public int insert(Product pro){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        int n=0;
        String sql="insert into tmdt.product(idcategory, productname, amountnow, amountpaid, priceinput, priceoutput, productimage, moreinfo)"
                + " values(?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);
            pre.setInt(1, pro.getIdcategory().getIdcategory());
            pre.setString(2, pro.getProductname());
            pre.setInt(3, pro.getAmountnow());
            pre.setInt(4, pro.getAmountpaid());
            pre.setLong(5, pro.getPriceinput());
            pre.setLong(6, pro.getPriceoutput());
            pre.setString(7, pro.getProductimage());
            pre.setString(8, pro.getMoreinfo());
            n=pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    public int update(Product pro){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        int n=0;
        String sql="update tmdt.product set idcategory=?, productname=?, amountnow=?, amountpaid=?,"
                + " priceinput=?, priceoutput=?, productimage=?, moreinfo=? where idproduct=?";
        PreparedStatement pre;
        try {
            pre = conn.prepareStatement(sql);
            pre.setInt(1, pro.getIdcategory().getIdcategory());
            pre.setString(2, pro.getProductname());
            pre.setInt(3, pro.getAmountnow());
            pre.setInt(4, pro.getAmountpaid());
            pre.setLong(5, pro.getPriceinput());
            pre.setLong(6, pro.getPriceoutput());
            pre.setString(7, pro.getProductimage());
            pre.setString(8, pro.getMoreinfo());
            pre.setInt(9, pro.getIdproduct());
            n=pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Product_s.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    public int delete(int id){
        DBConnection db=new DBConnection();
        Connection conn=db.getConnect();
        int n=0;
        String sql="delete from tmdt.product where idproduct=?";
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
