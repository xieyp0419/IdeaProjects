package juc;

/**
 * @auther xieyp
 * @createTime 2021/2/28 21:43.
 * TODO:
 */
public class WaitNotifyTest {

    public static final Object obj = new Object();

    static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (obj) {
                System.out.println("线程:" + Thread.currentThread().getName() + "在同步代码块中，开始执行");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("线程:" + Thread.currentThread().getName() + "获取到锁");
            }
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (obj) {

                obj.notify();
                System.out.println("线程:" + Thread.currentThread().getName() + "调用了notify");
            }
        }
    }

    public static void main(String[] args) {

        new Thread1().start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread2().start();
    }
}
