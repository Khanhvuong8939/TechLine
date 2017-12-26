package entities;

import entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-26T00:23:02")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, Integer> point;
    public static volatile SingularAttribute<Customers, Users> users;
    public static volatile SingularAttribute<Customers, String> address;
    public static volatile SingularAttribute<Customers, String> userId;
    public static volatile SingularAttribute<Customers, String> dob;
    public static volatile SingularAttribute<Customers, String> gender;

}