package algoClass;

import java.util.Scanner;

public class LoShuMagicSquare {
    public static boolean isLoShuMagicSquare(int[][] grid) {
        for (int i = 0; i < 3; i++) {
            int row = 0;
            int col = 0;
            
            for (int j = 0; j < 3; j++) {
                row += grid[i][j];
                col += grid[j][i];
            }
            if (row!=15 || col!=15) {
                return false; 
            }
        }
        if (grid[0][0] + grid[1][1] + grid[2][2] != 15 || grid[0][2] + grid[1][1] + grid[2][0] != 15) {
            return false; 
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the desire grid dimension: ");

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] grid = new int[n][m];

        System.out.println("Please output for "+n+" x "+m+" Grid:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        if (isLoShuMagicSquare(grid)) {
            System.out.println("This is a Lo Shu Magic Square.");
            System.out.println("And, the magic number is 15.");
        } else {
            System.out.println("This is NOT a Lo Shu Magic Square.");
        }
        System.out.println("Thank you!!!");
        scanner.close();
    }
}
