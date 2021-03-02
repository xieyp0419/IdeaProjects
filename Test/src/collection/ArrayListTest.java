package collection;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @auther xieyp
 * @createTime 2020/12/9 10:35.
 * TODO:
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.addAll(arrayList);
        arrayList.remove(0);
        arrayList.set(4,0);

        for (Object o : arrayList) {
            System.out.println(o.toString());
        }

    }
}
