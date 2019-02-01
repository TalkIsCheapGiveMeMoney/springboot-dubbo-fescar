package com.hcsoc.order.api;

import com.hcsoc.order.api.bean.Order;

public interface OrderService {
    /**
     * 创建订单
     *
     * @param userId 用户ID
     * @param commodityCode 商品编号
     * @param orderCount 订购数量
     * @return 生成的订单
     */
    Order create(String userId, String commodityCode, int orderCount);

}
