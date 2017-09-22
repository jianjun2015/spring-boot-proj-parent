package com.spring.boot.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by wangjianjun on 2017/9/22.
 */
@Controller
@RequestMapping("/freemarker")
public class TestController {

    @RequestMapping("/helloFtl")
    public String helloFtl(Map<String,Object> map){
        map.put("nameKey","freemarker");
        return "freemarker/testFtl";
    }
}
