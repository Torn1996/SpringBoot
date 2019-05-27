package com.cgt.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: cgt
 * @Date: 2019/5/27 22:22
 * @Version 1.0
 */
@SpringBootApplication  //用来标志一个主程序，说明这是一个springboot应用
public class HelloWorldMainApplication {
    //springboot应用启动起来
    public static void main(String[] args){
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }

}
