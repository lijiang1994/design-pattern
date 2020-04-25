package com.jali.d1_singleton.a_qucikstart;

/**
 * 单例模式：DCL（double checked locking）双重检查锁定
 * @author lijiang
 * @create 2020-04-25 23:08
 */
public class Singleton_06 {

    private static Singleton_06 instance;

    private Singleton_06(){}

    public static Singleton_06 getInstance(){
        if(instance == null){
            // 通过 sleep 提高出现问题的几率
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Singleton_06.class){
                // 通过两次检查 instance 是否等于 null，叫做双重检查锁定
                if(instance == null){
                    instance = new Singleton_06();
                }
            }
        }
        return instance;
    }

    /**
     * 线程是否安全
     * 结论：线程安全
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton_06.getInstance().hashCode());
            }).start();
        }
    }
}