package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list = " + list);

        System.out.println("addLast");

        list.add(3, "addLast"); //O(1)
        System.out.println("list = " + list);

        System.out.println("addFirst");
        list.add(0, "addFirst"); //O(n)
        System.out.println("list = " + list);

        Object remove1 = list.remove(4); // O(1)
        System.out.println("remove1 = " + remove1);
        System.out.println("list = " + list);

        Object remove2 = list.remove(0); //O(n)
        System.out.println("remove2 = " + remove2);
        System.out.println("list = " + list);
    }
}
