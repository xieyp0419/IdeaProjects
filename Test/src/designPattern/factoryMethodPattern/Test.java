package designPattern.factoryMethodPattern;

import designPattern.simpleFactoryPattern.ICourse;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:18.
 * TODO:
 */
public class Test {
    public static void main(String[] args) {
        ICourseFactory javaFactory = new JavaCourseFactory();
        ICourse javaCourse = javaFactory.create();
        javaCourse.record();
        ICourseFactory pythonFactory = new PythonCourseFactory();
        ICourse pythonCourse = pythonFactory.create();
        pythonCourse.record();
    }
}
