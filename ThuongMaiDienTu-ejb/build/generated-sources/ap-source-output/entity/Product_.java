package entity;

import entity.Category;
import entity.Invoicedetails;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-02T22:48:59")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> idproduct;
    public static volatile ListAttribute<Product, Invoicedetails> invoicedetailsList;
    public static volatile SingularAttribute<Product, Integer> amount;
    public static volatile SingularAttribute<Product, BigInteger> priceoutput;
    public static volatile SingularAttribute<Product, Category> idcategory;
    public static volatile SingularAttribute<Product, BigInteger> priceinput;
    public static volatile SingularAttribute<Product, String> productname;
    public static volatile SingularAttribute<Product, String> productimage;
    public static volatile SingularAttribute<Product, String> moreinfo;

}