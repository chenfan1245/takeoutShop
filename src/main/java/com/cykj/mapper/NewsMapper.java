package com.cykj.mapper;

import com.cykj.bean.Tblnews;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NewsMapper {

    //根据orderid，roleid获取信息
    public List<Tblnews> getNews(@Param("orderid")String oderid);

    //将商家发送信息存入数据表中
    public int shopsent(@Param("orderid")String orderid,
                        @Param("senttime")String senttime,
                        @Param("sentcontent")String sentcontent);

}


