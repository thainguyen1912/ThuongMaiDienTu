package entity;

import entity.Invoice;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-14T09:22:18")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile ListAttribute<Customer, Invoice> invoiceList;
    public static volatile SingularAttribute<Customer, Date> datebirth;
    public static volatile SingularAttribute<Customer, String> password;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile SingularAttribute<Customer, String> gender;
    public static volatile SingularAttribute<Customer, Integer> idcustomer;
    public static volatile SingularAttribute<Customer, String> phonenumber;
    public static volatile SingularAttribute<Customer, String> transport;
    public static volatile SingularAttribute<Customer, String> customername;
    public static volatile SingularAttribute<Customer, String> username;

}