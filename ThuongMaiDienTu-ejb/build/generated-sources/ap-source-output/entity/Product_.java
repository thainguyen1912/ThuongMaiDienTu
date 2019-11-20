package entity;

import entity.Category;
import entity.Invoicedetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-20T22:38:22")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Integer> idproduct;
    public static volatile ListAttribute<Product, Invoicedetails> invoicedetailsList;
    public static volatile SingularAttribute<Product, Integer> amountnow;
    public static volatile SingularAttribute<Product, Long> priceoutput;
    public static volatile SingularAttribute<Product, Category> idcategory;
    public static volatile SingularAttribute<Product, Long> priceinput;
    public static volatile SingularAttribute<Product, String> productname;
    public static volatile SingularAttribute<Product, Integer> amountpaid;
    public static volatile SingularAttribute<Product, String> productimage;
    public static volatile SingularAttribute<Product, String> moreinfo;

}