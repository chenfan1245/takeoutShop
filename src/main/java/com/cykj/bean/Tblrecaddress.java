package com.cykj.bean;


public class Tblrecaddress {

  private long addressid;
  private long userid;
  private String rectel;
  private String recaddress;
  private String housenum;
  private String recname;
  private String info;


  public long getAddressid() {
    return addressid;
  }

  public void setAddressid(long addressid) {
    this.addressid = addressid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getRectel() {
    return rectel;
  }

  public void setRectel(String rectel) {
    this.rectel = rectel;
  }


  public String getRecaddress() {
    return recaddress;
  }

  public void setRecaddress(String recaddress) {
    this.recaddress = recaddress;
  }


  public String getHousenum() {
    return housenum;
  }

  public void setHousenum(String housenum) {
    this.housenum = housenum;
  }


  public String getRecname() {
    return recname;
  }

  public void setRecname(String recname) {
    this.recname = recname;
  }


  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

}
