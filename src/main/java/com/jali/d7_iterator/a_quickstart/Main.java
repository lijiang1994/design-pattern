package com.jali.d7_iterator.a_quickstart;

/**
 * @author lijiang
 * @create 2020-05-26 19:15
 */
public class Main {

    public static void main(String[] args) {
        Collection_ list = new LinkedList_();
//        Collection_ list = new ArrayList_<String>();
        for (int i = 0; i < 15; i++) {
            list.add("obj" + i);
        }
        System.out.println(list.size());

        Iterator_<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
