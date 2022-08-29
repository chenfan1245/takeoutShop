package com.cykj.service;

import com.cykj.bean.Tblcomment;

import java.util.List;

public interface CommentService {

    public List<Tblcomment> getComment(String shopid,String roleid);

    public int subComment(String orderid,String shopid,String userid,String commentcontent);

    public int countComment(String orderid);

    public List<Tblcomment> getNotShopComment(String shopid,String roleid);
}
