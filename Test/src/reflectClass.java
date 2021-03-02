import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @auther xieyp
 * @createTime 2020/9/21 21:13.
 * TODO:
 */
public class reflectClass {

    public static void main(String[] args) {
        //获取对象的三种方式
//    Main main = new Main();
//    Class clazz = main.getClass();
//    Class clazz = Main.class;
        //最常用的方式
        try {
            Class clazz = Class.forName("Main");
            //获取Main类的所有方法
            Method[] methods = clazz.getDeclaredMethods();
            //快捷键iter fori
            System.out.println("类的所有方法:");
            for (Method m : methods) {
                System.out.println(m.toString());
            }
            //获取Main类所有属性
            Field[] fields = clazz.getDeclaredFields();
            System.out.println("类的所有属性:");
            for (Field f : fields) {
                System.out.println(f.toString());
            }
            //获取Main类构造方法
            Constructor[] constructors = clazz.getDeclaredConstructors();
            System.out.println("类的所有构造方法:");
            for (Constructor c : constructors) {
                System.out.println(c.toString());
            }
            //创建对象的两种方式，1.根据class对象的newInstance()来创建 2.根据constructor对象的newInstance()来创建
            Main main = (Main) clazz.newInstance();
            Constructor constructor = clazz.getDeclaredConstructor(String.class);
            Main main1 = (Main) constructor.newInstance("Main");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
