package com.alodiga.wallet.common.model;

import com.alodiga.wallet.common.exception.TableNotFoundException;
import com.alodiga.wallet.common.genericEJB.AbstractWalletEntity;
import com.alodiga.wallet.common.utils.QueryConstants;
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
@Table(name = "status_account_bank")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusAccountBank.findAll", query = "SELECT s FROM StatusAccountBank s"),
    @NamedQuery(name = "StatusAccountBank.findById", query = "SELECT s FROM StatusAccountBank s WHERE s.id = :id"),
    @NamedQuery(name = QueryConstants.STATUS_ACCOUNT_BANK_BY_CODE, query = "SELECT p FROM StatusAccountBank p WHERE p.code = :code"),
    @NamedQuery(name = "StatusAccountBank.findByDescription", query = "SELECT s FROM StatusAccountBank s WHERE s.description = :description")})

public class StatusAccountBank extends AbstractWalletEntity implements Serializable {

    @Size(min = 1, max = 10)
    @Column(name = "code")
    private String code;
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Size(min = 1, max = 40)
    @Column(name = "description")
    private String description;

    public StatusAccountBank() {
    }

    public StatusAccountBank(Integer id) {
        this.id = id;
    }

    public StatusAccountBank(Integer id, String description) {
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
        if (!(object instanceof StatusAccountBank)) {
            return false;
        }
        StatusAccountBank other = (StatusAccountBank) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alodiga.wallet.common.model.StatusAccountBank[ id=" + id + " ]";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
