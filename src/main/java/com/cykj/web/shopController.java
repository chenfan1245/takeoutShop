package com.cykj.web;

import com.cykj.bean.Tblcomment;
import com.cykj.bean.Tblnotice;
import com.cykj.bean.Tblorder;
import com.cykj.service.CommentService;
import com.cykj.service.NewsService;
import com.cykj.service.NoticeService;
import com.cykj.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@RequestMapping("/shop")
@RestController
public class shopController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private NoticeService noticeService;
    @Autowired
    private NewsService newsService;

    private WebSocketServlet webSocketServlet = new WebSocketServlet();

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
        List<Tblcomment> tblcomments = commentService.getComment(shopid,"1");
        map.put("comment",tblcomments.size()+"");
        String totalIncome = orderService.getProfitToday(shopid,"38",ordertime);
        map.put("totalIncome",totalIncome+"");
        List<Tblorder> totalcomorders = orderService.getNewOrder(shopid,ordertime);
        map.put("totalcompleted",totalcomorders.size()+"");

        return map;
    }
    //商家根据商铺id获取评论信息（评论内容、打分）
    @RequestMapping("/getComment")
    public HashMap<String,Object> getComment(@RequestBody String shopid){
        List<Tblcomment> tblcomments = commentService.getComment(shopid,"");
        List<Tblcomment> userCommentList = new ArrayList<>();
        List<Tblcomment> shopCommentList = new ArrayList<>();
        for (int i = 0;i<tblcomments.size();i++){
            if (tblcomments.get(i).getRoleid()==1){
                userCommentList.add(tblcomments.get(i));
            }else if (tblcomments.get(i).getRoleid()==3){
                shopCommentList.add(tblcomments.get(i));
            }
        }
        HashMap<String,Object> map = new HashMap<>();
        map.put("userComment",userCommentList);
        map.put("shopComment",shopCommentList);
        List<HashMap> textContentList = new ArrayList<>();
        int flag=0;
        for (int i = 0; i <userCommentList.size() ; i++) {
                int re = commentService.countComment(userCommentList.get(i).getOrderid()+"");
                if (re==1){
                    HashMap<Object,Object> textmap = new HashMap<>();
                    textmap.put("textId",userCommentList.get(i).getOrderid());
                    textmap.put("textContent","");
                    textContentList.add(textmap);
                }else {
                    continue;
                }
        }
        System.out.println(textContentList.size());
        map.put("textContent",textContentList);
        List<HashMap> scoreList = new ArrayList<>();
        for (int i = 0; i <userCommentList.size() ; i++) {
            HashMap<Object,Object> scoreMap = new HashMap<>();
            scoreMap.put("scoreId",userCommentList.get(i).getOrderid());
            scoreMap.put("score",userCommentList.get(i).getCommentscore());
            scoreList.add(scoreMap);
        }
        map.put("scoreList",scoreList);
        return map;
    }
    //获取商家未回复的用户
    @RequestMapping("/getNotShopComment")
    public HashMap<String,Object>  getNotShopComment(@RequestBody String shopid){
        List<Tblcomment> tblcomments = commentService.getNotShopComment(shopid,"");
        List<Tblcomment> userCommentList = new ArrayList<>();
        List<Tblcomment> shopCommentList = new ArrayList<>();
        for (int i = 0;i<tblcomments.size();i++){
            if (tblcomments.get(i).getRoleid()==1){
                userCommentList.add(tblcomments.get(i));
            }else if (tblcomments.get(i).getRoleid()==3){
                shopCommentList.add(tblcomments.get(i));
            }
        }
        HashMap<String,Object> map = new HashMap<>();
        map.put("userComment",userCommentList);
        map.put("shopComment",shopCommentList);
        List<HashMap> textContentList = new ArrayList<>();
        int flag=0;
        for (int i = 0; i <userCommentList.size() ; i++) {
            int re = commentService.countComment(userCommentList.get(i).getOrderid()+"");
            if (re==1){
                HashMap<Object,Object> textmap = new HashMap<>();
                textmap.put("textId",userCommentList.get(i).getOrderid());
                textmap.put("textContent","");
                textContentList.add(textmap);
            }else {
                continue;
            }
        }
        System.out.println(textContentList.size());
        map.put("textContent",textContentList);
        List<HashMap> scoreList = new ArrayList<>();
        for (int i = 0; i <userCommentList.size() ; i++) {
            HashMap<Object,Object> scoreMap = new HashMap<>();
            scoreMap.put("scoreId",userCommentList.get(i).getOrderid());
            scoreMap.put("score",userCommentList.get(i).getCommentscore());
            scoreList.add(scoreMap);
        }
        map.put("scoreList",scoreList);
        return map;
    }
    //回复用户
    @RequestMapping("/subComment")
    public String subComment(@RequestBody Tblcomment shopComment){
        System.out.println(shopComment.getShopid()+","+shopComment.getOrderid()+","+shopComment.getUserid()+","+shopComment.getCommentcontent());
        if (shopComment.getCommentcontent()!=null){
            int re = commentService.subComment(shopComment.getOrderid()+"",shopComment.getShopid()+"",shopComment.getUserid()+"",shopComment.getCommentcontent());
            return re+"";
        }else {
            return "0";
        }
    }

    //获取系统管理员发给商家的信息
    @RequestMapping("/getNotice")
    public HashMap<String,Object> getNotice(@RequestBody String shopid){
        HashMap<String,Object> map = new HashMap<>();
        List<Tblnotice> tblnotices = noticeService.getNotice(shopid);
        map.put("noticeList",tblnotices);
        return map;
    }
    //改变系统发送信息状态
    @RequestMapping("/changState")
    public String changState(@RequestBody String noticeid){
        int re = noticeService.changeNoticeState(noticeid);
        return re+"";
    }
    //删除系统发送信息
    @RequestMapping("/deleteNotice")
    public String deleteNotice(@RequestBody String noticeid){
        int re =  noticeService.deleteNotice(noticeid);
        return re+"";
    }
    //全部已读
    @RequestMapping("/allread")
    public String allread(@RequestBody List<Tblnotice> noticeList){
        System.out.println(noticeList.size());
        int re = noticeService.allRead(noticeList);
        return re+"";
    }
    //全部删除
    @RequestMapping("/alldelete")
    public String alldelete(@RequestBody List<Tblnotice> noticeList){
        System.out.println(noticeList.size());
        int re = noticeService.allDelete(noticeList);
        return re+"";
    }

    //根据shopid获取订单信息
    @RequestMapping("/getOrderInfo")
    public HashMap<String,Object> getOrderInfo(@RequestBody String shopid){
        HashMap<String,Object> map = new HashMap<>();
        List<Tblorder> tblorders = orderService.getOrderInfo(shopid);
        map.put("orderList",tblorders);
        return map;
    }
    //根据orderid获取聊天信息
    @RequestMapping("/getchatInfo")
    public HashMap<String,Object> getChatInfo(@RequestBody String orderid){
        HashMap<String,Object> map = newsService.getNews(orderid);
        return map;
    }

    //将商家发送的信息加入到信息表中
    @RequestMapping("/sendNews")
    public String sendNews(String orderid,String sentcontent){
        int re = newsService.shopSent(orderid,sentcontent);
        return re+"";
    }

}
