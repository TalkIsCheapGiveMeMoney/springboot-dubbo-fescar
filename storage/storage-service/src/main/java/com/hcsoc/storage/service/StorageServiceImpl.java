package com.hcsoc.storage.service;

import com.alibaba.fescar.core.context.RootContext;
import com.hcsoc.storage.api.StorageService;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Setter
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageService.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void deduct(String commodityCode, int count) {
        LOGGER.info("Storage Service Begin ... xid: " + RootContext.getXID());
        jdbcTemplate.update("update storage_tbl set count = count - ? where commodity_code = ?", new Object[] {count, commodityCode});
        LOGGER.info("Storage Service End ... ");
    }
}
