package com.rabbitmq.mail.impl;

import com.rabbitmq.mail.IJavaMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import javax.mail.internet.MimeMessage;
import javax.mail.*;

@Service
public class JavaMail implements IJavaMail {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public boolean sendMail() {

        MimeMessage message= javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper=new MimeMessageHelper(message);
        try {
            messageHelper.setTo("ashish52922@gmail.com");
            messageHelper.setSubject("Verify email");
            messageHelper.setText("Verify youir email");
            javaMailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return true;
    }
}
