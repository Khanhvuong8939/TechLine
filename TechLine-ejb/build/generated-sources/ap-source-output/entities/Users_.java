package entities;

import entities.Customers;
import entities.OrderAddress;
import entities.OrderMaster;
import entities.Products;
import entities.ProductsComment;
import entities.Seller;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-26T00:23:02")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> phone;
    public static volatile CollectionAttribute<Users, OrderAddress> orderAddressCollection;
    public static volatile SingularAttribute<Users, Customers> customers;
    public static volatile SingularAttribute<Users, Seller> seller;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile CollectionAttribute<Users, OrderMaster> orderMasterCollection;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile CollectionAttribute<Users, Products> productsCollection;
    public static volatile SingularAttribute<Users, String> userId;
    public static volatile SingularAttribute<Users, Boolean> userStatus;
    public static volatile SingularAttribute<Users, String> role;
    public static volatile CollectionAttribute<Users, ProductsComment> productsCommentCollection;
    public static volatile SingularAttribute<Users, String> fullname;

}