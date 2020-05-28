package com.jali.d6_proxy.tank.v1;

/**
 * 问题1：我想记录坦克的移动时间
 *      修改代码，记录时间
 * 问题2：如果无法修改方法源码呢？
 *      使用子类继承，重写方法里记录时间
 * @author lijiang
 * @create 2020-05-23 15:17
 */
public class Tank implements Movalbe{

    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() throws InterruptedException {
        System.out.println("Tank is moving...");
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException {
        new SubTank().move();
    }
}
interface Movalbe{
    void move() throws InterruptedException;
}
class SubTank extends Tank{

    @Override
    public void move() throws InterruptedException {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}