package task3;

import java.io.Serializable;

public class Generic2<T extends Comparable<String>,V extends Serializable,K extends Animal> {
    T arg1;
    V arg2;
    K arg3;
    public Generic2(T arg1, V arg2, K arg3)
    {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    public K getArg3() {
        return arg3;
    }

    public T getArg1() {
        return arg1;
    }

    public V getArg2() {
        return arg2;
    }
    public void print()
    {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}
class Animal{
    String animal_name;

    public String getAnimal_name() {
        return animal_name;
    }

    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }
}
