package com.hxw.hw2.entity;

import java.security.Timestamp;
import java.util.List;

public class OrdersCustom {

    //一对一关联 UserCustom
    private UserCustom userCustom;
    //一对多关联 OrderdetailCustom
    private List<OrderDetailCustom> detailList;

    public OrdersCustom() {
    }

    public OrdersCustom(Integer id, Integer userId, Timestamp createtime, String number, String note, UserCustom userCustom, List<OrderDetailCustom> detailList) {
        this.userCustom = userCustom;
        this.detailList = detailList;
    }

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }

    public List<OrderDetailCustom> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<OrderDetailCustom> detailList) {
        this.detailList = detailList;
    }

    @Override
    public String toString() {
        return "OrdersCustom{" +
                super.toString() +
                ", userCustom=" + userCustom +
                ", detailList=" + detailList +
                '}';
    }

}
