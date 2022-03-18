package com.alodiga.wallet.common.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.alodiga.wallet.common.exception.TableNotFoundException;
import com.alodiga.wallet.common.genericEJB.AbstractWalletEntity;

import javax.persistence.FetchType;

@Entity
@Table(name = "permission_group")
@NamedQueries({
    @NamedQuery(name = "PermissionGroup.findAll", query = "SELECT pg FROM PermissionGroup pg"),
    @NamedQuery(name = "PermissionGroup.findById", query = "SELECT pg FROM PermissionGroup pg WHERE pg.id = :id")})
public class PermissionGroup extends AbstractWalletEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean enabled;
    private String name;

//bi-directional many-to-one association to PermissionGroupData
    @OneToMany(mappedBy = "permissionGroup", fetch = FetchType.EAGER)
    private List<PermissionGroupData> permissionGroupData;

    public PermissionGroup() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PermissionGroupData> getPermissionGroupData() {
        return this.permissionGroupData;
    }

    public void setPermissionGroupData(List<PermissionGroupData> permissionGroupData) {
        this.permissionGroupData = permissionGroupData;
    }

    public PermissionGroupData getPermissionGroupDataByLanguageId(Long languageId) {

        for (PermissionGroupData pgData : this.permissionGroupData) {
            if (pgData.getLanguage().getId().equals(languageId)) {
                return pgData;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
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
