package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        //위를 이런 식으로 표현 가능, map 안 값 수정 불가
        Map<String, Integer> map2 = Map.of("B",4,"C",5,"D",6);

        //공통으로 들어가 있는 키를 찾고 값의 합 구하기
        HashMap<String, Integer> result = new HashMap<>();
        for (String key : map2.keySet()) {
            if (map1.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }

        System.out.println("result = " + result);
    }
}
