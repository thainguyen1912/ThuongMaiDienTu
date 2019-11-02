/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author thain
 */
@Entity
@Table(name = "invoice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoice.findAll", query = "SELECT i FROM Invoice i")
    , @NamedQuery(name = "Invoice.findByIdinvoice", query = "SELECT i FROM Invoice i WHERE i.idinvoice = :idinvoice")
    , @NamedQuery(name = "Invoice.findByDatesale", query = "SELECT i FROM Invoice i WHERE i.datesale = :datesale")
    , @NamedQuery(name = "Invoice.findByTotalmoney", query = "SELECT i FROM Invoice i WHERE i.totalmoney = :totalmoney")})
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinvoice")
    private Integer idinvoice;
    @Column(name = "datesale")
    @Temporal(TemporalType.DATE)
    private Date datesale;
    @Column(name = "totalmoney")
    private BigInteger totalmoney;
    @JoinColumn(name = "idcustomer", referencedColumnName = "idcustomer")
    @ManyToOne(optional = false)
    private Customer idcustomer;
    @JoinColumn(name = "idstaff", referencedColumnName = "idstaff")
    @ManyToOne(optional = false)
    private Staff idstaff;

    public Invoice() {
    }

    public Invoice(Integer idinvoice) {
        this.idinvoice = idinvoice;
    }

    public Integer getIdinvoice() {
        return idinvoice;
    }

    public void setIdinvoice(Integer idinvoice) {
        this.idinvoice = idinvoice;
    }

    public Date getDatesale() {
        return datesale;
    }

    public void setDatesale(Date datesale) {
        this.datesale = datesale;
    }

    public BigInteger getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigInteger totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Customer getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(Customer idcustomer) {
        this.idcustomer = idcustomer;
    }

    public Staff getIdstaff() {
        return idstaff;
    }

    public void setIdstaff(Staff idstaff) {
        this.idstaff = idstaff;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinvoice != null ? idinvoice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoice)) {
            return false;
        }
        Invoice other = (Invoice) object;
        if ((this.idinvoice == null && other.idinvoice != null) || (this.idinvoice != null && !this.idinvoice.equals(other.idinvoice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Invoice[ idinvoice=" + idinvoice + " ]";
    }
    
}
