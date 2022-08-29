package com.cykj.bean;


public class Tblcomment {

  private long orderid;
  private long shopid;
  private long userid;
  private long commentid;
  private long roleid;
  private String commentcontent;
  private java.sql.Date commenttime;
  private long commentscore;
  private long responsestatus;


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


  public long getCommentid() {
    return commentid;
  }

  public void setCommentid(long commentid) {
    this.commentid = commentid;
  }


  public long getRoleid() {
    return roleid;
  }

  public void setRoleid(long roleid) {
    this.roleid = roleid;
  }


  public String getCommentcontent() {
    return commentcontent;
  }

  public void setCommentcontent(String commentcontent) {
    this.commentcontent = commentcontent;
  }


  public java.sql.Date getCommenttime() {
    return commenttime;
  }

  public void setCommenttime(java.sql.Date commenttime) {
    this.commenttime = commenttime;
  }


  public long getCommentscore() {
    return commentscore;
  }

  public void setCommentscore(long commentscore) {
    this.commentscore = commentscore;
  }


  public long getResponsestatus() {
    return responsestatus;
  }

  public void setResponsestatus(long responsestatus) {
    this.responsestatus = responsestatus;
  }

}
