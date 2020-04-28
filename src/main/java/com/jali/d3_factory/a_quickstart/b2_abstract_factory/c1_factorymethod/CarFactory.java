package com.jali.d3_factory.a_quickstart.b2_abstract_factory.c1_factorymethod;

/**
 * @author lijiang
 * @create 2020-04-28 13:20
 */
public class CarFactory {

    public Moveable create(){
        return new Car();
    }
}
