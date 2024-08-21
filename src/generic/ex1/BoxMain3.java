package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성시점에 T 타입 결정
        integerBox.set(10);
        //integerBox.set("abc"); //Integer타입만 허용, 컴파일 오류
        Integer integer = integerBox.get();//Integer 타입 반환 (캐스팅 x)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = " + string);

        //타입 추론 : 생성하는 제너릭 타입 생략 가능
        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set(10.5);
        Double v = doubleGenericBox.get();
        System.out.println("v = " + v);


    }
}
