package com.cykj.bean;


public class Tblseckill {

  private long seckill;
  private long goodsid;
  private java.sql.Time opentime;
  private java.sql.Time endtime;
  private double seckillprice;
  private long seckillnum;
  private String seckillstate;


  public long getSeckill() {
    return seckill;
  }

  public void setSeckill(long seckill) {
    this.seckill = seckill;
  }


  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }


  public java.sql.Time getOpentime() {
    return opentime;
  }

  public void setOpentime(java.sql.Time opentime) {
    this.opentime = opentime;
  }


  public java.sql.Time getEndtime() {
    return endtime;
  }

  public void setEndtime(java.sql.Time endtime) {
    this.endtime = endtime;
  }


  public double getSeckillprice() {
    return seckillprice;
  }

  public void setSeckillprice(double seckillprice) {
    this.seckillprice = seckillprice;
  }


  public long getSeckillnum() {
    return seckillnum;
  }

  public void setSeckillnum(long seckillnum) {
    this.seckillnum = seckillnum;
  }


  public String getSeckillstate() {
    return seckillstate;
  }

  public void setSeckillstate(String seckillstate) {
    this.seckillstate = seckillstate;
  }

}
