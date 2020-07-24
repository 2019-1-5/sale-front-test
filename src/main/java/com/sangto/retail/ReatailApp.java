package com.sangto.retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableSwagger2
@SpringBootApplication
@EnableScheduling //这样配置的定时任务是单线程串行执行

public class ReatailApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ReatailApp.class, args);
    }
}
