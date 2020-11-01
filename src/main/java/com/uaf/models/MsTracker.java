package com.uaf.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "msTracker")
public class MsTracker {
  @Id
  private String id;

  @NotBlank
  @Size(max = 100)
  private String msName;
  private String ftStatus;
  private int ftPercentage;
  private LocalDate latestFTDate;
  private String isProfReq;
  private String profStatus;
  private LocalDateTime latestProfilingDate;
  private String bcStatus;
  private String bcDetails;
  private String isPtRequired ;
  private String ptStatus;
  private String ptDetails;
  private LocalDateTime latestPtDate;
  private String gcStatus;
  private String gcDetails;
  private LocalDate latestGcDate;
  private String createdBy;
  private LocalDateTime createdOn;
  private String modifiedBy;
  private LocalDateTime modifiedOn;

  public MsTracker() {
  }

    public MsTracker(@NotBlank @Size(max = 100) String msName, String isProfReq, String isPtRequired) {
        this.msName = msName;
        this.isProfReq = isProfReq;
        this.isPtRequired = isPtRequired;
    }

    public String getMsName() {
        return msName;
    }

    public void setMsName(String msName) {
        this.msName = msName;
    }

    public String getFtStatus() {
        return ftStatus;
    }

    public void setFtStatus(String ftStatus) {
        this.ftStatus = ftStatus;
    }

    public int getFtPercentage() {
        return ftPercentage;
    }

    public void setFtPercentage(int ftPercentage) {
        this.ftPercentage = ftPercentage;
    }

    public LocalDate getLatestFTDate() {
        return latestFTDate;
    }

    public void setLatestFTDate(LocalDate latestFTDate) {
        this.latestFTDate = latestFTDate;
    }

    public String getIsProfReq() {
        return isProfReq;
    }

    public void setIsProfReq(String isProfReq) {
        this.isProfReq = isProfReq;
    }

    public String getProfStatus() {
        return profStatus;
    }

    public void setProfStatus(String profStatus) {
        this.profStatus = profStatus;
    }

    public LocalDateTime getLatestProfilingDate() {
        return latestProfilingDate;
    }

    public void setLatestProfilingDate(LocalDateTime latestProfilingDate) {
        this.latestProfilingDate = latestProfilingDate;
    }

    public String getBcStatus() {
        return bcStatus;
    }

    public void setBcStatus(String bcStatus) {
        this.bcStatus = bcStatus;
    }

    public String getBcDetails() {
        return bcDetails;
    }

    public void setBcDetails(String bcDetails) {
        this.bcDetails = bcDetails;
    }

    public String getIsPtRequired() {
        return isPtRequired;
    }

    public void setIsPtRequired(String isPtRequired) {
        this.isPtRequired = isPtRequired;
    }

    public String getPtStatus() {
        return ptStatus;
    }

    public void setPtStatus(String ptStatus) {
        this.ptStatus = ptStatus;
    }

    public String getPtDetails() {
        return ptDetails;
    }

    public void setPtDetails(String ptDetails) {
        this.ptDetails = ptDetails;
    }

    public LocalDateTime getLatestPtDate() {
        return latestPtDate;
    }

    public void setLatestPtDate(LocalDateTime latestPtDate) {
        this.latestPtDate = latestPtDate;
    }

    public String getGcStatus() {
        return gcStatus;
    }

    public void setGcStatus(String gcStatus) {
        this.gcStatus = gcStatus;
    }

    public String getGcDetails() {
        return gcDetails;
    }

    public void setGcDetails(String gcDetails) {
        this.gcDetails = gcDetails;
    }

    public LocalDate getLatestGcDate() {
        return latestGcDate;
    }

    public void setLatestGcDate(LocalDate latestGcDate) {
        this.latestGcDate = latestGcDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(LocalDateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}
