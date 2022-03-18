package com.alodiga.wallet.common.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.alodiga.wallet.common.exception.TableNotFoundException;
import com.alodiga.wallet.common.genericEJB.AbstractWalletEntity;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "preference")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Preference.findAll", query = "SELECT p FROM Preference p"),
    @NamedQuery(name = "Preference.findById", query = "SELECT p FROM Preference p WHERE p.id = :id"),
    @NamedQuery(name = "Preference.findByName", query = "SELECT p FROM Preference p WHERE p.name = :name"),
    @NamedQuery(name = "Preference.findByEnabled", query = "SELECT p FROM Preference p WHERE p.enabled = :enabled"),})
public class Preference extends AbstractWalletEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "enabled")
    private boolean enabled;

    @Lob
    @Column(name = "description")
    private String description;

    public Preference() {
    }

    public Preference(Long id) {
        this.id = id;
    }

    public Preference(Long id, String name, boolean enabled, String description) {
        this.id = id;
        this.name = name;
        this.enabled = enabled;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
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
        if (!(object instanceof Preference)) {
            return false;
        }
        Preference other = (Preference) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.Preference[ id=" + id + " ]";
    }

    @Override
    public Object getPk() {
        return getId();
    }

    @Override
    public String getTableName() throws TableNotFoundException {
        return super.getTableName(this.getClass());
    }

}
