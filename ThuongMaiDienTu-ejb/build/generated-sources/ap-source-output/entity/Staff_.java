package entity;

import entity.Invoice;
import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-20T22:38:22")

@StaticMetamodel(Staff.class)
public class Staff_ { 

    public static volatile ListAttribute<Staff, Invoice> invoiceList;
    public static volatile SingularAttribute<Staff, Date> datebirth;
    public static volatile SingularAttribute<Staff, String> password;
    public static volatile SingularAttribute<Staff, String> address;
    public static volatile SingularAttribute<Staff, String> gender;
    public static volatile SingularAttribute<Staff, Integer> idstaff;
    public static volatile SingularAttribute<Staff, String> phonenumber;
    public static volatile SingularAttribute<Staff, String> staffname;
    public static volatile SingularAttribute<Staff, String> permission;
    public static volatile SingularAttribute<Staff, String> username;

}