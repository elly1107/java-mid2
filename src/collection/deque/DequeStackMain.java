package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>(); possible but slower

        //ArrayDeque를 스택으로 사용하기...
        deque.push(1);
        deque.push(2);
        deque.push(3);

        System.out.println("deque.peek() = " + deque.peek());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque = " + deque);
    }
}
