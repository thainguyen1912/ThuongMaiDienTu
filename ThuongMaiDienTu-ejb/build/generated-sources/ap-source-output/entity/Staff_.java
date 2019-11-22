package entity;

import entity.Invoice;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-22T22:49:27")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-22T22:52:26")
>>>>>>> Stashed changes
@StaticMetamodel(Staff.class)
public class Staff_ { 

    public static volatile ListAttribute<Staff, Invoice> invoiceList;
    public static volatile SingularAttribute<Staff, Date> datebirth;
    public static volatile SingularAttribute<Staff, String> password;
    public static volatile SingularAttribute<Staff, String> address;
    public static volatile SingularAttribute<Staff, String> gender;
    public static volatile SingularAttribute<Staff, String> phonenumber;
    public static volatile SingularAttribute<Staff, Integer> idstaff;
    public static volatile SingularAttribute<Staff, String> staffname;
    public static volatile SingularAttribute<Staff, String> permission;
    public static volatile SingularAttribute<Staff, String> username;

}