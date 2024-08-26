package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;


public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //문제 1
        dogHospital.set(cat); //Animal을 받기 때문에 dog 병원에 cat 넣을 수 있음. 매개변수 체크 실패 : 컴파일 오류 발생 안함.

        //문제 2
        //Animal 을 반환하기 때문에 Dog 에 넣어주려면 (Dog) 써야함
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
