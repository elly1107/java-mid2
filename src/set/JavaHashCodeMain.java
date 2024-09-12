package set;

import set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object의 기본 해시코드는 객체의 참조값 기반 생성
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        //각 클래스마다 hashCode를 이미 오버라이딩 해둠
        Integer i = 10;
        String strA = "A";
        String strB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strB.hashCode());

        //해시코드는 마이너스 값 가능
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        //instance는 다르지만 equals는 같다
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals, hashCode를 오버라이딩하지 않은 경우, 한 경우를 비교
        System.out.println((member1==member2)); //instance가 다르기 때문에 false
        System.out.println((member1.equals(member2))); //idA를 기반으로 해시코드 결정되기 때문에 트루
        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());
    }

}
