package designPattern.singletonPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:41.
 * TODO:饿汉式单例
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    /**
     * 静态代码块加载

    private static final HungrySingleton hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton();
    }
     */
    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
