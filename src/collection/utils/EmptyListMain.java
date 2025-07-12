package collection.utils;

import java.util.*;

public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변 리스트
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        //빈 불변 리스트
        List<Integer> list3 = Collections.emptyList(); //자바5에 도입
        List<Integer> list4 = List.of(); //자바9에 도입

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());


        //Arrays.asList는, 길이 고정, 내용물은 수정 가능
        // 위와 아래는 같은 참조값(위치)을 대상으로 함
        // 따라서 성능상 나을 수 있음 (또 베끼는게 아니기 때문)
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr);

        //따라서 0번째를 100으로 바꿨을때 둘다 바꿈
        arrList.set(0, 100);
        System.out.println("arrList = " + arrList);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
