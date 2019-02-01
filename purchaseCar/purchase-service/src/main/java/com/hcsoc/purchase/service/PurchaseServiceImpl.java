package com.hcsoc.purchase.service;

import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.hcsoc.order.api.OrderService;
import com.hcsoc.purchase.api.PurchaseService;
import com.hcsoc.storage.api.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PurchaseServiceImpl implements PurchaseService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PurchaseServiceImpl.class);

    @Autowired
    private OrderService orderService;

    @Autowired
    private StorageService storageService;

    @GlobalTransactional(timeoutMills = 300000, name = "dubbo-demo-tx-purchase")
    public void purchase(String userId, String commodityCode, int orderCount) {
        storageService.deduct(commodityCode, orderCount);
        orderService.create(userId, commodityCode, orderCount);
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public StorageService getStorageService() {
        return storageService;
    }

    public void setStorageService(StorageService storageService) {
        this.storageService = storageService;
    }
}
