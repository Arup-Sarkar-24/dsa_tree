package com.arizonix.tutorial.dsa;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    // Helper method: returns what beats the user's choice
    public static int counterInput(int userChoice) {
        // Rock (1) is beaten by Paper (2)
        // Paper (2) is beaten by Scissor (3)
        // Scissor (3) is beaten by Rock (1)
        return switch (userChoice) {
            case 1 -> 2;
            case 2 -> 3;
            case 3 -> 1;
            default -> 1;
        };
    }

    // Helper method: converts number to string
    public static String choiceToString(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissor";
            default -> "Unknown";
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int lastInput = -1;
        int repeatCount = 0;

        while (true) {
            System.out.print("Enter 1 for Rock, 2 for Paper, 3 for Scissor (0 to quit): ");
            int userInp = sc.nextInt();

            if (userInp == 0) {
                System.out.println("Game ended.");
                break;
            }

            // Count repeated inputs
            if (userInp == lastInput) {
                repeatCount++;
            } else {
                repeatCount = 1;
            }

            lastInput = userInp;

            int computerInp;

            // If user repeats same input 3 or more times, computer plays to win
            if (repeatCount >= 3) {
                computerInp = counterInput(userInp); // choose what beats user's repeated input
                System.out.println("Computer predicted your move!");
            } else {
                computerInp = rand.nextInt(1, 4);
            }

            System.out.println("Computer chose: " + choiceToString(computerInp));

            if (userInp == computerInp) {
                System.out.println("Match Draw");
            } else if ((userInp == 1 && computerInp == 3) ||
                    (userInp == 2 && computerInp == 1) ||
                    (userInp == 3 && computerInp == 2)) {
                System.out.println("You win");
            } else {
                System.out.println("Computer wins");
            }
        }

        sc.close();
    }

}
