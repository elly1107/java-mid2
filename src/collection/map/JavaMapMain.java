package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>()); //순서 보장 x O(1)
        run(new LinkedHashMap<>()); //입력순서 O(1)
        run(new TreeMap<>()); //키 값 정렬 O(log n)
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.print(key + " = " + map.get(key) + " ");
        }
        System.out.println();
    }
}
