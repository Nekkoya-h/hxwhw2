package com.hxw.hw2.mapper;

import com.hxw.hw2.entity.OrdersCustom;

import java.util.List;

public interface OrderAndOrderDetailMapper {

    //需求：查询订单及订单明细的信息，及用户信息
    public List<OrdersCustom> selectOrderANDOrderDetailUser();

}
