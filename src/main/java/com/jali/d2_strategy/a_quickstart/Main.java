package com.jali.d2_strategy.a_quickstart;

import com.jali.d2_strategy.a_quickstart.comparator.CatHeightComparator;
import com.jali.d2_strategy.a_quickstart.comparator.CatWeightComparator;
import com.jali.d2_strategy.a_quickstart.comparator.DogFoodComparator;
import com.jali.d2_strategy.a_quickstart.model.Cat;
import com.jali.d2_strategy.a_quickstart.model.Dog;

import java.util.Arrays;

/**
 * 策略模式
 * 符合开闭原则：对修改关闭，对扩展开发
 * @author lijiang
 * @create 2020-04-25 23:40
 */
public class Main {

    public static void main(String[] args) {
        // 对 Cat 这个的 height 属性进行排序
        System.out.println("对Cat的 height 属性进行升序排序：");
        Cat[] cats = {new Cat(5,3),new Cat(1,7),new Cat(3,4)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(cats, new CatHeightComparator());
        System.out.println(Arrays.toString(cats));

        // 未来客户需要对 Cat 的 weight 属性进行排序，创建一个对应的 CatWeightComparator 策略
        System.out.println("\n对Cat的 weight 属性进行升序排序：");
        sorter.sort(cats, new CatWeightComparator());
        System.out.println(Arrays.toString(cats));

        // 未来客户需要对 Dog 的 food 属性进行排序，创建一个对应的 DogFoodComparator 策略
        System.out.println("\n对Dog的 food 属性进行升序排序：");
        Dog[] dogs = {new Dog(100),new Dog(60),new Dog(88)};
        Sorter<Dog> dogSorter = new Sorter<>();
        dogSorter.sort(dogs, new DogFoodComparator());
        System.out.println(Arrays.toString(dogs));
    }
}