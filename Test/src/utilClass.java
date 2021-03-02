import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @auther xieyp
 * @createTime 2020/8/31 19:40.
 * TODO:util常用类和方法
 */
public class utilClass {

    public static void main(String[] args) {
        Date date = new Date();//创建日期对象
        System.out.println(date.after(new Date("2020/09/01")));//判断当前日期是否在指定日期之后
        System.out.println(date.before(new Date("2020/09/01")));//判断当前日期是否在指定日期之前
        System.out.println(date.getTime());//获得当前时间戳
        date.setTime(1598874496864L);//设置为指定时间戳

        Calendar calendar = new GregorianCalendar();

    }

}
