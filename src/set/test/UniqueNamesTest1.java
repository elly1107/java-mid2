package set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> hashSet = new HashSet<>();

        for (Integer s : inputArr) {
            hashSet.add(s);
        }

        for (Integer s : hashSet) {
            System.out.println(s);
        }

    }
}
