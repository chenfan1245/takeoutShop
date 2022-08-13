package com.cykj.mapper;

import com.cykj.bean.Tblcomment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommentMapper {
    //获取用户评论
    public List<Tblcomment> getComment(@Param("shopid")String shopid);
}
