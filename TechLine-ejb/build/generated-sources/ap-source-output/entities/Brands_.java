package entities;

import entities.ProductTypes;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2017-12-17T19:46:43")
@StaticMetamodel(Brands.class)
public class Brands_ { 

    public static volatile SingularAttribute<Brands, String> brandIcon;
    public static volatile SingularAttribute<Brands, Boolean> brandStatus;
    public static volatile SingularAttribute<Brands, String> brandId;
    public static volatile SingularAttribute<Brands, String> brandName;
    public static volatile SingularAttribute<Brands, ProductTypes> typeId;

}