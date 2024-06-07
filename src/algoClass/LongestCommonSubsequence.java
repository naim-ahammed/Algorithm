package algoClass;

public class LongestCommonSubsequence {

    public static String longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // Create a 2D array to store the length of LCS
        int[][] dp = new int[m + 1][n + 1];

        // Build the dp array bottom-up
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Retrieve the LCS from the dp array
        int lcsLength = dp[m][n];
        char[] lcs = new char[lcsLength];
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs[--lcsLength] = s1.charAt(i - 1);
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return new String(lcs);
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "AGXTAXBY";
        String result = longestCommonSubsequence(s1, s2);
        System.out.println("Longest Common Subsequence: " + result);
    }
}
