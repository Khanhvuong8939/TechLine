package entities;

import entities.OrderMaster;
import entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-17T19:46:43")
@StaticMetamodel(OrderAddress.class)
public class OrderAddress_ { 

    public static volatile SingularAttribute<OrderAddress, OrderMaster> orderMaster;
    public static volatile SingularAttribute<OrderAddress, String> orderPhone;
    public static volatile SingularAttribute<OrderAddress, Double> orderAddressLng;
    public static volatile SingularAttribute<OrderAddress, Double> orderAddressLat;
    public static volatile SingularAttribute<OrderAddress, Users> userId;
    public static volatile SingularAttribute<OrderAddress, String> orderMId;
    public static volatile SingularAttribute<OrderAddress, String> orderAddressDetail;

}