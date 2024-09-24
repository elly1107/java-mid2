package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();//LinkedList도 가능
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        //다음 데이터 조회 (꺼내지 않고)
        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("queue.poll = " + queue.poll());
        System.out.println("queue.poll = " + queue.poll());
        System.out.println("queue.poll = " + queue.poll());

        System.out.println(queue);
    }
}
