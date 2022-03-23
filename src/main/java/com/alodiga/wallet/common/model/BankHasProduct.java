/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.xml.bind.annotation.XmlRootElement;
import com.alodiga.wallet.common.exception.TableNotFoundException;
import com.alodiga.wallet.common.genericEJB.AbstractWalletEntity;
import com.alodiga.wallet.common.utils.QueryConstants;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author ltoro
 */
@Entity
@Table(name = "bank_has_product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BankHasProduct.findAll", query = "SELECT b FROM BankHasProduct b"),
    @NamedQuery(name = "BankHasProduct.findById", query = "SELECT b FROM BankHasProduct b WHERE b.id = :id"),
    @NamedQuery(name = "BankHasProduct.findByProductId", query = "SELECT b FROM BankHasProduct b WHERE b.productId.id = :productId"),
    @NamedQuery(name = "BankHasProduct.findByProductIdAndBankId", query = "SELECT b FROM BankHasProduct b WHERE b.productId.id = :productId AND b.bankId.id = :bankId"),
    @NamedQuery(name = "BankHasProduct.findByBankId", query = "SELECT b FROM BankHasProduct b WHERE b.bankId.id = :bankId"),
    @NamedQuery(name = QueryConstants.BANK_BY_PRODUCT, query = "SELECT b FROM BankHasProduct b WHERE b.productId.id = :productId")})
public class BankHasProduct extends AbstractWalletEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "productId", referencedColumnName = "id")
    @ManyToOne
    private Product productId;

    @JoinColumn(name = "bankId", referencedColumnName = "id")
    @ManyToOne
    private Bank bankId;

    public BankHasProduct() {
    }

    public BankHasProduct(Long id) {
        this.id = id;
    }

    public BankHasProduct(Long id, Product productId, Bank bankId) {
        this.id = id;
        this.productId = productId;
        this.bankId = bankId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Bank getBankId() {
        return bankId;
    }

    public void setBankId(Bank bankId) {
        this.bankId = bankId;
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
        if (!(object instanceof BankHasProduct)) {
            return false;
        }
        BankHasProduct other = (BankHasProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alodiga.wallet.model.BankHasProduct[ id=" + id + " ]";
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
