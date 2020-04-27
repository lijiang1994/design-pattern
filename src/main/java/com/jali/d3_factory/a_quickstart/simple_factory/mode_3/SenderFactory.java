package com.jali.d3_factory.a_quickstart.simple_factory.mode_3;


/**
 * @author lijiang
 * @create 2020-04-27 21:43
 */
public class SenderFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceMessage(){
        return new MessageSender();
    }
}
