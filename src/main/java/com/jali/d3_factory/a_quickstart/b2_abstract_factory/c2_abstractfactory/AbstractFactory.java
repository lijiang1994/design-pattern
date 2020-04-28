package com.jali.d3_factory.a_quickstart.b2_abstract_factory.c2_abstractfactory;

/**
 * 抽象工厂类
 * @author lijiang
 * @create 2020-04-28 13:36
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Weapon createWeapon();
    abstract Vehicle createVehicle();

    public void printName(){
        System.out.println(createFood().getName());
        System.out.println(createWeapon().getWeaponName());
        System.out.println(createVehicle().getVehicleName());
    }
}
