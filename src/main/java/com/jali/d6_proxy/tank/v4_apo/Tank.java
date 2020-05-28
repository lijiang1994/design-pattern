package com.jali.d6_proxy.tank.v4_apo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 横切代码与业务逻辑代码分离 AOP
 * @author lijiang
 * @create 2020-05-23 16:44
 */
public class Tank implements Movable {
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
    Movable m;

    public LogHandler(Movable m) {
        this.m = m;
    }

    public void before(Method method){
        System.out.println("method " + method.getName() + " before");
    }

    public void after(Method method){
        System.out.println("method " + method.getName() + " after");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method);
        Object o = method.invoke(m, args);
        after(method);
        return o;
    }
}