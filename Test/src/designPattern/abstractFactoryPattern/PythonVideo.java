package designPattern.abstractFactoryPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:31.
 * TODO:
 */
public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制python视频");
    }
}
