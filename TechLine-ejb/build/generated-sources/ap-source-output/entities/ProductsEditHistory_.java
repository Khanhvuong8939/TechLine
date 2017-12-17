package entities;

import entities.Products;
import entities.ProductsEditHistoryPK;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-17T19:46:43")
@StaticMetamodel(ProductsEditHistory.class)
public class ProductsEditHistory_ { 

    public static volatile SingularAttribute<ProductsEditHistory, ProductsEditHistoryPK> productsEditHistoryPK;
    public static volatile SingularAttribute<ProductsEditHistory, Date> editTime;
    public static volatile SingularAttribute<ProductsEditHistory, Integer> productDiscount;
    public static volatile SingularAttribute<ProductsEditHistory, String> productName;
    public static volatile SingularAttribute<ProductsEditHistory, Double> productPrice;
    public static volatile SingularAttribute<ProductsEditHistory, Products> products;

}