/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.user.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "USER_LIBRARY")
public class UserLibrary implements Serializable {

	private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_USER", nullable = false)
    private Long idUser;
    @Basic(optional = false)
    @Column(name = "NAME_USER", nullable = false, length = 100)
    private String nameUser;
    @Column(name = "LASTNAME", length = 100)
    private String lastname;
    @Basic(optional = false)
    @Column(name = "USER_PASSWORD", nullable = false, length = 100)
    private String userPassword;
    @Basic(optional = false)
    @Column(name = "EMAIL", nullable = false, length = 100)
    private String email;
    @Basic(optional = false)
    @Column(name = "USER_LOGIN", nullable = false, length = 100)
    private String userLogin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private Collection<Sale> saleCollection;

    public UserLibrary() {
    }

    public UserLibrary(Long idUser) {
        this.idUser = idUser;
    }

    public UserLibrary(Long idUser, String nameUser, String userPassword, String email, String userLogin) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.userPassword = userPassword;
        this.email = email;
        this.userLogin = userLogin;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    @XmlTransient
    public Collection<Sale> getSaleCollection() {
        return saleCollection;
    }

    public void setSaleCollection(Collection<Sale> saleCollection) {
        this.saleCollection = saleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLibrary)) {
            return false;
        }
        UserLibrary other = (UserLibrary) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.library.user.service.UserLibrary[ idUser=" + idUser + " ]";
    }
}
