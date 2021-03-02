package designPattern.abstractFactoryPattern;

/**
 * @auther xieyp
 * @createTime 2020/8/26 10:28.
 * TODO:
 */
public class JavaNote implements INote {
    @Override
    public void edit() {
        System.out.println("编写JAVA笔记");
    }
}
