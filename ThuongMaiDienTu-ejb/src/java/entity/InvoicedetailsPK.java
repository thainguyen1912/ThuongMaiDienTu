/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author thain
 */
@Embeddable
public class InvoicedetailsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idinvoice")
    private int idinvoice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idproduct")
    private int idproduct;

    public InvoicedetailsPK() {
    }

    public InvoicedetailsPK(int idinvoice, int idproduct) {
        this.idinvoice = idinvoice;
        this.idproduct = idproduct;
    }

    public int getIdinvoice() {
        return idinvoice;
    }

    public void setIdinvoice(int idinvoice) {
        this.idinvoice = idinvoice;
    }

    public int getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(int idproduct) {
        this.idproduct = idproduct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idinvoice;
        hash += (int) idproduct;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoicedetailsPK)) {
            return false;
        }
        InvoicedetailsPK other = (InvoicedetailsPK) object;
        if (this.idinvoice != other.idinvoice) {
            return false;
        }
        if (this.idproduct != other.idproduct) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.InvoicedetailsPK[ idinvoice=" + idinvoice + ", idproduct=" + idproduct + " ]";
    }
    
}
