package com.cykj.service.impl;

import com.cykj.bean.Tblnotice;
import com.cykj.mapper.NoticeMapper;
import com.cykj.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;
    @Override
    public List<Tblnotice> getNotice(String shopid) {
        List<Tblnotice> tblnotices =noticeMapper.getNotice(shopid);
        return tblnotices;
    }

    @Override
    public int changeNoticeState(String noticeid) {
        int re = noticeMapper.changeNoticeState(noticeid);
        return re;
    }

    @Override
    public int deleteNotice(String noticeid) {
        int re = noticeMapper.deleteNotice(noticeid);
        return re;
    }

    @Override
    public int allRead(List<Tblnotice> tblnotices) {
        int re = noticeMapper.allRead(tblnotices);
        return re;
    }

    @Override
    public int allDelete(List<Tblnotice> tblnotices) {
        int re = noticeMapper.allDelete(tblnotices);
        return re;
    }
}
