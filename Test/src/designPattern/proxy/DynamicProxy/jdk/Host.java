package designPattern.proxy.DynamicProxy.jdk;

/**
 * @auther xieyp
 * @createTime 2020/11/11 9:36.
 * TODO:
 */
public class Host implements Rent{

    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}
