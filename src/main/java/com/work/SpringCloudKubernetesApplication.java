package com.work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringCloudKubernetesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudKubernetesApplication.class, args);
    }

}
