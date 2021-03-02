package designPattern.factoryMethodPattern;

import designPattern.simpleFactoryPattern.ICourse;
import designPattern.simpleFactoryPattern.JavaCourse;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:16.
 * TODO:
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
