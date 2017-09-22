package com.spring.boot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wangjianjun on 2017/9/21.
 */
@SpringBootApplication //// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);

    }
}
