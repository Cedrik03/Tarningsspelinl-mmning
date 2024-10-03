package se.cedrik.tarning;

import java.util.Random;

public class Player2 {
    private String name;
    private int score;

    public Player2(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void rollDice(Random random) {
        int roll1 = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        score = roll1 + roll2;
        System.out.println(name + " kastade " + roll1 + " och " + roll2 + ". Totala poäng: " + score);
    }

    public int getScore() {
        return score;
    }
}
