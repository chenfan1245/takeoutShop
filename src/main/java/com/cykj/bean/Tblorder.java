package com.cykj.bean;


public class Tblorder {

  private long orderid;
  private long addressid;
  private long redpacketid;
  private long shopid;
  private long riderid;
  private String orderno;
  private String orderinfo;
  private java.sql.Timestamp ordertime;
  private java.sql.Timestamp deliverytime;
  private double actualmoney;
  private double deliveryfee;
  private String paystate;
  private String orderstate;
  private String esdeliverytime;
  private double totalIncome;
  private String statename;
  private String userid;


  public Tblorder() {
  }


  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }


  public long getAddressid() {
    return addressid;
  }

  public void setAddressid(long addressid) {
    this.addressid = addressid;
  }


  public long getRedpacketid() {
    return redpacketid;
  }

  public void setRedpacketid(long redpacketid) {
    this.redpacketid = redpacketid;
  }


  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }


  public long getRiderid() {
    return riderid;
  }

  public void setRiderid(long riderid) {
    this.riderid = riderid;
  }


  public String getOrderno() {
    return orderno;
  }

  public void setOrderno(String orderno) {
    this.orderno = orderno;
  }


  public String getOrderinfo() {
    return orderinfo;
  }

  public void setOrderinfo(String orderinfo) {
    this.orderinfo = orderinfo;
  }


  public java.sql.Timestamp getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(java.sql.Timestamp ordertime) {
    this.ordertime = ordertime;
  }


  public java.sql.Timestamp getDeliverytime() {
    return deliverytime;
  }

  public void setDeliverytime(java.sql.Timestamp deliverytime) {
    this.deliverytime = deliverytime;
  }


  public double getActualmoney() {
    return actualmoney;
  }

  public void setActualmoney(double actualmoney) {
    this.actualmoney = actualmoney;
  }


  public double getDeliveryfee() {
    return deliveryfee;
  }

  public void setDeliveryfee(double deliveryfee) {
    this.deliveryfee = deliveryfee;
  }


  public String getPaystate() {
    return paystate;
  }

  public void setPaystate(String paystate) {
    this.paystate = paystate;
  }


  public String getOrderstate() {
    return orderstate;
  }

  public void setOrderstate(String orderstate) {
    this.orderstate = orderstate;
  }


  public String getEsdeliverytime() {
    return esdeliverytime;
  }

  public void setEsdeliverytime(String esdeliverytime) {
    this.esdeliverytime = esdeliverytime;
  }

  public String getStatename() {
    return statename;
  }

  public void setStatename(String statename) {
    this.statename = statename;
  }

  public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }
}
