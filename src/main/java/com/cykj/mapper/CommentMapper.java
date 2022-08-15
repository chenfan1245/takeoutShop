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
    public List<Tblcomment> getComment(@Param("shopid")String shopid,@Param("roleid")String roleid);

    //添加商铺回复用户信息
    public int subComment(@Param("orderid")String orderid,
                          @Param("shopid")String shopid,
                          @Param("userid")String userid,
                          @Param("commentcontent")String commentcontent);

    //使用订单号查询评论信息
    public List<Tblcomment> getCommentTwo(@Param("orderid")String orderid);

    //更改商家回复状态
    public int updrepStatue(@Param("orderid")String orderid,
                            @Param("shopid")String shopid,
                            @Param("userid")String userid,
                            @Param("roleid")String roleid);

    //获取商家未回复的用户评论
    public List<Tblcomment> getNotShopComment(@Param("shopid")String shopid,@Param("roleid")String roleid);
}
