package entity;

import entity.InvoicedetailsPK;
import entity.Product;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-22T16:52:47")
@StaticMetamodel(Invoicedetails.class)
public class Invoicedetails_ { 

    public static volatile SingularAttribute<Invoicedetails, Integer> amount;
    public static volatile SingularAttribute<Invoicedetails, Product> product;
    public static volatile SingularAttribute<Invoicedetails, InvoicedetailsPK> invoicedetailsPK;
    public static volatile SingularAttribute<Invoicedetails, Integer> discount;
    public static volatile SingularAttribute<Invoicedetails, String> style;
    public static volatile SingularAttribute<Invoicedetails, Date> datecreate;
    public static volatile SingularAttribute<Invoicedetails, Long> realprice;
    public static volatile SingularAttribute<Invoicedetails, Date> datepay;
    public static volatile SingularAttribute<Invoicedetails, String> status;
    public static volatile SingularAttribute<Invoicedetails, String> moreinfo;

}