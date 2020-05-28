package com.jali.d5_decorator.a_quickstart;

/**
 * 装饰类，把成绩单装饰一下
 * @author lijiang
 * @create 2020-05-15 23:12
 */
public class Decorator extends SchoolReport{

    /**
     * 首先我要知道是哪个成绩单
     */
    private SchoolReport schoolReport;

    /**
     * 构造函数，成绩单传递进来
     * @param schoolReport
     */
    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    /**
     * 成绩单还是要被看到的
     */
    @Override
    public void report(){
        this.schoolReport.report();
    }

    /**
     * 看完签名
     * @param name
     */
    @Override
    public void sign(String name){
        this.schoolReport.sign(name);
    }
}
