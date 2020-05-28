package com.jali.d5_decorator.a_quickstart;

/**
 * @author lijiang
 * @create 2020-05-15 23:16
 */
public class HighScoreDecorator extends Decorator{


    /**
     * 构造函数，成绩单传递进来
     *
     * @param schoolReport
     */
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    /**
     * 汇报最高成绩
     */
    private void reportHighScore(){
        System.out.println("这次学校语文最高是75，数学是74，英语是80");
    }

    /**
     * 装饰
     */
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
