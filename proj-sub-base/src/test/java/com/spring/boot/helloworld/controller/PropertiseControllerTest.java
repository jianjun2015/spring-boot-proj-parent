package com.spring.boot.helloworld.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.*;

/**
 * Created by wangjianjun on 2017/9/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class PropertiseControllerTest {

    @Test
    public void index() throws Exception {
    }

}