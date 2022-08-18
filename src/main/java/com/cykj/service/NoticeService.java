package com.cykj.service;

import com.cykj.bean.Tblnotice;

import java.util.List;

public interface NoticeService {

    //根据shopid查询系统消息表
    public List<Tblnotice> getNotice(String shopid);
    //将未读消息改成已读消息
    public int changeNoticeState(String noticeid);
    //商家删除消息
    public int deleteNotice(String noticeid);
    //全部已读
    public int allRead(List<Tblnotice> tblnotices);
    //全部删除
    public int allDelete(List<Tblnotice> tblnotices);
}
