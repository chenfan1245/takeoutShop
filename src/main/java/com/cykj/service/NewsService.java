package com.cykj.service;

import java.util.HashMap;

public interface NewsService {

    //获取三个角色的通讯信息
    public HashMap<String,Object> getNews(String orderid);

    //商家发送信息
    public int shopSent(String orderid,String sentcontent);
}
