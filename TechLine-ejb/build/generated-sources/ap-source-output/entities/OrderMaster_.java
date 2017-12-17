package entities;

import entities.OrderAddress;
import entities.OrderDetails;
import entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-17T19:46:43")
@StaticMetamodel(OrderMaster.class)
public class OrderMaster_ { 

    public static volatile SingularAttribute<OrderMaster, Date> dateOrdered;
    public static volatile SingularAttribute<OrderMaster, Double> orderTotalPrice;
    public static volatile SingularAttribute<OrderMaster, Double> deliveryPrice;
    public static volatile SingularAttribute<OrderMaster, String> orderNote;
    public static volatile SingularAttribute<OrderMaster, Users> userId;
    public static volatile SingularAttribute<OrderMaster, String> orderMId;
    public static volatile SingularAttribute<OrderMaster, OrderAddress> orderAddress;
    public static volatile SingularAttribute<OrderMaster, String> orderStatus;
    public static volatile CollectionAttribute<OrderMaster, OrderDetails> orderDetailsCollection;

}