package com.hcsoc.purchase.server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:purchase-consumer.xml"})
public class PurchaseServerBootStrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PurchaseServerBootStrap.class).run(args);
    }
}
