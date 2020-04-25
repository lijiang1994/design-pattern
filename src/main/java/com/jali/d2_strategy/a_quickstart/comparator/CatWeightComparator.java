package com.jali.d2_strategy.a_quickstart.comparator;

import com.jali.d2_strategy.a_quickstart.model.Cat;

/**
 * Cat 的策略2
 * @author lijiang
 * @create 2020-04-26 0:00
 */
public class CatWeightComparator implements MyComparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.getWeight() < o2.getWeight()){
            return -1;
        }else if(o1.getWeight() > o2.getWeight()){
            return 1;
        }else{
            return 0;
        }
    }
}
