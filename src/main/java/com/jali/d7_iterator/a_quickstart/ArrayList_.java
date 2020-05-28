package com.jali.d7_iterator.a_quickstart;

/**
 * 构建一个容器，可以添加对象
 * 相比数组，这个容器可以不用考虑边界问题，可以动态扩展
 *
 * @author lijiang
 * @create 2020-05-26 19:15
 */
public class ArrayList_<E> implements Collection_<E> {

    // 初始化 10
    E[] objects = (E[])new Object[10];
    // objects 中下一个空的位置在哪里，或者说，目前容器中有多少个元素
    private int index = 0;

    @Override
    public void add(E o){
        if(index == objects.length){
            System.out.println("扩展数组长度");
            // 扩展数组长度
            E[] newObjects = (E[])new Object[objects.length*2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects = newObjects;
        }
        objects[index++] = o;
        System.out.println(index);
    }

    @Override
    public int size(){
        return index;
    }

    @Override
    public Iterator_<E> iterator() {
        return new ArrayListIterator();
    }

    // 内部类
    private class ArrayListIterator<E> implements Iterator_<E>{

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return (currentIndex!=index);
        }

        @Override
        public E next() {
            E o = (E)objects[currentIndex];
            currentIndex++;
            return o;
        }
    }
}
