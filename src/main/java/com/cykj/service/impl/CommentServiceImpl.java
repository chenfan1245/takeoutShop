package com.cykj.service.impl;

import com.cykj.bean.Tblcomment;
import com.cykj.mapper.CommentMapper;
import com.cykj.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<Tblcomment> getComment(String shopid,String roleid) {
        List<Tblcomment> tblcomments = commentMapper.getComment(shopid,roleid);
        return tblcomments;
    }

    @Override
    public int subComment(String orderid, String shopid, String userid, String commentcontent) {
        int re = commentMapper.subComment(orderid,shopid,userid,commentcontent);
        int re1 = commentMapper.updrepStatue(orderid,shopid,userid,"1");
        return re;
    }

    @Override
    public int countComment(String orderid) {
        List<Tblcomment> tblcomments = commentMapper.getCommentTwo(orderid);
        return tblcomments.size();
    }

    @Override
    public List<Tblcomment> getNotShopComment(String shopid, String roleid) {
        List<Tblcomment> tblcomments = commentMapper.getNotShopComment(shopid,roleid);
        return tblcomments;
    }
}
