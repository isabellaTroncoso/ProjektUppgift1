package se.isabella.dicegame;

import java.util.Scanner;

public class Player {
    static Scanner scanner = new Scanner(System.in);
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;         // Spelets poäng börjar alltid med 0.
    }

    public String getName() { // Retunerar namnet.
        return name;
    }

    public int getScore() { // Retunerar totala poängen.
        return score;
    }

    public void setScore(int score) {  // Lägger till poängen och retunerar.
        this.score += score;
    }

    public void addDice(int points) { // Poängen läggs till i varje kast.
        setScore(points);
    }

}
