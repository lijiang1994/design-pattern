package com.jali.d1_singleton.a_quickstart;

/**
 * 单例模式：懒汉式
 * @author lijiang
 * @create 2020-04-25 22:28
 */
public class Singleton_03 {

    private static Singleton_03 instance;

    private Singleton_03(){}

    /**
     * 等用到时候才去进行初始化，很懒
     * @return
     */
    public static Singleton_03 getInstance(){
        if(instance == null){
            // 通过 sleep 提高出现问题的几率
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton_03();
        }
        return instance;
    }

    /**
     * 测试线程是否安全
     * 结论：多线程并发不安全
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton_03.getInstance().hashCode());
            }).start();
        }
    }
}
