package Lesson_33;

public class Animal {
    public Animal(){

    }

    private int id;

    public Animal(int id) {
        this.id = id;
    }
    public void sleep(){
        System.out.println("Can sleep");
    }
    public String toString(){
        return String.valueOf(id);
    }
}
