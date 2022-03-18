package com.alodiga.wallet.common.model;

import java.io.Serializable;
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

import com.alodiga.wallet.common.exception.TableNotFoundException;
import com.alodiga.wallet.common.genericEJB.AbstractWalletEntity;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "payment_integration_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaymentIntegrationType.findAll", query = "SELECT p FROM PaymentIntegrationType p"),
    @NamedQuery(name = "PaymentIntegrationType.findById", query = "SELECT p FROM PaymentIntegrationType p WHERE p.id = :id"),
    @NamedQuery(name = "PaymentIntegrationType.findByName", query = "SELECT p FROM PaymentIntegrationType p WHERE p.name = :name"),
    @NamedQuery(name = "PaymentIntegrationType.findByEnabled", query = "SELECT p FROM PaymentIntegrationType p WHERE p.enabled = :enabled")})
public class PaymentIntegrationType extends AbstractWalletEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "enabled")
    private boolean enabled;

    @OneToMany(mappedBy = "integrationTypeId")
    private Collection<PaymentPatner> paymentPatnerCollection;

    public PaymentIntegrationType() {
    }

    public PaymentIntegrationType(Long id) {
        this.id = id;
    }

    public PaymentIntegrationType(Long id, String name, boolean enabled) {
        this.id = id;
        this.name = name;
        this.enabled = enabled;
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

    @XmlTransient
    public Collection<PaymentPatner> getPaymentPatnerCollection() {
        return paymentPatnerCollection;
    }

    public void setPaymentPatnerCollection(Collection<PaymentPatner> paymentPatnerCollection) {
        this.paymentPatnerCollection = paymentPatnerCollection;
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
        if (!(object instanceof PaymentIntegrationType)) {
            return false;
        }
        PaymentIntegrationType other = (PaymentIntegrationType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.PaymentIntegrationType[ id=" + id + " ]";
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
