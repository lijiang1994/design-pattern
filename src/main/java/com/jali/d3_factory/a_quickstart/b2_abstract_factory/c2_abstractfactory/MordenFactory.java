package com.jali.d3_factory.a_quickstart.b2_abstract_factory.c2_abstractfactory;

/**
 * @author lijiang
 * @create 2020-04-28 13:41
 */
public class MordenFactory extends AbstractFactory{

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }

    @Override
    Vehicle createVehicle() {
        return new Tank();
    }
}
