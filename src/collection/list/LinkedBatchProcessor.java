package collection.list;

public class LinkedBatchProcessor {
    private final MyLinkedList<Integer> list = new MyLinkedList<>();

    public void logic(int size) {
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: "+size+"시간: "+(endTime-startTime)+"ms");
    }
}
