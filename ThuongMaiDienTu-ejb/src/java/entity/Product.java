/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author thain
 */
@Entity
@Table(name = "product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findByIdproduct", query = "SELECT p FROM Product p WHERE p.idproduct = :idproduct")
    , @NamedQuery(name = "Product.findByProductname", query = "SELECT p FROM Product p WHERE p.productname = :productname")
    , @NamedQuery(name = "Product.findByAmount", query = "SELECT p FROM Product p WHERE p.amount = :amount")
    , @NamedQuery(name = "Product.findByPriceinput", query = "SELECT p FROM Product p WHERE p.priceinput = :priceinput")
    , @NamedQuery(name = "Product.findByPriceoutput", query = "SELECT p FROM Product p WHERE p.priceoutput = :priceoutput")
    , @NamedQuery(name = "Product.findByProductimage", query = "SELECT p FROM Product p WHERE p.productimage = :productimage")
    , @NamedQuery(name = "Product.findByMoreinfo", query = "SELECT p FROM Product p WHERE p.moreinfo = :moreinfo")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproduct")
    private Integer idproduct;
    @Size(max = 45)
    @Column(name = "productname")
    private String productname;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "priceinput")
    private BigInteger priceinput;
    @Column(name = "priceoutput")
    private BigInteger priceoutput;
    @Size(max = 45)
    @Column(name = "productimage")
    private String productimage;
    @Size(max = 100)
    @Column(name = "moreinfo")
    private String moreinfo;
    @JoinColumn(name = "idcategory", referencedColumnName = "idcategory")
    @ManyToOne(optional = false)
    private Category idcategory;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Invoicedetails> invoicedetailsList;

    public Product() {
    }

    public Product(Integer idproduct) {
        this.idproduct = idproduct;
    }

    public Integer getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(Integer idproduct) {
        this.idproduct = idproduct;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigInteger getPriceinput() {
        return priceinput;
    }

    public void setPriceinput(BigInteger priceinput) {
        this.priceinput = priceinput;
    }

    public BigInteger getPriceoutput() {
        return priceoutput;
    }

    public void setPriceoutput(BigInteger priceoutput) {
        this.priceoutput = priceoutput;
    }

    public String getProductimage() {
        return productimage;
    }

    public void setProductimage(String productimage) {
        this.productimage = productimage;
    }

    public String getMoreinfo() {
        return moreinfo;
    }

    public void setMoreinfo(String moreinfo) {
        this.moreinfo = moreinfo;
    }

    public Category getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(Category idcategory) {
        this.idcategory = idcategory;
    }

    @XmlTransient
    public List<Invoicedetails> getInvoicedetailsList() {
        return invoicedetailsList;
    }

    public void setInvoicedetailsList(List<Invoicedetails> invoicedetailsList) {
        this.invoicedetailsList = invoicedetailsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproduct != null ? idproduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.idproduct == null && other.idproduct != null) || (this.idproduct != null && !this.idproduct.equals(other.idproduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Product[ idproduct=" + idproduct + " ]";
    }
    
}
