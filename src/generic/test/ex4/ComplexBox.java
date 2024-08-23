package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }


    //제너릭 메서드가 제너릭 타입보다 우선순위가 놓다.
    public <Z> Z printAndREturn(Z z) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.classsName: " + z.getClass().getName());
        return z;
    }

}
