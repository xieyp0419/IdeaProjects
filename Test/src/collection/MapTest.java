package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @auther xieyp
 * @createTime 2020/12/14 10:34.
 * TODO:
 */
public class MapTest {

    public static void main(String[] args) {

        Map<String,String> hashMap = new HashMap<String,String>();
        hashMap.put(null,null);
        hashMap.put("2",null);
        hashMap.put("3",null);
        hashMap.put(null,"d");
        hashMap.put("5","e");

        System.out.println(hashMap.get(null));
        System.out.println(hashMap.get("2"));
        System.out.println(hashMap.get("3"));

//        System.out.println(hashMap.containsKey("1"));
//
//        hashMap.remove("1");
//        System.out.println(hashMap.containsKey("1"));
//        System.out.println(hashMap);
//
//        for (String s : hashMap.keySet()) {
//            System.out.println(s);
//        }
//
//        hashMap.clear();
//        System.out.println(hashMap.isEmpty());

    }
}
