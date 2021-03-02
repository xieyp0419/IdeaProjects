package juc;


/**
 * @auther xieyp
 * @createTime 2021/2/28 21:00.
 * TODO:
 */
public class TestUtil extends Thread {

    public static void main(String[] args) throws Exception {

        TestUtil thread1 = new TestUtil();
        TestUtil thread2 = new TestUtil();
        TestUtil thread3 = new TestUtil();
        thread1.start();
//        thread1.join();
        thread2.start();
//        thread2.join();
        thread3.start();
//        Thread.interrupted();
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "start ...");
//        Thread.yield();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(Thread.currentThread().getName() + "over ...");
    }
}
