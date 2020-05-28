package com.jali.d7_iterator.a_quickstart;

/**
 * 用链表来实现一个容器
 * @author lijiang
 * @create 2020-05-26 19:43
 */
public class LinkedList_ implements Collection_ {

    //头
    Node head = null;
    //尾巴
    Node tail = null;

    // 目前容器中有多少个元素
    private int size = 0;

    @Override
    public void add(Object o){
        Node node = new Node(o);
        node.next = null;

        //第一次 add
        if(head == null){
            head = node;
            tail = node;
        }
        //上次的尾巴的 next
        tail.next = node;
        //每次都加到尾巴
        tail = node;
        size++;
    }

    @Override
    public int size(){
        return size;
    }

    // 节点内部类
    private class Node{
        private Object o;
        Node next;

        public Node(Object o) {
            this.o = o;
        }
    }

    @Override
    public Iterator_ iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator_{
        Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode.next!=null;
        }

        @Override
        public Object next() {
            Object o = currentNode.next.o;
            currentNode = currentNode.next;
            return o;
        }
    }
}
