package com.hcsoc.purchase.server.controller;


import com.hcsoc.purchase.api.PurchaseService;
import com.hcsoc.storage.api.bean.PurchaseReqDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseController {

    public static final Logger LOGGER = LoggerFactory.getLogger(PurchaseController.class);

    @Autowired
    private PurchaseService purchaseService;

    @RequestMapping(path = "/purchase",method = RequestMethod.POST)
    public String purchase( PurchaseReqDto purchaseReqDto){
            purchaseService.purchase(purchaseReqDto.getUserId(),purchaseReqDto.getCommodityCode(),purchaseReqDto.getOrderCount());
        return "success";

    }

}
