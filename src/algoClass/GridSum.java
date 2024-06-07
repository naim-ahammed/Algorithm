package algoClass;

import java.util.Scanner;

public class GridSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[][] grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = input.nextInt();
            }
        }

        int[][] maxSum = new int[n][m];
        int[][] minSum = new int[n][m];

        for (int j = 0; j < m; j++) {
            maxSum[0][j] = grid[0][j];
            minSum[0][j] = grid[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int left = j > 0 ? maxSum[i - 1][j - 1] : Integer.MIN_VALUE;
                int right = j < m - 1 ? maxSum[i - 1][j + 1] : Integer.MIN_VALUE;
                int down = maxSum[i - 1][j];
                maxSum[i][j] = grid[i][j] + Math.max(left, Math.max(right, down));

                left = j > 0 ? minSum[i - 1][j - 1] : Integer.MAX_VALUE;
                right = j < m - 1 ? minSum[i - 1][j + 1] : Integer.MAX_VALUE;
                down = minSum[i - 1][j];
                minSum[i][j] = grid[i][j] + Math.min(left, Math.min(right, down));
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < m; j++) {
            max = Math.max(max, maxSum[n - 1][j]);
            min = Math.min(min, minSum[n - 1][j]);
        }

        System.out.println("Highest sum: " + max);
        System.out.println("Lowest sum: " + min);
    }
}