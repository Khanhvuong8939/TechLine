/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nth15
 */
@Entity
@Table(name = "Brands", catalog = "TechLine", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Brands.findAll", query = "SELECT b FROM Brands b"),
    @NamedQuery(name = "Brands.findByBrandId", query = "SELECT b FROM Brands b WHERE b.brandId = :brandId"),
    @NamedQuery(name = "Brands.findByBrandName", query = "SELECT b FROM Brands b WHERE b.brandName = :brandName"),
    @NamedQuery(name = "Brands.findByBrandIcon", query = "SELECT b FROM Brands b WHERE b.brandIcon = :brandIcon"),
    @NamedQuery(name = "Brands.findByBrandStatus", query = "SELECT b FROM Brands b WHERE b.brandStatus = :brandStatus")})
public class Brands implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "brandId", nullable = false, length = 10)
    private String brandId;
    @Size(max = 100)
    @Column(name = "brandName", length = 100)
    private String brandName;
    @Size(max = 100)
    @Column(name = "brandIcon", length = 100)
    private String brandIcon;
    @Column(name = "brandStatus")
    private Boolean brandStatus;
    @JoinColumn(name = "typeId", referencedColumnName = "typeId")
    @ManyToOne
    private ProductTypes typeId;

    public Brands() {
    }

    public Brands(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandIcon() {
        return brandIcon;
    }

    public void setBrandIcon(String brandIcon) {
        this.brandIcon = brandIcon;
    }

    public Boolean getBrandStatus() {
        return brandStatus;
    }

    public void setBrandStatus(Boolean brandStatus) {
        this.brandStatus = brandStatus;
    }

    public ProductTypes getTypeId() {
        return typeId;
    }

    public void setTypeId(ProductTypes typeId) {
        this.typeId = typeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brandId != null ? brandId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Brands)) {
            return false;
        }
        Brands other = (Brands) object;
        if ((this.brandId == null && other.brandId != null) || (this.brandId != null && !this.brandId.equals(other.brandId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Brands[ brandId=" + brandId + " ]";
    }
    
}
