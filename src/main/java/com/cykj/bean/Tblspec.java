package com.cykj.bean;


public class Tblspec {

  private long specid;
  private String specname;
  private long parentid;
  private long goodsid;


  public long getSpecid() {
    return specid;
  }

  public void setSpecid(long specid) {
    this.specid = specid;
  }


  public String getSpecname() {
    return specname;
  }

  public void setSpecname(String specname) {
    this.specname = specname;
  }


  public long getParentid() {
    return parentid;
  }

  public void setParentid(long parentid) {
    this.parentid = parentid;
  }


  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }

}
