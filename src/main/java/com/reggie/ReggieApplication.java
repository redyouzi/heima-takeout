package com.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j//使用lombok提供的日志
@ServletComponentScan//扫描WebFilter的一些注解
@SpringBootApplication
@EnableTransactionManagement//开启事务注解支持
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class,args);
        //输出日志
        log.info("项目启动成功...");
    }
}
