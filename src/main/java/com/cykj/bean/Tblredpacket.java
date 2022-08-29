package com.cykj.bean;


public class Tblredpacket {

  private long redpacketid;
  private String redpacketname;
  private double thresholdmoney;
  private double redpacketmoney;
  private java.sql.Date redpacketdate;
  private long limitdays;


  public long getRedpacketid() {
    return redpacketid;
  }

  public void setRedpacketid(long redpacketid) {
    this.redpacketid = redpacketid;
  }


  public String getRedpacketname() {
    return redpacketname;
  }

  public void setRedpacketname(String redpacketname) {
    this.redpacketname = redpacketname;
  }


  public double getThresholdmoney() {
    return thresholdmoney;
  }

  public void setThresholdmoney(double thresholdmoney) {
    this.thresholdmoney = thresholdmoney;
  }


  public double getRedpacketmoney() {
    return redpacketmoney;
  }

  public void setRedpacketmoney(double redpacketmoney) {
    this.redpacketmoney = redpacketmoney;
  }


  public java.sql.Date getRedpacketdate() {
    return redpacketdate;
  }

  public void setRedpacketdate(java.sql.Date redpacketdate) {
    this.redpacketdate = redpacketdate;
  }


  public long getLimitdays() {
    return limitdays;
  }

  public void setLimitdays(long limitdays) {
    this.limitdays = limitdays;
  }

}
