package com.alodiga.wallet.common.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "category_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoryData.findAll", query = "SELECT c FROM CategoryData c"),
    @NamedQuery(name = "CategoryData.findById", query = "SELECT c FROM CategoryData c WHERE c.id = :id"),
    @NamedQuery(name = "CategoryData.findByAlias", query = "SELECT c FROM CategoryData c WHERE c.alias = :alias"),
    @NamedQuery(name = "CategoryData.findByDescription", query = "SELECT c FROM CategoryData c WHERE c.description = :description")})
public class CategoryData extends AbstractWalletEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "alias")
    private String alias;

    @Column(name = "description")
    private String description;

    @JoinColumn(name = "languageId", referencedColumnName = "id")
    @ManyToOne
    private Language languageId;

    @JoinColumn(name = "categoryId", referencedColumnName = "id")
    @ManyToOne
    private Category categoryId;

    public CategoryData() {
    }

    public CategoryData(Long id) {
        this.id = id;
    }

    public CategoryData(Long id, String alias, String description) {
        this.id = id;
        this.alias = alias;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Language getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Language languageId) {
        this.languageId = languageId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
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
        if (!(object instanceof CategoryData)) {
            return false;
        }
        CategoryData other = (CategoryData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.CategoryData[ id=" + id + " ]";
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
