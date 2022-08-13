package com.cykj.bean;


import java.sql.Date;

public class Tblorder {

  private long orderid;
  private long addressid;
  private long redpacketid;
  private long shopid;
  private long riderid;
  private String orderno;
  private String orderinfo;
  private java.sql.Date ordertime;
  private java.sql.Date deliverytime;
  private double actualmoney;
  private String paystate;
  private String orderstate;
  private double totalIncome;

  public Tblorder() {
  }

  public Tblorder(long orderid, long addressid, long redpacketid, long shopid, long riderid, String orderno, String orderinfo, Date ordertime, Date deliverytime, double actualmoney, String paystate, String orderstate, double totalIncome) {
    this.orderid = orderid;
    this.addressid = addressid;
    this.redpacketid = redpacketid;
    this.shopid = shopid;
    this.riderid = riderid;
    this.orderno = orderno;
    this.orderinfo = orderinfo;
    this.ordertime = ordertime;
    this.deliverytime = deliverytime;
    this.actualmoney = actualmoney;
    this.paystate = paystate;
    this.orderstate = orderstate;
    this.totalIncome = totalIncome;
  }


  @Override
  public String toString() {
    return "Tblorder{" +
            "orderid=" + orderid +
            ", addressid=" + addressid +
            ", redpacketid=" + redpacketid +
            ", shopid=" + shopid +
            ", riderid=" + riderid +
            ", orderno='" + orderno + '\'' +
            ", orderinfo='" + orderinfo + '\'' +
            ", ordertime=" + ordertime +
            ", deliverytime=" + deliverytime +
            ", actualmoney=" + actualmoney +
            ", paystate='" + paystate + '\'' +
            ", orderstate='" + orderstate + '\'' +
            ", totalIncome=" + totalIncome +
            '}';
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

  public double getTotalIncome() {
    return totalIncome;
  }

  public void setTotalIncome(double totalIncome) {
    this.totalIncome = totalIncome;
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


  public java.sql.Date getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(java.sql.Date ordertime) {
    this.ordertime = ordertime;
  }


  public java.sql.Date getDeliverytime() {
    return deliverytime;
  }

  public void setDeliverytime(java.sql.Date deliverytime) {
    this.deliverytime = deliverytime;
  }


  public double getActualmoney() {
    return actualmoney;
  }

  public void setActualmoney(double actualmoney) {
    this.actualmoney = actualmoney;
  }


  public String getPaystatus() {
    return paystate;
  }

  public void setPaystatus(String paystatus) {
    this.paystate = paystatus;
  }


  public String getOrderstatus() {
    return orderstate;
  }

  public void setOrderstatus(String orderstatus) {
    this.orderstate = orderstatus;
  }

}
