package designPattern.abstractFactoryPattern;

import designPattern.factoryMethodPattern.ICourseFactory;
import designPattern.simpleFactoryPattern.ICourse;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:32.
 * TODO:
 */
public class pythonCourseFactory implements CourseFactory {
    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }

    @Override
    public INote createNote() {
        return new pythonNote();
    }
}
