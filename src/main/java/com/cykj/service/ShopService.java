package com.cykj.service;

import com.cykj.bean.Tblallshoporder;
import com.cykj.bean.Tblredpacket;
import com.cykj.bean.Tblrole;
import com.cykj.bean.Tblshop;

import java.util.List;

public interface ShopService {

    public String getNewOrder(String shopId);
    public boolean ShopLogin(String shoptel,String shoppwd);
    public Tblshop getShopInfo(String shoptel);
    public Tblrole getRole(long roleid);
    public List<Tblallshoporder> searchShopOrder(long shopid,String orderstate,String paystate);
    public List<Tblallshoporder>searchOrderGoodsInfo(long orderid);
    public boolean orderStateChange(long orderid,String orderstate);
    public List<Tblredpacket>searchRedPacketInfo(long redpacketid);

}
