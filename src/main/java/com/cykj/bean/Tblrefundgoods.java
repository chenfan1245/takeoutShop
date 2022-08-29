package com.cykj.bean;


public class Tblrefundgoods {

  private long id;
  private long orderid;
  private long goodsid;
  private long refundnum;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }


  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }


  public long getRefundnum() {
    return refundnum;
  }

  public void setRefundnum(long refundnum) {
    this.refundnum = refundnum;
  }

}
