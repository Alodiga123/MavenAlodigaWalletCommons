/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alodiga.wallet.common.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;
import com.alodiga.wallet.common.exception.TableNotFoundException;
import com.alodiga.wallet.common.genericEJB.AbstractWalletEntity;
import com.alodiga.wallet.common.utils.QueryConstants;

/**
 *
 * @author jose
 */
@Entity
@Table(name = "exchange_rate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExchangeRate.findAll", query = "SELECT e FROM ExchangeRate e"), 
    @NamedQuery(name = "ExchangeRate.findById", query = "SELECT e FROM ExchangeRate e WHERE e.id = :id"),
    @NamedQuery(name = "ExchangeRate.findByValue", query = "SELECT e FROM ExchangeRate e WHERE e.value = :value"),
    @NamedQuery(name = "ExchangeRate.findByProduct", query = "SELECT e FROM ExchangeRate e WHERE e.productId.id = :productId AND e.endingDate is null"),
    @NamedQuery(name = "ExchangeRate.findByBeginningDate", query = "SELECT e FROM ExchangeRate e WHERE e.beginningDate = :beginningDate"),
    @NamedQuery(name = "ExchangeRate.findByEndingDate", query = "SELECT e FROM ExchangeRate e WHERE e.endingDate = :endingDate"),
    @NamedQuery(name = QueryConstants.EXCHANGE_RATE_BY_PRODUCT, query = "SELECT e FROM ExchangeRate e WHERE e.productId.id = :productId AND e.endingDate is null")})

public class ExchangeRate extends AbstractWalletEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "value")
    private float value;
    @Column(name = "beginningDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date beginningDate;
    @Column(name = "endingDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endingDate;
    @JoinColumn(name = "productId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Product productId;

    public ExchangeRate() {
    }

    public ExchangeRate(Long id) {
        this.id = id;
    }

    public ExchangeRate(Long id, float value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(Date beginningDate) {
        this.beginningDate = beginningDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
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
        if (!(object instanceof ExchangeRate)) {
            return false;
        }
        ExchangeRate other = (ExchangeRate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alodiga.wallet.model.ExchangeRate[ id=" + id + " ]";
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
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
