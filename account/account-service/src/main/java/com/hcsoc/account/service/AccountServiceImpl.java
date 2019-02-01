package com.hcsoc.account.service;

import com.alibaba.fescar.core.context.RootContext;
import com.hcsoc.account.api.AccountService;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@Setter
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void debit(String userId, int money) {
        LOGGER.info("Account Service ... xid: " + RootContext.getXID());
        int num=jdbcTemplate.update("update account_tbl set money = money - ? where user_id = ? and money>?", new Object[]{money, userId,money});
        if(num==0){
            throw new RuntimeException();
        }
        LOGGER.info("Account Service End ... ");

    }

}
