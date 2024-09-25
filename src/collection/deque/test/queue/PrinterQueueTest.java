package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> printQueeue = new ArrayDeque<>();
        printQueeue.offer("doc1");
        printQueeue.offer("doc2");
        printQueeue.offer("doc3");
        System.out.println(printQueeue.poll());
        System.out.println(printQueeue.poll());
        System.out.println(printQueeue.poll());
    }
}
