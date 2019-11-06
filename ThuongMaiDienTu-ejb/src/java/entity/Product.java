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
    , @NamedQuery(name = "Product.findByAmountnow", query = "SELECT p FROM Product p WHERE p.amountnow = :amountnow")
    , @NamedQuery(name = "Product.findByAmountpaid", query = "SELECT p FROM Product p WHERE p.amountpaid = :amountpaid")
    , @NamedQuery(name = "Product.findByPriceinput", query = "SELECT p FROM Product p WHERE p.priceinput = :priceinput")
    , @NamedQuery(name = "Product.findByPriceoutput", query = "SELECT p FROM Product p WHERE p.priceoutput = :priceoutput")
    , @NamedQuery(name = "Product.findByProductimage", query = "SELECT p FROM Product p WHERE p.productimage = :productimage")
    , @NamedQuery(name = "Product.findByMoreinfo", query = "SELECT p FROM Product p WHERE p.moreinfo = :moreinfo")})
public class Product implements Serializable {

    @Size(max = 45)
    @Column(name = "productname")
    private String productname;
    @Size(max = 45)
    @Column(name = "productimage")
    private String productimage;
    @Size(max = 100)
    @Column(name = "moreinfo")
    private String moreinfo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Invoicedetails> invoicedetailsList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproduct")
    private Integer idproduct;
    @Column(name = "amountnow")
    private Integer amountnow;
    @Column(name = "amountpaid")
    private Integer amountpaid;
    @Column(name = "priceinput")
    private BigInteger priceinput;
    @Column(name = "priceoutput")
    private BigInteger priceoutput;
    @JoinColumn(name = "idcategory", referencedColumnName = "idcategory")
    @ManyToOne(optional = false)
    private Category idcategory;

    public Product() {
    }

    public Product(Integer idproduct, String productname, Integer amountnow, Integer amountpaid, BigInteger priceinput, BigInteger priceoutput, String productimage, String moreinfo, Category idcategory) {
        this.idproduct = idproduct;
        this.productname = productname;
        this.amountnow = amountnow;
        this.amountpaid = amountpaid;
        this.priceinput = priceinput;
        this.priceoutput = priceoutput;
        this.productimage = productimage;
        this.moreinfo = moreinfo;
        this.idcategory = idcategory;
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


    public Integer getAmountnow() {
        return amountnow;
    }

    public void setAmountnow(Integer amountnow) {
        this.amountnow = amountnow;
    }

    public Integer getAmountpaid() {
        return amountpaid;
    }

    public void setAmountpaid(Integer amountpaid) {
        this.amountpaid = amountpaid;
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


    public Category getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(Category idcategory) {
        this.idcategory = idcategory;
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

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
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

    @XmlTransient
    public List<Invoicedetails> getInvoicedetailsList() {
        return invoicedetailsList;
    }

    public void setInvoicedetailsList(List<Invoicedetails> invoicedetailsList) {
        this.invoicedetailsList = invoicedetailsList;
    }
    
}
