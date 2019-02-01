package com.hcsoc.storage.api.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseReqDto {
    String userId;
    String commodityCode;
    int orderCount;
}
