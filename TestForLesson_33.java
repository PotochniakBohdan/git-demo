package Lesson_33;

import java.util.ArrayList;
import java.util.List;

public class TestForLesson_33 {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals);
    }

    private static void test(List<Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

}














