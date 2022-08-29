package com.cykj.bean;

import java.sql.Date;
import java.sql.Time;

public class Tblallshoporder {
    private String ordertime;
    private String deliverytime;
    private long orderid;
    private long addressid;
    private long redpacketid;
    private long shopid;
    private long riderid;
    private String orderno;
    private String orderinfo;
    private double actualmoney;
    private double deliveryfee;
    private String paystate;
    private String orderstate;
    private String esdeliverytime;

    private long userid;
    private String rectel;
    private String recaddress;
    private String housenum;
    private String recname;
    private String isdefault;
    private String info;
    private String longitude;
    private String latitude;
    private long goodsid;

    private long typeid;
    private long shopgoodstypeid;
    private String goodsname;
    private long goodsnum;
    private double goodsprice;
    private String goodsdescribe;
    private String goodsimg;
    private String goodsstate;
    private String auditstate;
    private long monsales;
    private long id;

    private long bugnum;

    public Tblallshoporder() {
    }

    public Tblallshoporder(String ordertime, String deliverytime, long orderid, long addressid, long redpacketid, long shopid, long riderid, String orderno, String orderinfo, double actualmoney, double deliveryfee, String paystate, String orderstate, String esdeliverytime, long userid, String rectel, String recaddress, String housenum, String recname, String isdefault, String info, String longitude, String latitude, long goodsid, long typeid, long shopgoodstypeid, String goodsname, long goodsnum, double goodsprice, String goodsdescribe, String goodsimg, String goodsstate, String auditstate, long monsales, long id, long bugnum) {
        this.ordertime = ordertime;
        this.deliverytime = deliverytime;
        this.orderid = orderid;
        this.addressid = addressid;
        this.redpacketid = redpacketid;
        this.shopid = shopid;
        this.riderid = riderid;
        this.orderno = orderno;
        this.orderinfo = orderinfo;
        this.actualmoney = actualmoney;
        this.deliveryfee = deliveryfee;
        this.paystate = paystate;
        this.orderstate = orderstate;
        this.esdeliverytime = esdeliverytime;
        this.userid = userid;
        this.rectel = rectel;
        this.recaddress = recaddress;
        this.housenum = housenum;
        this.recname = recname;
        this.isdefault = isdefault;
        this.info = info;
        this.longitude = longitude;
        this.latitude = latitude;
        this.goodsid = goodsid;
        this.typeid = typeid;
        this.shopgoodstypeid = shopgoodstypeid;
        this.goodsname = goodsname;
        this.goodsnum = goodsnum;
        this.goodsprice = goodsprice;
        this.goodsdescribe = goodsdescribe;
        this.goodsimg = goodsimg;
        this.goodsstate = goodsstate;
        this.auditstate = auditstate;
        this.monsales = monsales;
        this.id = id;
        this.bugnum = bugnum;
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime;
    }

    public String getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(String deliverytime) {
        this.deliverytime = deliverytime;
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

    public String getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public long getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(long goodsid) {
        this.goodsid = goodsid;
    }

    public long getTypeid() {
        return typeid;
    }

    public void setTypeid(long typeid) {
        this.typeid = typeid;
    }

    public long getShopgoodstypeid() {
        return shopgoodstypeid;
    }

    public void setShopgoodstypeid(long shopgoodstypeid) {
        this.shopgoodstypeid = shopgoodstypeid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public long getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(long goodsnum) {
        this.goodsnum = goodsnum;
    }

    public double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodsdescribe() {
        return goodsdescribe;
    }

    public void setGoodsdescribe(String goodsdescribe) {
        this.goodsdescribe = goodsdescribe;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
    }

    public String getGoodsstate() {
        return goodsstate;
    }

    public void setGoodsstate(String goodsstate) {
        this.goodsstate = goodsstate;
    }

    public String getAuditstate() {
        return auditstate;
    }

    public void setAuditstate(String auditstate) {
        this.auditstate = auditstate;
    }

    public long getMonsales() {
        return monsales;
    }

    public void setMonsales(long monsales) {
        this.monsales = monsales;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBugnum() {
        return bugnum;
    }

    public void setBugnum(long bugnum) {
        this.bugnum = bugnum;
    }

    @Override
    public String toString() {
        return "Tblallshoporder{" +
                "ordertime='" + ordertime + '\'' +
                ", deliverytime='" + deliverytime + '\'' +
                ", orderid=" + orderid +
                ", addressid=" + addressid +
                ", redpacketid=" + redpacketid +
                ", shopid=" + shopid +
                ", riderid=" + riderid +
                ", orderno='" + orderno + '\'' +
                ", orderinfo='" + orderinfo + '\'' +
                ", actualmoney=" + actualmoney +
                ", deliveryfee=" + deliveryfee +
                ", paystate='" + paystate + '\'' +
                ", orderstate='" + orderstate + '\'' +
                ", esdeliverytime='" + esdeliverytime + '\'' +
                ", userid=" + userid +
                ", rectel='" + rectel + '\'' +
                ", recaddress='" + recaddress + '\'' +
                ", housenum='" + housenum + '\'' +
                ", recname='" + recname + '\'' +
                ", isdefault='" + isdefault + '\'' +
                ", info='" + info + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", goodsid=" + goodsid +
                ", typeid=" + typeid +
                ", shopgoodstypeid=" + shopgoodstypeid +
                ", goodsname='" + goodsname + '\'' +
                ", goodsnum=" + goodsnum +
                ", goodsprice=" + goodsprice +
                ", goodsdescribe='" + goodsdescribe + '\'' +
                ", goodsimg='" + goodsimg + '\'' +
                ", goodsstate='" + goodsstate + '\'' +
                ", auditstate='" + auditstate + '\'' +
                ", monsales=" + monsales +
                ", id=" + id +
                ", bugnum=" + bugnum +
                '}';
    }
}
