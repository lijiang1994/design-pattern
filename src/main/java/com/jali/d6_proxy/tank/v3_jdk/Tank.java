package com.jali.d6_proxy.tank.v3_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 如果有其他的方法也需要代理
 * 使用JDK的动态代理，分离代理行为与被代理对象
 * @author lijiang
 * @create 2020-05-23 16:44
 */
public class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("Tank is moving...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        // reflection 通过二进制字节码分析类的属性和方法
        Movable m = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new LogHandler(tank));
        m.move();
    }
}
interface Movable{
    void move();
}
class LogHandler implements InvocationHandler{
    Tank tank;

    public LogHandler(Tank tank) {
        this.tank = tank;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method " + method.getName() + " before");
        Object o = method.invoke(tank, args);
        System.out.println("method " + method.getName() + " after");
        return o;
    }
}