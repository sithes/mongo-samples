package com.uaf.payload.request;

import com.uaf.models.ProfStatus;
import com.uaf.models.Status;
import com.uaf.models.YesNo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class MsTrackerRequest {

  @NotBlank
  @Size(max = 100)
  private String msName;

  private Set<String> ftStatus;

  private int ftPercentage;
  private LocalDate latestFTDate;

  private Set<String> isProfReq;

  private Set<String> profStatus;

  private LocalDate latestProfilingDate;

  private Set<String> bcStatus;

  private String bcDetails;

  private Set<String> isPtRequired;

  private Set<String> ptStatus;

  private String ptDetails;

  private LocalDate latestPtDate;

  private Set<String> gcStatus;

  private String gcDetails;

  private LocalDate latestGcDate;

  private String createdBy;

  private LocalDate createdOn;

  private String modifiedBy;

  private LocalDate modifiedOn;

  public String getMsName() {
    return msName;
  }

  public void setMsName(String msName) {
    this.msName = msName;
  }

  public Set<String> getFtStatus() {
    return ftStatus;
  }

  public void setFtStatus(Set<String> ftStatus) {
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

  public Set<String> getIsProfReq() {
    return isProfReq;
  }

  public void setIsProfReq(Set<String> isProfReq) {
    this.isProfReq = isProfReq;
  }

  public Set<String> getProfStatus() {
    return profStatus;
  }

  public void setProfStatus(Set<String> profStatus) {
    this.profStatus = profStatus;
  }

  public LocalDate getLatestProfilingDate() {
    return latestProfilingDate;
  }

  public void setLatestProfilingDate(LocalDate latestProfilingDate) {
    this.latestProfilingDate = latestProfilingDate;
  }

  public Set<String> getBcStatus() {
    return bcStatus;
  }

  public void setBcStatus(Set<String> bcStatus) {
    this.bcStatus = bcStatus;
  }

  public String getBcDetails() {
    return bcDetails;
  }

  public void setBcDetails(String bcDetails) {
    this.bcDetails = bcDetails;
  }

  public Set<String> getIsPtRequired() {
    return isPtRequired;
  }

  public void setIsPtRequired(Set<String> isPtRequired) {
    this.isPtRequired = isPtRequired;
  }

  public Set<String> getPtStatus() {
    return ptStatus;
  }

  public void setPtStatus(Set<String> ptStatus) {
    this.ptStatus = ptStatus;
  }

  public String getPtDetails() {
    return ptDetails;
  }

  public void setPtDetails(String ptDetails) {
    this.ptDetails = ptDetails;
  }

  public LocalDate getLatestPtDate() {
    return latestPtDate;
  }

  public void setLatestPtDate(LocalDate latestPtDate) {
    this.latestPtDate = latestPtDate;
  }

  public Set<String> getGcStatus() {
    return gcStatus;
  }

  public void setGcStatus(Set<String> gcStatus) {
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

  public LocalDate getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(LocalDate createdOn) {
    this.createdOn = createdOn;
  }

  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public LocalDate getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(LocalDate modifiedOn) {
    this.modifiedOn = modifiedOn;
  }
}
