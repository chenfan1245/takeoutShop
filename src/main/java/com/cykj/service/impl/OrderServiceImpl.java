package com.cykj.service.impl;

import com.cykj.bean.Tblorder;
import com.cykj.mapper.OrderMapper;
import com.cykj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<Tblorder> getNewOrder(String shopid,String date) {
        List<Tblorder> orderList = orderMapper.getNewOrder(shopid,"27",date);
        return orderList;
    }

    @Override
    public List<Tblorder> getChargeback(String shopid,String date) {
        List<Tblorder> orderList = orderMapper.getNewOrder(shopid,"35",date);
        return orderList;
    }

    @Override
    public List<Tblorder> getSending(String shopid,String date) {
        List<Tblorder> tblorders = orderMapper.getNewOrder(shopid,"31",date);
        return tblorders;
    }

    @Override
    public List<Tblorder> getcompleted(String shopid,String date) {
        List<Tblorder> tblorders = orderMapper.getNewOrder(shopid,"32",date);
        return tblorders;
    }

    @Override
    public String getProfitToday(String shopid, String paystate, String date) {
        String totalIncome = orderMapper.getProfitToday(shopid,paystate,date);
        return totalIncome;
    }
}
