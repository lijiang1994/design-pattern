package com.jali.d7_iterator.a_quickstart;

/**
 * 加上泛型
 * E    element
 * T    Type
 * K    key
 * V    value
 * @author lijiang
 * @create 2020-05-26 20:09
 */
public interface Iterator_<E> {
    boolean hasNext();

    E next();
}
