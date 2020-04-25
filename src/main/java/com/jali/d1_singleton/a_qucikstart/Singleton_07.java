package com.jali.d1_singleton.a_qucikstart;

/**
 * 单例模式：静态内部类
 * @author lijiang
 * @create 2020-04-25 23:16
 */
public class Singleton_07 {

    private Singleton_07(){
        System.out.println("初始化");
    }

    private static class SingletonInstence {
        private static Singleton_07 instance = new Singleton_07();
    }

    public static Singleton_07 getInstance(){
        System.out.println("开始调用");
        return SingletonInstence.instance;
    }

    /**
     * 线程是否安全
     * 结论：线程安全
     * 开始调用后才会初始化，满足懒加载的特点，且性能好，完美的代码之一
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.out.println("程序运行");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton_07.getInstance().hashCode());
            }).start();
        }
    }

}
