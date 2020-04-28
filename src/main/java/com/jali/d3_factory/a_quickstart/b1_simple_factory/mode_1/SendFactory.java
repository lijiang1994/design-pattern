package com.jali.d3_factory.a_quickstart.b1_simple_factory.mode_1;

/**
 * @author lijiang
 * @create 2020-04-27 21:34
 */
public class SendFactory {
    public Sender create(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("message".equals(type)){
            return new MessageSender();
        }else{
            System.out.println("输出类型有误！");
            return null;
        }
    }
}
