package com.jali.d1_singleton.a_qucikstart;

/**
 * 单例模式：懒汉式加 synchronized 锁
 * @author lijiang
 * @create 2020-04-25 22:39
 */
public class Singleton_04 {

    private static Singleton_04 instance;

    private Singleton_04(){}

    public static synchronized Singleton_04 getInstance(){
        if(instance == null){
            // 通过 sleep 提高出现问题的几率
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new Singleton_04();
        }
        return instance;
    }

    /**
     * 线程是否安全
     * 结论：线程安全
     * 优缺点：使用synchronized锁住了整个方法，其他线程要调用的时候必须等待上一个线程释放锁，效率低，不建议使用
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton_04.getInstance().hashCode());
            }).start();
        }
    }
}
