package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @auther xieyp
 * @createTime 2020/12/9 9:46.
 * TODO:
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);//当队列满时，添加会报错
        queue.offer(1);//添加数据，当队列满时不报错
        queue.offer(2);
        printQueue(queue);
    }

    /**
     * 打印队列
     * @param queue
     */
    private static void printQueue(Queue queue){
        while (queue.peek() != null){
            System.out.println(queue.poll());
        }
    }
}
