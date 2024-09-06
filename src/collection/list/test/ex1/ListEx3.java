package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }

        int sum = 0;
        for (Integer integer : list) {
            sum+=integer;
        }
        System.out.println("입력한 정수의 합계: "+sum);
        double average = (double) sum/list.size();
        System.out.println("average = " + average);

    }
}
