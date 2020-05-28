package com.jali.d5_decorator.a_quickstart;

/**
 * 美化成绩单
 * @author lijiang
 * @create 2020-05-15 22:59
 */
public class SugarSonReport extends SonReport{

    /**
     * 首先定义美化的方法，先说一下学校最高成绩
     */
    private void reportHighScore(){
        System.out.println("这次学校语文最高是75，数学是74，英语是80");
    }

    /**
     * 在家长看完成绩单后，再汇报学校的排名情况
     */
    private void reportSort(){
        System.out.println("我的排名是第35名...");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
