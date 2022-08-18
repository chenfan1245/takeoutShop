package com.cykj.service.impl;

import com.cykj.bean.Tblnews;
import com.cykj.mapper.NewsMapper;
import com.cykj.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    private NewsMapper newsMapper;


    @Override
    public HashMap<String, Object> getNews(String orderid) {
        List<Tblnews> newsList = newsMapper.getNews(orderid);
        HashMap<String,Object> newMap = new HashMap<>();
        newMap.put("newsList",newsList);
        return newMap;
    }

    @Override
    public int shopSent(String orderid, String sentcontent) {
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        String senttime = dateFormat.format(date);
        int re = newsMapper.shopsent(orderid,senttime,sentcontent);
        return re;
    }
}
