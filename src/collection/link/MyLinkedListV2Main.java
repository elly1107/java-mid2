package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();

        //마지막 추가 O(n) 마지막을 찾아야 해서.
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list = " + list);

        //첫번째 추가 삭제 O(1)
        list.add(0, "d");
        System.out.println("list = " + list);
        list.remove(0);
        System.out.println("list = " + list);

        //중간 추가 삭제 O(n)
        list.add(1, "d");
        System.out.println("list = " + list);
        list.remove(1);
        System.out.println("list = " + list);

    }
}
