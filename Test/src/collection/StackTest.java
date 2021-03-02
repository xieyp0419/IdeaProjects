package collection;

import java.util.LinkedList;

/**
 * @auther xieyp
 * @createTime 2020/12/9 13:54.
 * TODO:用链表实现栈（后进先出）
 */
public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(("-------------"));
        for (Object o : stack.list) {
            System.out.println(o.toString());
        }
        System.out.println(("-------------"));
    }

    static class Stack{
        private LinkedList list = new LinkedList();

        public void push(Object o){
            list.addFirst(o);
        }

        public Object peek(){
            return list.getFirst();
        }

        public Object pop(){
            return list.removeFirst();
        }

    }
}
