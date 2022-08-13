package com.cykj.service;

import com.cykj.bean.Tblcomment;

import java.util.List;

public interface CommentService {

    public List<Tblcomment> getComment(String shopid);
}
