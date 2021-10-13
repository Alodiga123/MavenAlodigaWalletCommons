package com.alodiga.wallet.common.model;

import com.alodiga.wallet.common.exception.TableNotFoundException;
import com.alodiga.wallet.common.genericEJB.AbstractWalletEntity;
import com.alodiga.wallet.common.model.Permission;
import com.alodiga.wallet.common.model.Profile;
import com.alodiga.wallet.common.utils.QueryConstants;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.persistence.NamedQuery;

@Entity
@Table(name = "permission_has_profile")
@NamedQueries({
@NamedQuery(name = QueryConstants.DELETE_PERMISSION_HAS_PROFILE,query = "DELETE FROM PermissionHasProfile php WHERE php.profile.id=:profileId"),
@NamedQuery(name = "PermissionHasProfile.findAll", query = "SELECT php FROM PermissionHasProfile php"),
@NamedQuery(name = "PermissionHasProfile.findById", query = "SELECT php FROM PermissionHasProfile php where php.id = :id"),
@NamedQuery(name = "PermissionHasProfile.findByProfileId", query = "SELECT php.permission FROM PermissionHasProfile php WHERE php.profile.id=:profileId ORDER BY php.id DESC")})

public class PermissionHasProfile extends AbstractWalletEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "permissionId")
    private Permission permission;
    @ManyToOne
    @JoinColumn(name = "profileId")
    private Profile profile;

    public PermissionHasProfile() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Permission getPermission() {
        return this.permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
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
