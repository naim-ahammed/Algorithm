package algoClass;

import java.util.*;

public class Knapsack {
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static void find(int W, int wt[], int val[], int n, int P[][]) {
        int i = n, w = W;
        while (i > 0 && w > 0) {
            if (P[i][w] != P[i - 1][w]) {
                System.out.println("Selected item " + i + " Value " + val[i - 1] + " Weight " + wt[i - 1]);
                w = w - wt[i - 1];
                i--;
            } else {
                i--;
            }
        }
    }

    static int knapsack(int W, int wt[], int val[], int n) {
        int i, w;
        int P[][] = new int[n + 1][W + 1];
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    P[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    P[i][w] = max(val[i - 1] + P[i - 1][w - wt[i - 1]], P[i - 1][w]);
                } else {
                    P[i][w] = P[i - 1][w];
                }
            }
        }
        System.out.println("Selected items:");
        find(W, wt, val, n, P);
        return P[n][W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        System.out.println("Enter the size of the knapsack:");
        int W = sc.nextInt();

        int val[] = new int[n];
        int wt[] = new int[n];
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        System.out.println("Enter the weights:");
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }

        System.out.println("Max total benefit = " + knapsack(W, wt, val, n));
    }
}
