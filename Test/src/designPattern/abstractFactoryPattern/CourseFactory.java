package designPattern.abstractFactoryPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:26.
 * TODO:
 */
public interface CourseFactory {
    IVideo createVideo();
    INote createNote();
}
