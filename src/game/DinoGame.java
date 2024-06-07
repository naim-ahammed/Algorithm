package game;

import java.util.Scanner;

public class DinoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Dino Game!");
        System.out.println("Press Enter to start...");

        // Wait for the user to press Enter
        scanner.nextLine();

        // Start the game
        runGame();

        // Close the scanner
        scanner.close();
    }

    private static void runGame() {
        int score = 0;
        boolean isGameOver = false;

        while (!isGameOver) {
            // Display the game screen
            displayGame(score);

            // Get user input
            System.out.print("Press 'A' to jump, 'Q' to quit: ");
            Scanner scanner = new Scanner(System.in);
            char input = scanner.next().toUpperCase().charAt(0);

            // Process user input
            switch (input) {
                case 'A':
                    // Jump
                    System.out.println("Dino jumped!");
                    score++;
                    break;
                case 'Q':
                    // Quit the game
                    System.out.println("Thanks for playing! Your final score: " + score);
                    isGameOver = true;
                    break;
                default:
                    System.out.println("Invalid input. Try again!");
            }

            // Add a delay to make the game playable
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void displayGame(int score) {
        // Clear the console
        System.out.print("\033[H\033[2J");

        // Display the game screen
        System.out.println("Dino Game");
        System.out.println("Score: " + score);
        System.out.println("Press 'A' to jump, 'Q' to quit");
        System.out.println("----------------------------");
        System.out.println("  (_)      ");
        System.out.println("   \\|/    ");
        System.out.println("    |     ");
        System.out.println("   / \\    ");
        System.out.println("----------------------------");
    }
}
