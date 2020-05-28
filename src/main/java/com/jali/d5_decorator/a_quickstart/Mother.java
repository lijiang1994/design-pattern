package com.jali.d5_decorator.a_quickstart;

/**
 * 老妈看成绩单
 * @author lijiang
 * @create 2020-05-15 22:55
 */
public class Mother {

    public static void main(String[] args) {
//        SchoolReport schoolReport = new SonReport();
//        schoolReport.report();
//        schoolReport.sign("滚");

//        SchoolReport schoolReport = new SugarSonReport();
//        schoolReport.report();
//        schoolReport.sign("老妈");

        // 原始成绩单
        SchoolReport sr = new SonReport();

        sr = new HighScoreDecorator(sr);

        sr = new SortDecorator(sr);

        sr.report();

        sr.sign("老妈");

    }
}
