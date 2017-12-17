package entities;

import entities.Products;
import entities.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-17T19:46:43")
@StaticMetamodel(ProductsComment.class)
public class ProductsComment_ { 

    public static volatile SingularAttribute<ProductsComment, Boolean> commentStatus;
    public static volatile SingularAttribute<ProductsComment, Users> userId;
    public static volatile SingularAttribute<ProductsComment, String> commentID;
    public static volatile SingularAttribute<ProductsComment, String> commentContent;
    public static volatile SingularAttribute<ProductsComment, Products> productId;

}