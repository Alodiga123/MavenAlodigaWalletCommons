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
@Table(name = "status_transaction_approve_request")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StatusTransactionApproveRequest.findAll", query = "SELECT s FROM StatusTransactionApproveRequest s"),
    @NamedQuery(name = "StatusTransactionApproveRequest.findById", query = "SELECT s FROM StatusTransactionApproveRequest s WHERE s.id = :id"),
    @NamedQuery(name = "StatusTransactionApproveRequest.findByDescription", query = "SELECT s FROM StatusTransactionApproveRequest s WHERE s.description = :description"),
    @NamedQuery(name = QueryConstants.STATUS_TRANSACTION_APPROVE_REQUEST_BY_CODE, query = "SELECT s FROM StatusTransactionApproveRequest s WHERE s.code = :code"),
    @NamedQuery(name = QueryConstants.CODE_BY_STATUS, query = "SELECT s FROM StatusTransactionApproveRequest s WHERE s.code = :code")})
public class StatusTransactionApproveRequest extends AbstractWalletEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Size(min = 1, max = 40)
    @Column(name = "description")
    private String description;

    @Size(min = 1, max = 10)
    @Column(name = "code")
    private String code;

    public StatusTransactionApproveRequest() {
    }

    public StatusTransactionApproveRequest(Integer id) {
        this.id = id;
    }

    public StatusTransactionApproveRequest(Integer id, String description) {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        if (!(object instanceof StatusTransactionApproveRequest)) {
            return false;
        }
        StatusTransactionApproveRequest other = (StatusTransactionApproveRequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StatusTransactionApproveRequest{" + "id=" + id + '}';
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
