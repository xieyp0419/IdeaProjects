package designPattern.singletonPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:57.
 * TODO:
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }
}
