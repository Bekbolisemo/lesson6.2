package com.company;

public class Dog extends Animal {
    private String commands;

    public Dog(int age, Color colour, String commands){
        super(); //
        this.commands = commands;
        setColour(colour);
        setAge(age);
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public String info() {
        return super.info() + " Commands: " + commands;
    }
}
