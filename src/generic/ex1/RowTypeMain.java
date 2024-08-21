package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        //타입인자 <> 안쓰면 row type
        GenericBox integerBox = new GenericBox();
        //GenericBox<Object> integerBox = new GenericBox<>();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

    }
}
