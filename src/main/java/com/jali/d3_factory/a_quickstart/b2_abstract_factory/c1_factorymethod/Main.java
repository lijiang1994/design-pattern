package com.jali.d3_factory.a_quickstart.b2_abstract_factory.c1_factorymethod;

/**
 * @author lijiang
 * @create 2020-04-28 13:21
 */
public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.create().go();

        PlaneFactory planeFactory = new PlaneFactory();
        planeFactory.create().go();
        // 后续生成其他产品，只需要添加对应的产品类和产品工厂类即可，方便扩展单个的产品
    }
}
