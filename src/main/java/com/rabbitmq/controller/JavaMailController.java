package com.rabbitmq.controller;

import com.rabbitmq.mail.impl.JavaMail;
import com.rabbitmq.model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class JavaMailController {

    @Autowired
    private JavaMail javaMail;

    @GetMapping("/email")
    private boolean  sendEmail() throws IOException, MessagingException {
        Mail mail = new Mail();
        mail.setFrom("ashish92@gmail.com");
        mail.setMailTo("ashish52922@gmail.com");
        mail.setSubject("Email with Spring boot and thymeleaf template!");

        Map<String, Object> model = new HashMap();
        model.put("name", "Developer!");
        model.put("location", "United States");
        model.put("sign", "Java Developer");
        mail.setProps(model);

        return javaMail.sendMail();
    }
}
