package designPattern.proxy.DynamicProxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @auther xieyp
 * @createTime 2020/11/11 9:45.
 * TODO:
 */
public class ProxyMain {
    public static void main(String[] args) {
        Host host = new Host();
        RentInvocationHandler rentInvocationHandler = new RentInvocationHandler(host);
        //利用Proxy.newProxyInstance()生成代理对象
        Rent r = (Rent) Proxy.newProxyInstance(host.getClass().getClassLoader(),
                host.getClass().getInterfaces(),rentInvocationHandler);
        r.rent();
    }
}
