import java.util.*;

public class UniquePaths {

    public int alluniquepaths(int row, int column, int[][] dp) {
        // memoization
        // if (row == 0 && column == 0) {
        // return 1;
        // }
        // if (row < 0 || column < 0) {
        // return 0;
        // }
        // if (dp[row][column] != -1)
        // return dp[row][column];
        // int up = alluniquepaths(row - 1, column, dp);
        // int left = alluniquepaths(row, column - 1, dp);
        // return dp[row][column] = up + left;

        // tabulation

        dp[0][0] = 1;
        System.out.println(dp[0][0]);

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {

                System.out.println("enter");

                int up = 0;
                int left = 0;
                up = dp[i - 1][j];

                left = dp[i][j - 1];
                dp[i][j] = up + left;
            }
        }
        return dp[row - 1][column - 1];
    }

    public static void main(String[] args) {

        UniquePaths up = new UniquePaths();
        int m = 3;
        int n = 2;
        int[][] dp = new int[m][n];
        for (int row[] : dp) {
            Arrays.fill(row, -1);
        }
        up.alluniquepaths(m - 1, n - 1, dp);

    }
}
