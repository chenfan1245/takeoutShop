package com.cykj.service.impl;

import com.cykj.bean.Tblallshoporder;
import com.cykj.bean.Tblredpacket;
import com.cykj.bean.Tblrole;
import com.cykj.bean.Tblshop;
import com.cykj.mapper.ShopMapper;
import com.cykj.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public String getNewOrder(String shopId) {
        return null;
    }
    @Override
    public boolean ShopLogin(String shoptel, String shoppwd) {
        Tblshop tblshop=shopMapper.ShopLogin(shoptel,shoppwd);
        if(tblshop!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Tblshop getShopInfo(String shoptel) {
        Tblshop tblshop=shopMapper.getShopInfo(shoptel);
        return tblshop;
    }

    @Override
    public Tblrole getRole(long roleid) {
        Tblrole tblrole=shopMapper.getRole(roleid);
        return tblrole;
    }

    @Override
    public List<Tblallshoporder> searchShopOrder(long shopid,String orderstate,String paystate) {
       List<Tblallshoporder> list=shopMapper.searchShopOrder(shopid,orderstate,paystate);
        return list;
    }

    @Override
    public List<Tblallshoporder> searchOrderGoodsInfo(long orderid) {
        List<Tblallshoporder> list=shopMapper.searchOrderGoodsInfo(orderid);
        return list;
    }

    @Override
    public boolean orderStateChange(long orderid,String orderstate) {
       int num =shopMapper.orderStateChange(orderid,orderstate);
        System.out.println(num);
       if (num>0){
           return true;
       }else {
           return false;
       }
    }

    @Override
    public List<Tblredpacket> searchRedPacketInfo(long redpacketid) {
        List<Tblredpacket>list=shopMapper.searchRedPacketInfo(redpacketid);
        return list;
    }


}
