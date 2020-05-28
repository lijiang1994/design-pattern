package com.jali.d6_proxy.a_quickstart;

/**
 * @author lijiang
 * @create 2020-05-20 17:23
 */
public class XiMenQing {
    public static void main(String[] args) {
//        WangPo wangPo = new WangPo();

        JiaShi jiaShi = new JiaShi();
        WangPo wangPo = new WangPo(jiaShi);

        wangPo.makeEyesWithMan();
        wangPo.doHappyThing();


    }
}
