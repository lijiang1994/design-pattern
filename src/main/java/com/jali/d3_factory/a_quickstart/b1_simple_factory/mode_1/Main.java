package com.jali.d3_factory.a_quickstart.b1_simple_factory.mode_1;

/**
 * 简单工厂方法不属于23种设计模式
 * 普通简单工厂、多方法简单工厂、静态方法简单工厂
 * @author lijiang
 * @create 2020-04-27 21:29
 */
public class Main {

    /**
     * 普通简单工厂
     * 发送邮件和短信
     */
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        sendFactory.create("mail").send();
        sendFactory.create("message").send();
    }
}
