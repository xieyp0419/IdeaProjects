package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @auther xieyp
 * @createTime 2020/12/1 17:40.
 * TODO:
 */
public class HashSetTest {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        System.out.println("初始容量："+ hashSet.size());

        hashSet.add("my");
        hashSet.add("name");
        hashSet.add("is");
        hashSet.add("xieyuping");
        hashSet.add(",");
        hashSet.add("Hello");
        hashSet.add("world");
        hashSet.add("!");
        System.out.println("HashSet容量大小：" + hashSet.size());

        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            String string = iterator.next();
            System.out.println(string);
        }
        for(String str:hashSet){
            if("xieyuping".equalsIgnoreCase(str)){
                System.out.println("你就是我想要的元素" + str);
            }
        }

        hashSet.remove("xieyuping");
        System.out.println("hashSet容量：" + hashSet.size());
        hashSet.clear();
        System.out.println("hashSet容量：" + hashSet.size());

        boolean isEmpty = hashSet.isEmpty();
        System.out.println("hashSet是否为空" + isEmpty);
        boolean isContains = hashSet.contains("xieyuping");
        System.out.println("是否包含元素：" + isContains);

    }

}
