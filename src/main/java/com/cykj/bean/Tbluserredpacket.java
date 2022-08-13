package com.cykj.bean;


public class Tbluserredpacket {

  private long id;
  private long redpacketid;
  private long userid;
  private java.sql.Date receivedate;
  private java.sql.Date invaliddate;
  private String status;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getRedpacketid() {
    return redpacketid;
  }

  public void setRedpacketid(long redpacketid) {
    this.redpacketid = redpacketid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public java.sql.Date getReceivedate() {
    return receivedate;
  }

  public void setReceivedate(java.sql.Date receivedate) {
    this.receivedate = receivedate;
  }


  public java.sql.Date getInvaliddate() {
    return invaliddate;
  }

  public void setInvaliddate(java.sql.Date invaliddate) {
    this.invaliddate = invaliddate;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
