package com.cykj.bean;


public class Tblstate {

  private long stateid;
  private String statename;
  private long parentid;


  public long getStateid() {
    return stateid;
  }

  public void setStateid(long stateid) {
    this.stateid = stateid;
  }


  public String getStatename() {
    return statename;
  }

  public void setStatename(String statename) {
    this.statename = statename;
  }


  public long getParentid() {
    return parentid;
  }

  public void setParentid(long parentid) {
    this.parentid = parentid;
  }

}
