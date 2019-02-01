package com.hcsoc.order.server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:order-provider.xml"})
public class OrderBootStrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderBootStrap.class).run(args);
    }
}
