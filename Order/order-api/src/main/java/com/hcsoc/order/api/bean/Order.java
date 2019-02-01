package com.hcsoc.order.api.bean;

import java.io.Serializable;

public class Order implements Serializable {
    public long id;
    public String userId;
    public String commodityCode;
    public int count;
    public int money;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", commodityCode='" + commodityCode + '\'' +
                ", count=" + count +
                ", money=" + money +
                '}';
    }
}
