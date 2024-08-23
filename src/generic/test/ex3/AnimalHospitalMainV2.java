package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;


public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2();


        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
