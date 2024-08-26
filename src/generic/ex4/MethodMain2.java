package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    ;

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 200);

        //AnimalMethod.<Dog>checkup(dog); 라고 자동으로 넣어줌
        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);
        Animal bigger = AnimalMethod.<Animal>bigger(dog, cat);
        System.out.println("bigger = " + bigger);
    }
    }
