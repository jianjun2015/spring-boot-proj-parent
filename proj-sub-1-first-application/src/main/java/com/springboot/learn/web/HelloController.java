package com.springboot.learn.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by wangjianjun on 2017/9/27.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Greeting from spring boot";
    }

    /**
     * 查看springboot启动时候会加载哪些bean到容器
     * @param atx
     * @return
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext atx){
        return args->{
            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = atx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }
}
