package com.jali.d1_singleton.a_qucikstart;

/**
 * 单例模式：同步代码块
 * @author lijiang
 * @create 2020-04-25 22:56
 */
public class Singleton_05 {

    private static Singleton_05 instance;

    private Singleton_05(){}

    public static Singleton_05 getInstance(){
        if(instance == null){
            // 通过 sleep 提高出现问题的几率
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Singleton_05.class){
                instance = new Singleton_05();
            }
        }
        return instance;
    }

    /**
     * 线程是否安全
     * 结论：多线程并发不安全
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton_05.getInstance().hashCode());
            }).start();
        }
    }
}
