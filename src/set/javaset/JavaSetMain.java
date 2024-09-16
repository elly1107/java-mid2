package set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>()); //O(1)
        run(new LinkedHashSet<>()); //입력순서 O(1)
        run(new TreeSet<>()); //데이터순서 O(log N)
    }

    private static void run(Set<String> set) {
        System.out.println(set.getClass());
        set.add("C");
        set.add("A");
        set.add("B");
        set.add("D");
        set.add("1");
        set.add("2");
        System.out.println("set = " + set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
}
