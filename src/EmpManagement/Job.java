/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpManagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "job", catalog = "ums", schema = "")
@NamedQueries({
    @NamedQuery(name = "Job.findAll", query = "SELECT j FROM Job j")
    , @NamedQuery(name = "Job.findByJobID", query = "SELECT j FROM Job j WHERE j.jobID = :jobID")
    , @NamedQuery(name = "Job.findByJobName", query = "SELECT j FROM Job j WHERE j.jobName = :jobName")
    , @NamedQuery(name = "Job.findByBasicSalary", query = "SELECT j FROM Job j WHERE j.basicSalary = :basicSalary")
    , @NamedQuery(name = "Job.findByOTRate", query = "SELECT j FROM Job j WHERE j.oTRate = :oTRate")
    , @NamedQuery(name = "Job.findByHalfDay", query = "SELECT j FROM Job j WHERE j.halfDay = :halfDay")})
public class Job implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "JobID")
    private Integer jobID;
    @Column(name = "JobName")
    private String jobName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BasicSalary")
    private Double basicSalary;
    @Column(name = "OTRate")
    private Double oTRate;
    @Basic(optional = false)
    @Column(name = "HalfDay")
    private double halfDay;

    public Job() {
    }

    public Job(Integer jobID) {
        this.jobID = jobID;
    }

    public Job(Integer jobID, double halfDay) {
        this.jobID = jobID;
        this.halfDay = halfDay;
    }

    public Integer getJobID() {
        return jobID;
    }

    public void setJobID(Integer jobID) {
        Integer oldJobID = this.jobID;
        this.jobID = jobID;
        changeSupport.firePropertyChange("jobID", oldJobID, jobID);
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        String oldJobName = this.jobName;
        this.jobName = jobName;
        changeSupport.firePropertyChange("jobName", oldJobName, jobName);
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        Double oldBasicSalary = this.basicSalary;
        this.basicSalary = basicSalary;
        changeSupport.firePropertyChange("basicSalary", oldBasicSalary, basicSalary);
    }

    public Double getOTRate() {
        return oTRate;
    }

    public void setOTRate(Double oTRate) {
        Double oldOTRate = this.oTRate;
        this.oTRate = oTRate;
        changeSupport.firePropertyChange("OTRate", oldOTRate, oTRate);
    }

    public double getHalfDay() {
        return halfDay;
    }

    public void setHalfDay(double halfDay) {
        double oldHalfDay = this.halfDay;
        this.halfDay = halfDay;
        changeSupport.firePropertyChange("halfDay", oldHalfDay, halfDay);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobID != null ? jobID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Job)) {
            return false;
        }
        Job other = (Job) object;
        if ((this.jobID == null && other.jobID != null) || (this.jobID != null && !this.jobID.equals(other.jobID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmpManagement.Job[ jobID=" + jobID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
