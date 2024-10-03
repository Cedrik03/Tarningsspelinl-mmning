package se.cedrik.tarning;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Spelare 1 skriv ditt namn:");
        String player1Name = scanner.nextLine();
        Player1 spelare1 = new Player1(player1Name);

        System.out.println("Spelare 2 skriv ditt namn:");
        String player2Name = scanner.nextLine();
        Player2 spelare2 = new Player2(player2Name);

        spelare1.rollDice(rand);

        spelare2.rollDice(rand);


        if (spelare1.getScore() > spelare2.getScore()) {
            System.out.println(spelare1.getName() + " vinner  " + spelare1.getScore() + " poäng");

        } else if (spelare1.getScore() <  spelare2.getScore()) {
            System.out.println(spelare2.getName() + " vinner  " + spelare2.getScore() + " poäng");

        } else {
            System.out.println("Det är oavgjort");
        }

        scanner.close();

    }
}
