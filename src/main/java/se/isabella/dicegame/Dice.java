package se.isabella.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public void rollDice(Player player1, Player player2) {

        for (int i = 1; i <= 2; i++) {   // Spelarna kastar 2 omgångar.
            System.out.println("Round " + i + ": roll the dice with [enter]"); // i = omgångar.
            scanner.nextLine();
            int roll1 = random.nextInt(6) + 1; // Första kastningen(slumpmässigt).
            player1.addDice(roll1);                  // Lägger till poäng för varje kast.
            System.out.println(player1.getName() + " roll " + roll1); // Skriver ut.
            scanner.nextLine();

            int roll2 = random.nextInt(6) + 1;
            player2.addDice(roll2);
            System.out.println(player2.getName() + " roll " + roll2);
            scanner.nextLine();


        }
    }
}
