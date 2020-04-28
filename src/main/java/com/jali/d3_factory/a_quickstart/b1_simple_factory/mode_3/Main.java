package com.jali.d3_factory.a_quickstart.b1_simple_factory.mode_3;

/**
 * 多个静态方法
 * 将多个工厂方法里的方法置为静态的，不需要创建实例，直接调用
 * @author lijiang
 * @create 2020-04-27 21:45
 */
public class Main {
    public static void main(String[] args) {
        SenderFactory.produceMail().send();
        SenderFactory.produceMessage().send();
    }
}
