package session1;

public class Animal {

    int numberOfLegs;
    String type;
    String color;
    boolean hasTail;
    double weight;
    String name;

    public void eat(String food){

        System.out.println(name + "is eating" + food);
    }
    public void move(){

        System.out.println(name + "is moving");
    }

    public void live(int years){

        System.out.println(name + "is living" + years+ "years");



    }

}


class Dog extends Animal{
    String breed;
    boolean isDomestic;

    public void bark(){
        System.out.println(name = "is barking");
    }
}
class Wolf extends Animal{

}