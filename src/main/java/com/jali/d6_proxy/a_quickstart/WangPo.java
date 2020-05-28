package com.jali.d6_proxy.a_quickstart;

/**
 * 王婆代理
 * @author lijiang
 * @create 2020-05-20 17:20
 */
public class WangPo implements KindWomen{
    private KindWomen kindWomen;

    public WangPo() {
        this.kindWomen = new PanJinLian();
    }

    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void doHappyThing() {
        this.kindWomen.doHappyThing();
    }
}






















