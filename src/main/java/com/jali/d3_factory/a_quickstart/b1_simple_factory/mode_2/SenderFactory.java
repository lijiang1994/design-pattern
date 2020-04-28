package com.jali.d3_factory.a_quickstart.b1_simple_factory.mode_2;

/**
 * @author lijiang
 * @create 2020-04-27 21:43
 */
public class SenderFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceMessage(){
        return new MessageSender();
    }
}
