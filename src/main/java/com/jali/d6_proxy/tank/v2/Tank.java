package com.jali.d6_proxy.tank.v2;

/**
 * 问题1：我想记录坦克的移动时间
 *      修改代码，记录时间
 * 问题2：如果无法修改方法源码呢？
 *      使用子类继承，重写方法里记录时间
 *
 * 使用代理 proxy
 * 问题3：如果实现代理的各种组合？继承？Decorator？
 * @author lijiang
 * @create 2020-05-23 15:17
 */
public class Tank implements Movable {

    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() throws InterruptedException {
        System.out.println("Tank is moving...");
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException {
        Tank tank = new Tank();
        TankTimeProxy tankTimeProxy = new TankTimeProxy(tank);
        TankLogProxy tankLogProxy = new TankLogProxy(tankTimeProxy);
        tankLogProxy.move();
    }
}

interface Movable{
    void move() throws InterruptedException;
}

class TankTimeProxy implements Movable{
    Movable m;

    public TankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() throws InterruptedException {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
class TankLogProxy implements Movable{
    Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() throws InterruptedException {
        System.out.println("logging move before");
        m.move();
        System.out.println("logging move after");
    }
}