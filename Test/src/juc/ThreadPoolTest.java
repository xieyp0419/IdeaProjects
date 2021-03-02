package juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther xieyp
 * @createTime 2020/8/30 20:33.
 * TODO:JDK提供的线程池
 */
public class ThreadPoolTest implements Runnable{
    public static void main(String[] args) {
        //固定线程数量
        ExecutorService service = Executors.newFixedThreadPool(3);
        //ExecutorService service1 = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            service.execute(new ThreadPoolTest());
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
