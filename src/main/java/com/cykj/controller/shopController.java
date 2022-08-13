package com.cykj.controller;

import com.cykj.bean.Tblcomment;
import com.cykj.bean.Tblorder;
import com.cykj.mapper.CommentMapper;
import com.cykj.mapper.OrderMapper;
import com.cykj.service.CommentService;
import com.cykj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RequestMapping("/shop")
@RestController
public class shopController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private CommentService commentService;

    @RequestMapping("/hello")
    public String text(){
        return "welcome shop";
    }

    //商家端获取订单数据（新订单、异常订单、退单、催单、评论）
    @RequestMapping("/getShopData")
    public HashMap getShopData(@RequestBody String shopid){
        System.out.println(shopid);
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
        String ordertime = dateFormat.format(date);
        HashMap<String,String> map = new HashMap<>();
        List<Tblorder> orderList = orderService.getNewOrder(shopid,"");
        map.put("newOrder",orderList.size()+"");
        List<Tblorder> backorderList = orderService.getChargeback(shopid,"");
        map.put("backOrder",backorderList.size()+"");
        List<Tblorder> sendOrders = orderService.getSending(shopid,"");
        map.put("sending",sendOrders.size()+"");
        List<Tblorder> comorders = orderService.getcompleted(shopid,"");
        map.put("completed",comorders.size()+"");
        List<Tblcomment> tblcomments = commentService.getComment(shopid);
        map.put("comment",tblcomments.size()+"");
        String totalIncome = orderService.getProfitToday(shopid,"38",ordertime);
        map.put("totalIncome",totalIncome+"");
        List<Tblorder> totalcomorders = orderService.getcompleted(shopid,ordertime);
        map.put("totalcompleted",totalcomorders.size()+"");
        return map;
    }

}
