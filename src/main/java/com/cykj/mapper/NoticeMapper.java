package com.cykj.mapper;

import com.cykj.bean.Tblnotice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NoticeMapper {

    //根据shopid查找系统发送过来的信息
    public List<Tblnotice> getNotice(@Param("shopid")String shopid);
    //根据系统信息id与商铺id修改信息状态为已读
    public int changeNoticeState(@Param("noticeid")String noticeid);
    //根据noticeid删除notice
    public int deleteNotice(@Param("noticeid")String noticeid);
    //全部已读
    public int allRead(@Param("noticeList")List<Tblnotice> noticeList);
    //全部删除
    public int allDelete(@Param("noticeList")List<Tblnotice> noticeList);
}
