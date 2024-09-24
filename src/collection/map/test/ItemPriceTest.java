package collection.map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        //값이 1000원인 모든 상품을 출력해라
        Set<String> fruits = map.keySet();
        Set<String> wanted = new HashSet<>();
        for (String fruit : fruits) {
            if (map.get(fruit) == 1000) {
                wanted.add(fruit);
            }
        }
        System.out.println(wanted);

    }
}
