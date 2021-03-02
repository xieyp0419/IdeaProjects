package designPattern.abstractFactoryPattern;



/**
 * @auther xieyp
 * @createTime 2020/8/26 10:33.
 * TODO:
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory javaFactory = new JavaCourseFactory();
        INote javaNote = javaFactory.createNote();
        javaNote.edit();
        IVideo javaVideo = javaFactory.createVideo();
        javaVideo.record();

        CourseFactory pythonFactory = new pythonCourseFactory();
        INote pythonNote = pythonFactory.createNote();
        pythonNote.edit();
        IVideo pythonVideo = pythonFactory.createVideo();
        pythonVideo.record();
    }
}
