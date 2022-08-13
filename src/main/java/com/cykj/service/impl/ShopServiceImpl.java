package com.cykj.service.impl;

import com.cykj.mapper.ShopMapper;
import com.cykj.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public String getNewOrder(String shopId) {
        return null;
    }
}
