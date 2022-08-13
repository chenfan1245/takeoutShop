package com.cykj.bean;


public class Tblnotice {

  private long noticeid;
  private long senderid;
  private String noticecontent;
  private long receiverid;
  private java.sql.Date noticetime;
  private String noticestatus;


  public long getNoticeid() {
    return noticeid;
  }

  public void setNoticeid(long noticeid) {
    this.noticeid = noticeid;
  }


  public long getSenderid() {
    return senderid;
  }

  public void setSenderid(long senderid) {
    this.senderid = senderid;
  }


  public String getNoticecontent() {
    return noticecontent;
  }

  public void setNoticecontent(String noticecontent) {
    this.noticecontent = noticecontent;
  }


  public long getReceiverid() {
    return receiverid;
  }

  public void setReceiverid(long receiverid) {
    this.receiverid = receiverid;
  }


  public java.sql.Date getNoticetime() {
    return noticetime;
  }

  public void setNoticetime(java.sql.Date noticetime) {
    this.noticetime = noticetime;
  }


  public String getNoticestatus() {
    return noticestatus;
  }

  public void setNoticestatus(String noticestatus) {
    this.noticestatus = noticestatus;
  }

}
