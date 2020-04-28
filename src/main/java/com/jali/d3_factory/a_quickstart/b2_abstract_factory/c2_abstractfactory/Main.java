package com.jali.d3_factory.a_quickstart.b2_abstract_factory.c2_abstractfactory;

/**
 * @author lijiang
 * @create 2020-04-28 13:43
 */
public class Main {

    public static void main(String[] args) {
        // 现代工厂生产产品
        AbstractFactory mordenFactory = new MordenFactory();
        mordenFactory.printName();
        System.out.println("");

        // 魔法工厂生产产品
        AbstractFactory magicFactory = new MagicFactory();
        magicFactory.printName();
        // 后续可以很方便扩展古代工厂、未来工厂、外星工厂等、缺点：无法扩展单个的产品
        // 那怎么即可以扩展系列，又可以扩展单个呢？
        // 详见Spring IoC
    }
}
