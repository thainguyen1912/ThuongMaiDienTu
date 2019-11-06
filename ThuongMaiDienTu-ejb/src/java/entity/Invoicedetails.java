/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author thain
 */
@Entity
@Table(name = "invoicedetails")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoicedetails.findAll", query = "SELECT i FROM Invoicedetails i")
    , @NamedQuery(name = "Invoicedetails.findByIdinvoice", query = "SELECT i FROM Invoicedetails i WHERE i.invoicedetailsPK.idinvoice = :idinvoice")
    , @NamedQuery(name = "Invoicedetails.findByIdproduct", query = "SELECT i FROM Invoicedetails i WHERE i.invoicedetailsPK.idproduct = :idproduct")
    , @NamedQuery(name = "Invoicedetails.findByStatus", query = "SELECT i FROM Invoicedetails i WHERE i.status = :status")
    , @NamedQuery(name = "Invoicedetails.findByDatecreate", query = "SELECT i FROM Invoicedetails i WHERE i.datecreate = :datecreate")
    , @NamedQuery(name = "Invoicedetails.findByDatepay", query = "SELECT i FROM Invoicedetails i WHERE i.datepay = :datepay")
    , @NamedQuery(name = "Invoicedetails.findByAmount", query = "SELECT i FROM Invoicedetails i WHERE i.amount = :amount")
    , @NamedQuery(name = "Invoicedetails.findByStyle", query = "SELECT i FROM Invoicedetails i WHERE i.style = :style")
    , @NamedQuery(name = "Invoicedetails.findByDiscount", query = "SELECT i FROM Invoicedetails i WHERE i.discount = :discount")
    , @NamedQuery(name = "Invoicedetails.findByRealprice", query = "SELECT i FROM Invoicedetails i WHERE i.realprice = :realprice")
    , @NamedQuery(name = "Invoicedetails.findByMoreinfo", query = "SELECT i FROM Invoicedetails i WHERE i.moreinfo = :moreinfo")})
public class Invoicedetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoicedetailsPK invoicedetailsPK;
    @Size(max = 45)
    @Column(name = "status")
    private String status;
    @Column(name = "datecreate")
    @Temporal(TemporalType.DATE)
    private Date datecreate;
    @Column(name = "datepay")
    @Temporal(TemporalType.DATE)
    private Date datepay;
    @Column(name = "amount")
    private Integer amount;
    @Size(max = 45)
    @Column(name = "style")
    private String style;
    @Column(name = "discount")
    private Integer discount;
    @Column(name = "realprice")
    private BigInteger realprice;
    @Size(max = 45)
    @Column(name = "moreinfo")
    private String moreinfo;
    @JoinColumn(name = "idproduct", referencedColumnName = "idproduct", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public Invoicedetails() {
    }

    public Invoicedetails(InvoicedetailsPK invoicedetailsPK) {
        this.invoicedetailsPK = invoicedetailsPK;
    }

    public Invoicedetails(int idinvoice, int idproduct) {
        this.invoicedetailsPK = new InvoicedetailsPK(idinvoice, idproduct);
    }

    public InvoicedetailsPK getInvoicedetailsPK() {
        return invoicedetailsPK;
    }

    public void setInvoicedetailsPK(InvoicedetailsPK invoicedetailsPK) {
        this.invoicedetailsPK = invoicedetailsPK;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(Date datecreate) {
        this.datecreate = datecreate;
    }

    public Date getDatepay() {
        return datepay;
    }

    public void setDatepay(Date datepay) {
        this.datepay = datepay;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public BigInteger getRealprice() {
        return realprice;
    }

    public void setRealprice(BigInteger realprice) {
        this.realprice = realprice;
    }

    public String getMoreinfo() {
        return moreinfo;
    }

    public void setMoreinfo(String moreinfo) {
        this.moreinfo = moreinfo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoicedetailsPK != null ? invoicedetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoicedetails)) {
            return false;
        }
        Invoicedetails other = (Invoicedetails) object;
        if ((this.invoicedetailsPK == null && other.invoicedetailsPK != null) || (this.invoicedetailsPK != null && !this.invoicedetailsPK.equals(other.invoicedetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Invoicedetails[ invoicedetailsPK=" + invoicedetailsPK + " ]";
    }
    
}
