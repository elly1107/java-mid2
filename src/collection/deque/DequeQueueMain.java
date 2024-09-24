package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>(); possible but slower

        //ArrayDeque를 queue로 사용하기
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);

        System.out.println("deque.peek() = " + deque.peek());
        System.out.println("deque.pop() = " + deque.poll());
        System.out.println("deque.pop() = " + deque.poll());
        System.out.println("deque.pop() = " + deque.poll());
        System.out.println("deque = " + deque);
    }
}
