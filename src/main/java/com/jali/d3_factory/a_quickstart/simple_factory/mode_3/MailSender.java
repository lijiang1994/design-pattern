package com.jali.d3_factory.a_quickstart.simple_factory.mode_3;

/**
 * @author lijiang
 * @create 2020-04-27 21:33
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送邮件功能");
    }
}
