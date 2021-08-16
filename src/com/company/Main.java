package com.company;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setAge(2);
        cat.setColour(Color.LIGHT_GRAY);
        System.out.println(cat.info());

        Dog dog = new Dog(3, Color.BROWN, "Sit");
        System.out.println(dog.info());

        FightingDog fightingDog = new FightingDog(
                1, Color.WHITE, "Fight", 10);
        System.out.println(fightingDog.info());

        Animal animal = new Animal();
        animal.setAge(5);
        animal.setColour(Color.BLACK);
        System.out.println(animal.info());

        if (fightingDog.getColour() == Color.BLACK) { //fightingDog.getColour() == "Bleck"
            System.out.println("Dog is beautiful");
        }
    }
}
