package com.hanyang.shortlink.aggregation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 短链接聚合应用
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {
        "com.hanyang.shortlink.admin",
        "com.hanyang.shortlink.project",
        "com.hanyang.shortlink.aggregation"
})
@MapperScan(value = {
        "com.hanyang.shortlink.project.dao.mapper",
        "com.hanyang.shortlink.admin.dao.mapper"
})
public class AggregationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AggregationServiceApplication.class, args);
    }
}