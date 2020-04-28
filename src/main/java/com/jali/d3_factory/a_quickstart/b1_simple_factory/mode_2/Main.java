package com.jali.d3_factory.a_quickstart.b1_simple_factory.mode_2;

/**
 * 多方法简单工厂
 * 对mode_1中的普通工厂方法进行改进，在普通工厂方法中，如果传递的字符串出错，则不能正确地创建对象。
 * 多个工厂方法模式是提供多个工厂方法，分别创建对象
 * @author lijiang
 * @create 2020-04-27 21:41
 */
public class Main {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        senderFactory.produceMail().send();
        senderFactory.produceMessage().send();
    }
}
