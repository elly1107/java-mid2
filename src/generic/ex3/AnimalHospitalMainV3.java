package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;


public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //문제 1 해결
        //다른 타입 컴파일 오류남
//        dogHospital.set(cat);

        dogHospital.set(dog);
        //문제 2 해결
        // (Dog) 굳이 쓸 필요 없음
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
