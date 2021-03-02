package collection;

import java.util.LinkedList;
import java.util.List;

/**
 * @auther xieyp
 * @createTime 2020/12/9 13:41.
 * TODO:
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println(list.size());//初始容量

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        list.addFirst(0);
//        list.addLast(6);
        System.out.println(list.size());

        System.out.println("第一个元素：" + list.getFirst());
        System.out.println("最后一个元素：" + list.getLast());

        //遍历链表元素
        for (Integer integer : list) {
            System.out.println(integer);
        }

        List<Integer> sonList = list.subList(0,2);
        for (Integer son : sonList) {
            System.out.println(son);
        }

//        list.remove(4);
//        list.removeFirst();
//        list.removeLast();

    }
}
