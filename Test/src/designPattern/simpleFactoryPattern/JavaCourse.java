package designPattern.simpleFactoryPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/25 21:56.
 * TODO:
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制JAVA课程");
    }
}
