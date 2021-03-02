package designPattern.factoryMethodPattern;

import designPattern.simpleFactoryPattern.ICourse;
import designPattern.simpleFactoryPattern.PythonCourse;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:17.
 * TODO:
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
