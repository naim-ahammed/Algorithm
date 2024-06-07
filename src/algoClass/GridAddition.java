package algoClass;

import java.util.Scanner;

public class GridAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the desired grid dimension:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] grid = new int[rows][cols];

        System.out.println("Please enter the desired input:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        int highestTotal = findHighestTotal(grid);
        int lowestTotal = findLowestTotal(grid);

        System.out.println("\nAnswer:");
        System.out.println("Highest: " + highestTotal);
        System.out.println("Lowest: " + lowestTotal);

        System.out.println("Thank you!!!");
    }
    private static int findHighestTotal(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] dp = new int[rows][cols];

        for (int i = 0; i < cols; i++) {
            dp[0][i] = grid[0][i];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int left = (j > 0) ? dp[i - 1][j - 1] : 0;
                int up = dp[i - 1][j];
                int right = (j < cols - 1) ? dp[i - 1][j + 1] : 0;

                dp[i][j] = grid[i][j] + Math.max(Math.max(left, up), right);
            }
        }

        int maxTotal = Integer.MIN_VALUE;
        for (int i = 0; i < cols; i++) {
            maxTotal = Math.max(maxTotal, dp[rows - 1][i]);
        }

        return maxTotal;
    }
    private static int findLowestTotal(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int[][] dp = new int[rows][cols];

        for (int i = 0; i < cols; i++) {
            dp[0][i] = grid[0][i];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int left = (j > 0) ? dp[i - 1][j - 1] : Integer.MAX_VALUE;
                int up = dp[i - 1][j];
                int right = (j < cols - 1) ? dp[i - 1][j + 1] : Integer.MAX_VALUE;

                dp[i][j] = grid[i][j] + Math.min(Math.min(left, up), right);
            }
        }

        int minTotal = Integer.MAX_VALUE;
        for (int i = 0; i < cols; i++) {
            minTotal = Math.min(minTotal, dp[rows - 1][i]);
        }

        return minTotal;
    }
}
