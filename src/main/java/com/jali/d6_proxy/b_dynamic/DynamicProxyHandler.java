package com.jali.d6_proxy.b_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lijiang
 * @create 2020-05-20 17:53
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("事前心急如焚");
        Object result = method.invoke(object, args);
        System.out.println("事后抽根烟，赛过活神仙");
        return result;
    }
}
