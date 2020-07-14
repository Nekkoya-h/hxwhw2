package com.hxw.hw2.mapper;

import com.hxw.hw2.entity.OrdersCustom;

import java.util.List;

public interface OrderUserMapper {

    //查询订单信息，关联查询创建订单的用户信息
    public List<OrdersCustom> find();

}
