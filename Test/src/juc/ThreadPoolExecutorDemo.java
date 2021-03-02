package juc;


import juc.MyRunnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo {

    private static final int CORE_PORE_SIZE = 5;//核心线程数
    private static final int MAX_POOL_SIZE = 10;//最大线程数
    private static final int QUEUE_CAPACITY = 100;//任务队列容量100
    private static final long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {
        //使⽤阿⾥巴巴推荐的创建线程池的⽅式
        //通过ThreadPoolExecutor构造函数⾃定义参数创建
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_PORE_SIZE,//核心线程数
                MAX_POOL_SIZE,//最大线程数
                KEEP_ALIVE_TIME,//等待时间
                TimeUnit.SECONDS,//时间单位
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),//任务队列ArrayBlockingQueue，容量100
                new ThreadPoolExecutor.CallerRunsPolicy());//饱和策略CallerRunsPolicy
        for (int i = 0 ; i < 10;i++) {
            //创建WorkerThread对象（WorkerThread类实现了Runnable 接⼝）
            Runnable worker = new MyRunnable("" + i);
            //执⾏
            executor.execute(worker);
        }
        //终⽌线程池
        executor.shutdown();
        while(!executor.isTerminated()){
        }
        System.out.println("Finished all Threads");
    }
}
