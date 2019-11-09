package entity;

import entity.Customer;
import entity.Staff;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-09T10:25:02")
@StaticMetamodel(Invoice.class)
public class Invoice_ { 

    public static volatile SingularAttribute<Invoice, Customer> idcustomer;
    public static volatile SingularAttribute<Invoice, Staff> idstaff;
    public static volatile SingularAttribute<Invoice, BigInteger> totalmoney;
    public static volatile SingularAttribute<Invoice, Integer> idinvoice;

}