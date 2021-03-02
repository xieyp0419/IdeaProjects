package designPattern.singletonPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:55.
 * TODO:
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
