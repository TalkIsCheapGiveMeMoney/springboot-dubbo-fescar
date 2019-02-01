package com.hcsoc.storage.server;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:storage-provider.xml"})
public class StorageBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder(StorageBootstrap.class)
                .run(args);
    }
}
