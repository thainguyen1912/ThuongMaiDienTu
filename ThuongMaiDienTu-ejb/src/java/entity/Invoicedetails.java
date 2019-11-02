/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
    , @NamedQuery(name = "Invoicedetails.findByAmount", query = "SELECT i FROM Invoicedetails i WHERE i.amount = :amount")
    , @NamedQuery(name = "Invoicedetails.findByDiscount", query = "SELECT i FROM Invoicedetails i WHERE i.discount = :discount")
    , @NamedQuery(name = "Invoicedetails.findByRealprice", query = "SELECT i FROM Invoicedetails i WHERE i.realprice = :realprice")})
public class Invoicedetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoicedetailsPK invoicedetailsPK;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "discount")
    private Integer discount;
    @Column(name = "realprice")
    private BigInteger realprice;
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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
