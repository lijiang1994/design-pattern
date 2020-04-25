package com.jali.d2_strategy.a_quickstart.model;

/**
 * @author lijiang
 * @create 2020-04-25 23:44
 */
public class Dog {

    int food;

    public Dog(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
