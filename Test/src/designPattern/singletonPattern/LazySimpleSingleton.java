package designPattern.singletonPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:49.
 * TODO:懒汉式单例 多线程情况下会存在创建多个实例的问题
 */
public class LazySimpleSingleton {
    private static LazySimpleSingleton instance = null;

    private LazySimpleSingleton(){

    }

    public static LazySimpleSingleton getInstance(){
        if (instance == null) {
            instance = new LazySimpleSingleton();
        }
        return instance;
    }
}
