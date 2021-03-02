/**
 * @auther xieyp
 * @createTime 2020/8/31 19:40.
 * TODO:String类常用方法
 */
public class StringClass {

    public static void main(String[] args) {
        String s = new String("123abc");
        System.out.println(s.charAt(0));//返回指定下标位置的字符
        System.out.println(s.length());//返回字符串长度
        System.out.println(s.contains("123"));//判断是否包含指定字符串序列
        System.out.println(s.startsWith("1"));//判断字符串是否以指定前缀开始
        System.out.println(s.endsWith("6"));//判断字符串是否以指定后缀结束
        System.out.println(s.indexOf("1"));//判断字符在字符串中第一次出现的位置
        System.out.println(s.lastIndexOf("1"));//判断字符在字符串中最后一次出现的位置
        System.out.println(s.isEmpty());//判断字符串长度是否为0，是则返回true
        System.out.println(s.replace("1", "0"));//字符串替换
        String[] strings = s.split(",");//字符串拆分，返回字符串数组
        System.out.println(strings[0]);
        System.out.println(s.substring(0, 2));//字符串截取，左闭右开
        System.out.println(s.toLowerCase());//转换字符串中英文字母为小写字母
        System.out.println(s.toUpperCase());//转换字符串中英文字母为大写
        System.out.println(s.trim());//清楚字符串前后的空白字符
        char[] chars = s.toCharArray();//把字符串转换为字符数组
        System.out.println(chars);
        System.out.println(String.valueOf(123456));//将指定类型转换成字符串类型
    }
}