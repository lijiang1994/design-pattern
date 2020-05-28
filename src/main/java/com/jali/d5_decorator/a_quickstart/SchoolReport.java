package com.jali.d5_decorator.a_quickstart;

/**
 * 成绩单的抽象类
 * @author lijiang
 * @create 2020-05-15 22:49
 */
public abstract class SchoolReport {

    /**
     * 报告成绩单
     */
    public abstract void report();

    /**
     * 家长签名
     */
    public abstract void sign(String name);
}
