package com.jali.d1_singleton.a_quickstart;

/**
 * 单例模式：枚举方式
 * @author lijiang
 * @create 2020-04-25 23:26
 */
public enum Singleton_08 {
    INSTANCE;

    public static Singleton_08 getInstance(){
        return INSTANCE;
    }

    /**
     * 线程是否安全
     * 结论：线程安全，反序列化
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Singleton_08.getInstance().hashCode());
            }).start();
        }
    }
}
