package com.cykj.service;

import com.cykj.bean.Tblorder;

import java.util.List;

public interface OrderService {

    //新订单
    public List<Tblorder> getNewOrder(String shopid, String dae);
    //退单订单
    public List<Tblorder> getChargeback(String shopid,String date);
    //正在派送订单
    public List<Tblorder> getSending(String shopid,String date);
    //已完成订单
    public List<Tblorder> getcompleted(String shopid,String date);
    //获取今日收益
    public String getProfitToday(String shopid,String paystate,String date);
}
