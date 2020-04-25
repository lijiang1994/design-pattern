package com.jali.d2_strategy.a_quickstart.comparator;

/**
 * 策略接口
 * @author lijiang
 * @create 2020-04-25 23:43
 */
public interface MyComparator<T> {

    int compare(T o1, T o2);
}
