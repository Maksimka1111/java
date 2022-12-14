package task3;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String name;
        SomeObjects planet = new SomeObjects("some_object");
        System.out.println(planet.getName());
        SomePlanet somePlanet = new SomePlanet("Earth");
        System.out.print(somePlanet.getName());
    }
}
