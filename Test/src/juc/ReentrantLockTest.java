package juc;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther xieyp
 * @createTime 2020/8/27 14:06.
 * TODO:重入锁
 */
public class ReentrantLockTest {

    private static int count = 0;
    private static Lock lock = new ReentrantLock();

    public static void incr() {
        lock.lock();
        try {
            Thread.sleep(1);
            count++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> ReentrantLockTest.incr()).start();
        Thread.sleep(4000);
        System.out.println("result" + count);
    }

}
