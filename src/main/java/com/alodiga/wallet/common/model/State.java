package com.alodiga.wallet.common.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.alodiga.wallet.common.exception.TableNotFoundException;
import com.alodiga.wallet.common.genericEJB.AbstractWalletEntity;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "state")
@XmlType(name = "maw_state")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "State.findAll", query = "SELECT s FROM State s"),
    @NamedQuery(name = "State.findById", query = "SELECT s FROM State s WHERE s.id = :id"),
    @NamedQuery(name = "State.findBycountryId", query = "SELECT s FROM State s WHERE s.countryId.id = :countryId"),
    @NamedQuery(name = "State.findByName", query = "SELECT s FROM State s WHERE s.name = :name")})
public class State extends AbstractWalletEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @JoinColumn(name = "countryId", referencedColumnName = "id")
    @ManyToOne
    private Country countryId;

    @OneToMany(mappedBy = "stateId")
    private Collection<City> cityCollection;

    @OneToMany(mappedBy = "stateId")
    private Collection<County> countyCollection;

    public State() {
    }

    public State(Long id) {
        this.id = id;
    }

    public State(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public Country getCountryId() {
        return countryId;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }

    @XmlTransient
    public Collection<City> getCityCollection() {
        return cityCollection;
    }

    public void setCityCollection(Collection<City> cityCollection) {
        this.cityCollection = cityCollection;
    }

//    @XmlTransient
//    public Collection<Address> getAddressCollection() {
//        return addressCollection;
//    }
//
//    public void setAddressCollection(Collection<Address> addressCollection) {
//        this.addressCollection = addressCollection;
//    }
    @XmlTransient
    public Collection<County> getCountyCollection() {
        return countyCollection;
    }

    public void setCountyCollection(Collection<County> countyCollection) {
        this.countyCollection = countyCollection;
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
        if (!(object instanceof State)) {
            return false;
        }
        State other = (State) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.State[ id=" + id + " ]";
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
