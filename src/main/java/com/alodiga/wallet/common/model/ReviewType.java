package com.alodiga.wallet.common.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jose
 */
@Entity
@Table(name = "reviewType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReviewType.findAll", query = "SELECT r FROM ReviewType r"),
    @NamedQuery(name = "ReviewType.findById", query = "SELECT r FROM ReviewType r WHERE r.id = :id"),
    @NamedQuery(name = "ReviewType.findByDescription", query = "SELECT r FROM ReviewType r WHERE r.description = :description")})
public class ReviewType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Size(min = 1, max = 50)
    @Column(name = "description")
    private String description;

    public ReviewType() {
    }

    public ReviewType(Integer id) {
        this.id = id;
    }

    public ReviewType(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReviewType)) {
            return false;
        }
        ReviewType other = (ReviewType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alodiga.wallet.common.model.ReviewType[ id=" + id + " ]";
    }

}
