package com.company;

public class FightingDog extends Dog {
    private int wins;

    public FightingDog(int age, Color colour,
                       String commands, int wins) {
        super(age, colour, commands);
        this.wins = wins;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public String info() {
        return super.info() + " Wins: " + wins;
    }
}
