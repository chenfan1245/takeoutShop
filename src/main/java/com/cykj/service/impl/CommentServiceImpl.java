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
    public List<Tblcomment> getComment(String shopid) {
        List<Tblcomment> tblcomments = commentMapper.getComment(shopid);
        return tblcomments;
    }
}
