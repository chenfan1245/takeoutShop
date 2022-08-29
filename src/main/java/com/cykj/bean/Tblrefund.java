package com.cykj.bean;


public class Tblrefund {

  private long refundid;
  private long orderid;
  private long shopid;
  private long userid;
  private String refundcontent;
  private double refundmoney;
  private String refundimg;
  private java.sql.Date refundtime;
  private String refundstatus;


  public long getRefundid() {
    return refundid;
  }

  public void setRefundid(long refundid) {
    this.refundid = refundid;
  }


  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }


  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getRefundcontent() {
    return refundcontent;
  }

  public void setRefundcontent(String refundcontent) {
    this.refundcontent = refundcontent;
  }


  public double getRefundmoney() {
    return refundmoney;
  }

  public void setRefundmoney(double refundmoney) {
    this.refundmoney = refundmoney;
  }


  public String getRefundimg() {
    return refundimg;
  }

  public void setRefundimg(String refundimg) {
    this.refundimg = refundimg;
  }


  public java.sql.Date getRefundtime() {
    return refundtime;
  }

  public void setRefundtime(java.sql.Date refundtime) {
    this.refundtime = refundtime;
  }


  public String getRefundstatus() {
    return refundstatus;
  }

  public void setRefundstatus(String refundstatus) {
    this.refundstatus = refundstatus;
  }

}
