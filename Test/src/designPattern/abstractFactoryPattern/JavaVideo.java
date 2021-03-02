package designPattern.abstractFactoryPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:28.
 * TODO:
 */
public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制JAVA视频");
    }
}
