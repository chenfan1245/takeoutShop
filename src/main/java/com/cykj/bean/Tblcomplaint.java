package com.cykj.bean;


public class Tblcomplaint {

  private long complaintid;
  private long staffid;
  private String complaintel;
  private String respondenttel;
  private String complaintcontent;
  private String complaintimg;
  private String complaintstatus;


  public long getComplaintid() {
    return complaintid;
  }

  public void setComplaintid(long complaintid) {
    this.complaintid = complaintid;
  }


  public long getStaffid() {
    return staffid;
  }

  public void setStaffid(long staffid) {
    this.staffid = staffid;
  }


  public String getComplaintel() {
    return complaintel;
  }

  public void setComplaintel(String complaintel) {
    this.complaintel = complaintel;
  }


  public String getRespondenttel() {
    return respondenttel;
  }

  public void setRespondenttel(String respondenttel) {
    this.respondenttel = respondenttel;
  }


  public String getComplaintcontent() {
    return complaintcontent;
  }

  public void setComplaintcontent(String complaintcontent) {
    this.complaintcontent = complaintcontent;
  }


  public String getComplaintimg() {
    return complaintimg;
  }

  public void setComplaintimg(String complaintimg) {
    this.complaintimg = complaintimg;
  }


  public String getComplaintstatus() {
    return complaintstatus;
  }

  public void setComplaintstatus(String complaintstatus) {
    this.complaintstatus = complaintstatus;
  }

}
