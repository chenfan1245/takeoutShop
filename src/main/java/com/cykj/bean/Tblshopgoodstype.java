package com.cykj.bean;


public class Tblshopgoodstype {

  private long id;
  private long shopid;
  private String name;
  private long parentid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getParentid() {
    return parentid;
  }

  public void setParentid(long parentid) {
    this.parentid = parentid;
  }

}
