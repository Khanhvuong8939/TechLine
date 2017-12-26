package entities;

import entities.ProductRatingPK;
import entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-26T00:23:02")
@StaticMetamodel(ProductRating.class)
public class ProductRating_ { 

    public static volatile SingularAttribute<ProductRating, ProductRatingPK> productRatingPK;
    public static volatile SingularAttribute<ProductRating, Integer> count;
    public static volatile SingularAttribute<ProductRating, Products> products;

}