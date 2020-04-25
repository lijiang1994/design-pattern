package com.jali.d2_strategy.a_quickstart.comparator;

import com.jali.d2_strategy.a_quickstart.model.Dog;

/**
 * Dog 的策略
 * @author lijiang
 * @create 2020-04-26 0:19
 */
public class DogFoodComparator implements MyComparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.getFood() < o2.getFood()){
            return -1;
        }else if(o1.getFood() > o2.getFood()){
            return 1;
        }else{
            return 0;
        }
    }
}
