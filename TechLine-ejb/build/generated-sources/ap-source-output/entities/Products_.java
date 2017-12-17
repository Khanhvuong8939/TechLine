package entities;

import entities.OrderDetails;
import entities.ProductRating;
import entities.ProductTypes;
import entities.ProductsComment;
import entities.ProductsEditHistory;
import entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-17T19:46:43")
@StaticMetamodel(Products.class)
public class Products_ { 

    public static volatile SingularAttribute<Products, Double> productWidth;
    public static volatile SingularAttribute<Products, Date> datePosted;
    public static volatile SingularAttribute<Products, Double> productLength;
    public static volatile SingularAttribute<Products, String> productSummary;
    public static volatile SingularAttribute<Products, String> productImage;
    public static volatile CollectionAttribute<Products, ProductsEditHistory> productsEditHistoryCollection;
    public static volatile SingularAttribute<Products, Integer> productDiscount;
    public static volatile SingularAttribute<Products, String> productUnit;
    public static volatile SingularAttribute<Products, String> productId;
    public static volatile SingularAttribute<Products, String> productDesc;
    public static volatile SingularAttribute<Products, Double> productRating;
    public static volatile SingularAttribute<Products, Boolean> productStatus;
    public static volatile SingularAttribute<Products, Users> userId;
    public static volatile SingularAttribute<Products, Double> productWeight;
    public static volatile SingularAttribute<Products, Integer> productQuantity;
    public static volatile CollectionAttribute<Products, ProductsComment> productsCommentCollection;
    public static volatile SingularAttribute<Products, Boolean> isApproved;
    public static volatile CollectionAttribute<Products, ProductRating> productRatingCollection;
    public static volatile SingularAttribute<Products, Double> productHeigth;
    public static volatile SingularAttribute<Products, Double> productPrice;
    public static volatile SingularAttribute<Products, String> productName;
    public static volatile SingularAttribute<Products, ProductTypes> typeId;
    public static volatile CollectionAttribute<Products, OrderDetails> orderDetailsCollection;

}