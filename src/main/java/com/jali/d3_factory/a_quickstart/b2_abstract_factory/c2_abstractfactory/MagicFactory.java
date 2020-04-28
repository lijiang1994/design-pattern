package com.jali.d3_factory.a_quickstart.b2_abstract_factory.c2_abstractfactory;

/**
 * @author lijiang
 * @create 2020-04-28 13:42
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Mushroom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }
}
