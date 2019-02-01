package com.hcsoc.storage.server.Controller;

import com.hcsoc.storage.api.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    public static final Logger LOGGER = LoggerFactory.getLogger(StorageController.class);
    @Autowired
    private StorageService storageService;

    @RequestMapping("/deduct/{code}/{count}")
    public boolean deduct(@PathVariable("code") String commodityCode, @PathVariable("count") int count) {
        boolean result = true;
        try {
            storageService.deduct(commodityCode, count);
        } catch (Exception e) {
            result = false;
            LOGGER.error("deduct exception", e);
        }
        return result;
    }


}
