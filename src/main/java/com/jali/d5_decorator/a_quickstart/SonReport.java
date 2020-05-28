package com.jali.d5_decorator.a_quickstart;

/**
 * @author lijiang
 * @create 2020-05-15 22:52
 */
public class SonReport extends SchoolReport{
    @Override
    public void report() {
        System.out.println("尊敬的小明家长：");
        System.out.println("您的孩子今年的期末成绩是：");
        System.out.println("语文：60   数学：70   英语：62");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名：" + name);
    }
}
