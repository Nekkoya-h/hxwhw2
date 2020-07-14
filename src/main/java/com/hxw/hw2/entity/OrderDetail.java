package com.hxw.hw2.entity;

public class OrderDetail {

    private Integer id;
    private Integer ordersId;
    private Integer itemsId;
    private Integer itemsNum;

    public OrderDetail() {
    }

    public OrderDetail(Integer id, Integer ordersId, Integer itemsId, Integer itemsNum) {
        this.id = id;
        this.ordersId = ordersId;
        this.itemsId = itemsId;
        this.itemsNum = itemsNum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getItemsId() {
        return itemsId;
    }

    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public Integer getItemsNum() {
        return itemsNum;
    }

    public void setItemsNum(Integer itemsNum) {
        this.itemsNum = itemsNum;
    }

    @Override
    public String toString() {
        return "Orderdetail{" +
                "id=" + id +
                ", ordersId=" + ordersId +
                ", itemsId=" + itemsId +
                ", itemsNum=" + itemsNum +
                '}';
    }

}
