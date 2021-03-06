package com.spring.boot.mail.service.impl;

import com.spring.boot.mail.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import static org.junit.Assert.*;

/**
 * Created by wangjianjun on 2017/9/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceImplTest {

    @Autowired
    private MailService mailService;

    @Autowired
    private TemplateEngine templateEngine;

    @Test
    public void sendSimpleMail() throws Exception {
        mailService.sendSimpleMail("wangjianjun@hdfax.com","test thymeleaf mail"," hello this is thymeleaf mail");
    }

    @Test
    public void sendHtmlMail() throws Exception {
        String content="<html>\n" +
                "<body>\n" +
                "    <h3>hello world ! 这是一封html邮件!</h3>\n" +
                "</body>\n" +
                "</html>";
        mailService.sendHtmlMail("wangjianjun@hdfax.com","test thymeleaf mail",content);
    }

    @Test
    public void sendAttachmentsMail() throws Exception {
        String filePath="e:\\tmp\\application.log";
        mailService.sendAttachmentsMail("wangjianjun@hdfax.com", "主题：带附件的邮件", "有附件，请查收！", filePath);
    }

    @Test
    public void sendInlineResourceMail() throws Exception {
        String rscId = "neo006";
        String content="<html><body>这是有图片的邮件：<img src=\'cid:" + rscId + "\' ></body></html>";
        String imgPath = "C:\\Users\\favicon.png";

        mailService.sendInlineResourceMail("wangjianjun@hdfax.com", "主题：这是有图片的邮件", content, imgPath, rscId);

    }

    @Test
    public void sendTemplateMail() {
        //创建邮件正文
        Context context = new Context();
        context.setVariable("id", "006");
        String emailContent = templateEngine.process("emailTemplate", context);

        mailService.sendHtmlMail("wangjianjun@hdfax.com","主题：这是模板邮件",emailContent);
    }
}