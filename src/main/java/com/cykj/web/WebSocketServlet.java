package com.cykj.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.*;

@Component
@ServerEndpoint("/websocket/{shopid}")
public class WebSocketServlet {

    private static ConcurrentHashMap<String,WebSocketServlet> websocketHashMap = new ConcurrentHashMap<String,WebSocketServlet>();

    //连接用户
    private Session session;

    //商铺id
    private String shopid;


    //开启连接
    @OnOpen
    public synchronized void onOpen(Session session,@PathParam("shopid")String shopid){
        System.out.println("商家："+shopid+"进入连接！");
        this.session = session;
        this.shopid = shopid;
        websocketHashMap.put(this.shopid,this);
        System.out.println(session.getId()+"连接成功");
        //执行线程

    }

    //关闭连接
    @OnClose
    public void onClose(@PathParam("shopid")String shopid){
        System.out.println("关闭线程");
        //清除线程

        //清除用户的登录记录
        if (null!=websocketHashMap.get(shopid)){
            websocketHashMap.remove(shopid);
        }
    }

    @OnMessage
    public void onMessage(String message,Session session) throws IOException {
        System.out.println("收到消息:"+message);
        sendMessage(this.shopid,message);
    }

    @OnError
    public void onError(Session session, Throwable error){
        System.out.println("发生错误");
        System.out.println("清除线程");

        //清除用户的登录记录
        if (null!=websocketHashMap.get(shopid)){
            websocketHashMap.remove(shopid);
        }

    }

    public void sendMessage(String shopid,String message) throws IOException {
        websocketHashMap.get(shopid).session.getBasicRemote().sendText(JSON.toJSONString(message));
    }

}
