package com.cykj.mapper;

import com.cykj.bean.Tblallshoporder;
import com.cykj.bean.Tblredpacket;
import com.cykj.bean.Tblrole;
import com.cykj.bean.Tblshop;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopMapper {
    public Tblshop ShopLogin(@Param("shoptel")String shoptel,
                             @Param("shoppwd")String shoppwd);
    public Tblshop getShopInfo(@Param("shoptel")String shoptel);
    public Tblrole getRole(@Param("roleid")long roleid);
    public List<Tblallshoporder> searchShopOrder(@Param("shopid")long shopid,
                                                 @Param("orderstate")String orderstate,
                                                 @Param("paystate")String paystate);
    public List<Tblallshoporder>searchOrderGoodsInfo(@Param("orderid")long orderid);
    //改变订单状态
    public int orderStateChange(@Param("orderid")long orderid,@Param("orderstate")String orderstate);
    //获取订单红包信息
    public List<Tblredpacket>searchRedPacketInfo(@Param("redpacketid")long redpacketid);



}
