/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.sql.Date;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author thain
 */
@Entity
@Table(name = "staff")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s")
    , @NamedQuery(name = "Staff.findByIdstaff", query = "SELECT s FROM Staff s WHERE s.idstaff = :idstaff")
    , @NamedQuery(name = "Staff.findByStaffname", query = "SELECT s FROM Staff s WHERE s.staffname = :staffname")
    , @NamedQuery(name = "Staff.findByGender", query = "SELECT s FROM Staff s WHERE s.gender = :gender")
    , @NamedQuery(name = "Staff.findByDatebirth", query = "SELECT s FROM Staff s WHERE s.datebirth = :datebirth")
    , @NamedQuery(name = "Staff.findByAddress", query = "SELECT s FROM Staff s WHERE s.address = :address")
    , @NamedQuery(name = "Staff.findByPhonenumber", query = "SELECT s FROM Staff s WHERE s.phonenumber = :phonenumber")
    , @NamedQuery(name = "Staff.findByPermission", query = "SELECT s FROM Staff s WHERE s.permission = :permission")
    , @NamedQuery(name = "Staff.findByUsername", query = "SELECT s FROM Staff s WHERE s.username = :username")
    , @NamedQuery(name = "Staff.findByPassword", query = "SELECT s FROM Staff s WHERE s.password = :password")})
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstaff")
    private Integer idstaff;
    @Size(max = 45)
    @Column(name = "staffname")
    private String staffname;
    @Size(max = 4)
    @Column(name = "gender")
    private String gender;
    @Column(name = "datebirth")
    @Temporal(TemporalType.DATE)
    private Date datebirth;
    @Size(max = 45)
    @Column(name = "address")
    private String address;
    @Size(max = 15)
    @Column(name = "phonenumber")
    private String phonenumber;
    @Size(max = 2)
    @Column(name = "permission")
    private String permission;
    @Size(max = 45)
    @Column(name = "username")
    private String username;
    @Size(max = 45)
    @Column(name = "password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idstaff")
    private List<Invoice> invoiceList;

    public Staff() {
    }

    public Staff(String staffname, String gender, Date datebirth, String address, String phonenumber, String permission, String username, String password) {
        this.staffname = staffname;
        this.gender = gender;
        this.datebirth = datebirth;
        this.address = address;
        this.phonenumber = phonenumber;
        this.permission = permission;
        this.username = username;
        this.password = password;
    }

    public Staff(Integer idstaff, String staffname, String gender, Date datebirth, String address, String phonenumber, String permission, String username, String password) {
        this.idstaff = idstaff;
        this.staffname = staffname;
        this.gender = gender;
        this.datebirth = datebirth;
        this.address = address;
        this.phonenumber = phonenumber;
        this.permission = permission;
        this.username = username;
        this.password = password;
    }

    public Staff(Integer idstaff) {
        this.idstaff = idstaff;
    }

    public Integer getIdstaff() {
        return idstaff;
    }

    public void setIdstaff(Integer idstaff) {
        this.idstaff = idstaff;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(Date datebirth) {
        this.datebirth = datebirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idstaff != null ? idstaff.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.idstaff == null && other.idstaff != null) || (this.idstaff != null && !this.idstaff.equals(other.idstaff))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Staff[ idstaff=" + idstaff + " ]";
    }
    
}
