package entities;

import entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-26T00:23:02")
@StaticMetamodel(Seller.class)
public class Seller_ { 

    public static volatile SingularAttribute<Seller, Users> users;
    public static volatile SingularAttribute<Seller, String> storeName;
    public static volatile SingularAttribute<Seller, String> userId;
    public static volatile SingularAttribute<Seller, String> storeAddress;
    public static volatile SingularAttribute<Seller, String> storeSummary;
    public static volatile SingularAttribute<Seller, String> identityCard;
    public static volatile SingularAttribute<Seller, String> approvedPlace;
    public static volatile SingularAttribute<Seller, String> storeIcon;
    public static volatile SingularAttribute<Seller, String> approvedDate;

}