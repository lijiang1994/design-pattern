package com.jali.d1_singleton.a_quickstart;

/**
 * 单例模式：饿汉式 - 静态代码块实现
 * 线程安全
 * @author lijiang
 * @create 2020-04-25 22:21
 */
public class Singleton_02 {

    private static volatile Singleton_02 instance;

    private Singleton_02(){}

    static {
        instance = new Singleton_02();
    }

    public static Singleton_02 getInstance(){
        return instance;
    }

    /**
     * 测试线程是否安全
     * 结论：测试通过
     * 改方式和 Singleton_01 一样
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton_02.getInstance().hashCode());
            }).start();
        }
    }
}