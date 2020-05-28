package com.jali.d6_proxy.b_dynamic;

import com.jali.d6_proxy.a_quickstart.KindWomen;
import com.jali.d6_proxy.a_quickstart.PanJinLian;

import java.lang.reflect.Proxy;

/**
 * @author lijiang
 * @create 2020-05-20 17:56
 */
public class Main {

    public static void main(String[] args) {
        KindWomen kindWomen = new PanJinLian();
        KindWomen proxy = (KindWomen)Proxy.newProxyInstance(KindWomen.class.getClassLoader(), new Class[]{KindWomen.class}, new DynamicProxyHandler(kindWomen));
        proxy.doHappyThing();
    }
}
