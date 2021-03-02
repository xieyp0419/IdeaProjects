package designPattern.simpleFactoryPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/25 21:57.
 * TODO:
 */
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse();
        javaCourse.record();
        ICourse pythonCourse = new PythonCourse();
        pythonCourse.record();
    }
}
