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
@Table(name = "employed_position")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployedPosition.findAll", query = "SELECT e FROM EmployedPosition e"),
    @NamedQuery(name = "EmployedPosition.findById", query = "SELECT e FROM EmployedPosition e WHERE e.id = :id"),
    @NamedQuery(name = "EmployedPosition.findByName", query = "SELECT e FROM EmployedPosition e WHERE e.name = :name")})

public class EmployedPosition implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;

    public EmployedPosition() {
    }

    public EmployedPosition(Integer id) {
        this.id = id;
    }

    public EmployedPosition(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(object instanceof EmployedPosition)) {
            return false;
        }
        EmployedPosition other = (EmployedPosition) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alodiga.wallet.common.model.EmployedPosition[ id=" + id + " ]";
    }

}
