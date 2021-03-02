package designPattern.proxy.DynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auther xieyp
 * @createTime 2020/11/11 9:39.
 * TODO:
 */
public class RentInvocationHandler implements InvocationHandler {

    private Object object;

    public RentInvocationHandler(Object object) {
        this.object = object;
    }

    /**
     *
     * @param proxy；代理类
     * @param method：代理类调用的方法对象
     * @param args：参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("使用动态代理做一些增强操作");
        //第一个参数是被代理对象，第二个参数是方法参数
        Object result = method.invoke(object,args);
        return result;
    }
}
