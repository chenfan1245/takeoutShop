package com.cykj.bean;


public class Tblnews {

  private long newsid;
  private long orderid;
  private long roleid;
  private java.sql.Timestamp senttime;
  private String sentcontent;


  public long getNewsid() {
    return newsid;
  }

  public void setNewsid(long newsid) {
    this.newsid = newsid;
  }


  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }


  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }


  public java.sql.Timestamp getSenttime() {
    return senttime;
  }

  public void setSenttime(java.sql.Timestamp senttime) {
    this.senttime = senttime;
  }


  public String getSentcontent() {
    return sentcontent;
  }

  public void setSentcontent(String sentcontent) {
    this.sentcontent = sentcontent;
  }

}
