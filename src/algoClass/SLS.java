package algoClass;

import java.util.*;

public class SLS {
    public static int secondLongestSubsequenceLength(char X[], char Y[], int m, int n) {
        int lcsLength = lcs(X, Y, m, n);

        int secondLongestLength = m + n - lcsLength;

        return secondLongestLength;
    }

    public static int lcs(char X[], char Y[], int m, int n) {
        int[][] LCS = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    LCS[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    LCS[i][j] = 1 + LCS[i - 1][j - 1];
                } else {
                    LCS[i][j] = Math.max(LCS[i - 1][j], LCS[i][j - 1]);
                }
            }
        }

        return LCS[m][n];
    }

    public static void main(String[] args) {
        String X = "BDCB";
        String Y = "BACDB";

        char[] arr1 = X.toCharArray();
        char[] arr2 = Y.toCharArray();

        int len1 = arr1.length;
        int len2 = arr2.length;

        int secondLongestLength = secondLongestSubsequenceLength(arr1, arr2, len1, len2);

        System.out.println("Length of the second longest subsequence is: " + secondLongestLength);
    }
}












