package com.spring.boot.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangjianjun on 2017/9/22.
 */
@Controller
@RequestMapping("/thymeleaf")
public class TestThyController {

    @RequestMapping("/simple")
    public String simpleIndex(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.csdn.net/hry2015/article/");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "thymeleaf/simple/index";
    }
}
