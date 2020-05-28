package com.jali.d5_decorator.a_quickstart;

/**
 * @author lijiang
 * @create 2020-05-15 23:29
 */
public class SortDecorator extends Decorator{

    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    /**
     * 学校排名情况
     */
    private void reportSort(){
        System.out.println("我的排名是第35名...");
    }

    /**
     * 装饰
     */
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
