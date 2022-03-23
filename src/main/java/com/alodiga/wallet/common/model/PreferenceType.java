package com.alodiga.wallet.common.model;

import java.io.Serializable;

import com.alodiga.wallet.common.exception.TableNotFoundException;
import com.alodiga.wallet.common.genericEJB.AbstractWalletEntity;
import com.alodiga.wallet.common.utils.QueryConstants;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "preference_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PreferenceType.findAll", query = "SELECT p FROM PreferenceType p"),
    @NamedQuery(name = "PreferenceType.findById", query = "SELECT p FROM PreferenceType p WHERE p.id = :id"),
    @NamedQuery(name = "PreferenceType.findByType", query = "SELECT p FROM PreferenceType p WHERE p.type = :type"),
    @NamedQuery(name = QueryConstants.PREFERENCE_TYPE_BY_TYPE, query = "SELECT p FROM PreferenceType p WHERE p.type = :type")})

public class PreferenceType extends AbstractWalletEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "preferenceTypeId")
    private Collection<PreferenceField> preferenceFieldCollection;

    public PreferenceType() {
    }

    public PreferenceType(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlTransient
    public Collection<PreferenceField> getPreferenceFieldCollection() {
        return preferenceFieldCollection;
    }

    public void setPreferenceFieldCollection(Collection<PreferenceField> preferenceFieldCollection) {
        this.preferenceFieldCollection = preferenceFieldCollection;
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
        if (!(object instanceof PreferenceType)) {
            return false;
        }
        PreferenceType other = (PreferenceType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.PreferenceType[ id=" + id + " ]";
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
