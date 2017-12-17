package entities;

import entities.ProductTypes;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-17T19:46:43")
@StaticMetamodel(Categories.class)
public class Categories_ { 

    public static volatile SingularAttribute<Categories, String> categoryName;
    public static volatile SingularAttribute<Categories, String> categoryId;
    public static volatile SingularAttribute<Categories, Boolean> categoryStatus;
    public static volatile SingularAttribute<Categories, String> categoryIcon;
    public static volatile SingularAttribute<Categories, String> categoryDesc;
    public static volatile CollectionAttribute<Categories, ProductTypes> productTypesCollection;

}