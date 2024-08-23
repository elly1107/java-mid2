package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        GenericMethod.objMethod(i);

        //타입 인자 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer integerValue = GenericMethod.<Integer>genericMethod(i);
        System.out.println("integerValue = " + integerValue);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);
        System.out.println("doubleValue = " + doubleValue);
    }
}
