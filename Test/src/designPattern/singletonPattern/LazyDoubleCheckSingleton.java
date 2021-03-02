package designPattern.singletonPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/26 13:25.
 * TODO:双重检查锁懒汉式单例模式
 * 1.为啥要用volatile修饰？
 * * 因为new singleton()代码是分三个步骤来进行的：
 * * 首先给实例对象分配内存空间，
 * * 然后初始化instance，
 * * 最后instance指向分配的空间
 * *
 * * 但是由于 JVM 具有指令重排的特性，执行顺序有可能变成 1->3->2。
 * * 指令重排在单线程环境下不会出现问题，但是在多线程环境下会导致一个线程获得还没有初始化的实例。
 * * 例如，线程 T1 执行了 1 和 3，此时 T2 调用 getInstance() 后发现 Instance 不为空，
 * * 因此返回 Instance，但此时 Instance 还未被初始化。
 * * 使用了volatile关键字就能防止指令重排序
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {

        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
