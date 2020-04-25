package com.jali.d2_strategy.a_quickstart;

import com.jali.d2_strategy.a_quickstart.comparator.MyComparator;

/**
 * 对 Cat、Dog 等实体类根据属性排序
 * @author lijiang
 * @create 2020-04-25 23:48
 */
public class Sorter<T> {

    public void sort(T[] arrs, MyComparator<T> comparator){
        if(arrs.length <= 1){
            return;
        }
        for (int i = 0; i < arrs.length-1; i++) {
            for (int j=i+1; j < arrs.length; j++) {
                if(comparator.compare(arrs[i],arrs[j]) == 1){
                    T temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
    }

}
