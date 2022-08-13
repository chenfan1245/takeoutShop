package com.cykj.bean;


public class Tblcomment {

  private long orderid;
  private long shopid;
  private long userid;
  private long commentid;
  private String commentcontent;
  private long commentscore;


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


  public String getCommentcontent() {
    return commentcontent;
  }

  public void setCommentcontent(String commentcontent) {
    this.commentcontent = commentcontent;
  }


  public long getCommentscore() {
    return commentscore;
  }

  public void setCommentscore(long commentscore) {
    this.commentscore = commentscore;
  }

}
