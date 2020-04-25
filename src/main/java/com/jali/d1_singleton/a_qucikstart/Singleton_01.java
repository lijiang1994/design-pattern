package com.jali.d1_singleton.a_qucikstart;

/**
 * 单例模式：饿汉式 - 静态变量的方式实现
 * 线程安全
 * @author lijiang
 * @create 2020-04-25 22:10
 */
public class Singleton_01 {

    // 1.定义一个私有静态本类的变量
    private static volatile Singleton_01 instance = new Singleton_01();

    // 2.所有单例关键的一步：私有化构造函数，在其他地方无法通过 new 的方式创建该类的实例
    private Singleton_01() {
    }

    // 3.创建一个对外暴露的静态方法，开发人员可以通过该方法得到该实例对象
    public static Singleton_01 getInstance(){
        return instance;
    }

    /**
     * 测试线程是否安全
     * 结论：测试通过
     * 这种单例模式也是正常开发中比较常用的，简单，不花里胡哨
     * 不足：没有懒加载，类加载的时候就创建了该实例，如果一直没用到会造成内存浪费，
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton_01.getInstance().hashCode());
            }).start();
        }
    }
}
