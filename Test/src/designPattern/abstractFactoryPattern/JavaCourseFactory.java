package designPattern.abstractFactoryPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:29.
 * TODO:
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }
}
