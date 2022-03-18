package com.alodiga.wallet.common.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.alodiga.wallet.common.exception.TableNotFoundException;
import com.alodiga.wallet.common.genericEJB.AbstractWalletEntity;
import java.util.List;
import javax.persistence.FetchType;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "report")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Report.findAll", query = "SELECT r FROM Report r"),
    @NamedQuery(name = "Report.findById", query = "SELECT r FROM Report r WHERE r.id = :id"),
    @NamedQuery(name = "Report.findByName", query = "SELECT r FROM Report r WHERE r.name = :name"),
    @NamedQuery(name = "Report.findByWebServiceUrl", query = "SELECT r FROM Report r WHERE r.webServiceUrl = :webServiceUrl"),
    @NamedQuery(name = "Report.findByEnabled", query = "SELECT r FROM Report r WHERE r.enabled = :enabled")})
public class Report extends AbstractWalletEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "description")
    private String description;

    @Lob
    @Column(name = "query")
    private String query;

    @Column(name = "webServiceUrl")
    private String webServiceUrl;

    @Column(name = "enabled")
    private boolean enabled;

    @JoinColumn(name = "reportTypeId", referencedColumnName = "id")
    @ManyToOne
    private ReportType reportTypeId;

    @OneToMany(mappedBy = "reportId", fetch = FetchType.EAGER)
    private List<ReportHasProfile> reportHasProfiles;

    @OneToMany(mappedBy = "reportId", fetch = FetchType.EAGER)
    private List<ReportParameter> reportParameters;

    public Report() {
    }

    public Report(Long id) {
        this.id = id;
    }

    public Report(Long id, String name, String description, boolean enabled) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getWebServiceUrl() {
        return webServiceUrl;
    }

    public void setWebServiceUrl(String webServiceUrl) {
        this.webServiceUrl = webServiceUrl;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public ReportType getReportTypeId() {
        return reportTypeId;
    }

    public void setReportTypeId(ReportType reportTypeId) {
        this.reportTypeId = reportTypeId;
    }

    public List<ReportHasProfile> getReportHasProfiles() {
        return reportHasProfiles;
    }

    public void setReportHasProfiles(List<ReportHasProfile> reportHasProfiles) {
        this.reportHasProfiles = reportHasProfiles;
    }

    public List<ReportParameter> getReportParameters() {
        return reportParameters;
    }

    public void setReportParameters(List<ReportParameter> reportParameters) {
        this.reportParameters = reportParameters;
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
        if (!(object instanceof Report)) {
            return false;
        }
        Report other = (Report) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.Report[ id=" + id + " ]";
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
