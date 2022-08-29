package com.cykj.mapper;

import com.cykj.bean.Tblorder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrderMapper {

    //商家获取新订单
    public List<Tblorder> getNewOrder(@Param("shopid")String shopid,@Param("orderstate")String orderstate,@Param("ordertime")String ordertime);

    public String getProfitToday(@Param("shopid")String shopid,@Param("paystate")String paystate,@Param("ordertime")String ordertime);
    //根据shopid获取订单信息
    public List<Tblorder> getOrderInfo(@Param("shopid")String shopid);

}
