package entity;

import entity.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-21T19:31:37")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, Integer> idcategory;
    public static volatile SingularAttribute<Category, String> categoryname;
    public static volatile ListAttribute<Category, Product> productList;
    public static volatile SingularAttribute<Category, String> status;

}