package com.game;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.annotation.Resource;

/**
 * @Author 11123357
 * @Date 2020/8/19 10:28
 * @Version 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.game"})
@Slf4j
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        log.info("该服务的名称是：{}",context.getEnvironment().getProperty("spring.application.name"));
        log.info("该服务的启动端口是：{}",context.getEnvironment().getProperty("server.port"));
    }
}
