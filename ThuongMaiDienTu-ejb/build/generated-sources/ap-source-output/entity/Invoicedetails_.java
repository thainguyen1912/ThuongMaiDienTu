package entity;

import entity.InvoicedetailsPK;
import entity.Product;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-04T13:30:33")
@StaticMetamodel(Invoicedetails.class)
public class Invoicedetails_ { 

    public static volatile SingularAttribute<Invoicedetails, Integer> amount;
    public static volatile SingularAttribute<Invoicedetails, Product> product;
    public static volatile SingularAttribute<Invoicedetails, InvoicedetailsPK> invoicedetailsPK;
    public static volatile SingularAttribute<Invoicedetails, Integer> discount;
    public static volatile SingularAttribute<Invoicedetails, BigInteger> realprice;

}