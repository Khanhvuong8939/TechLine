package entities;

import entities.Brands;
import entities.Categories;
import entities.Products;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-17T19:46:43")
@StaticMetamodel(ProductTypes.class)
public class ProductTypes_ { 

    public static volatile SingularAttribute<ProductTypes, String> typeName;
    public static volatile SingularAttribute<ProductTypes, String> typeIcon;
    public static volatile CollectionAttribute<ProductTypes, Products> productsCollection;
    public static volatile SingularAttribute<ProductTypes, Categories> categoryId;
    public static volatile SingularAttribute<ProductTypes, Boolean> typeStatus;
    public static volatile CollectionAttribute<ProductTypes, Brands> brandsCollection;
    public static volatile SingularAttribute<ProductTypes, String> typeDesc;
    public static volatile SingularAttribute<ProductTypes, String> typeId;

}