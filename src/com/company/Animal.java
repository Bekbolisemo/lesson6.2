package com.company;

public class Animal {
    private int age;
    protected Color colour;

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public String info() {
        return "Age: " + age + " Color: " + colour;
    }
}
