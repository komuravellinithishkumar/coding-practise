import java.util.*;

public class Maxflowpath {

    public int maxpath(int[][] arr, int row, int column, int n, int[][] dp) {
        // Memoization
        if (column < 0 || column >= n) {
            return -1000000;

        }
        if (row == 0) {
            return arr[row][column];
        }
        if (dp[row][column] != -1)
            return dp[row][column];
        int up = arr[row][column] + maxpath(arr, row - 1, column, n, dp);
        int leftdiag = arr[row][column] + maxpath(arr, row - 1, column - 1, n, dp);
        int rightdiag = arr[row][column] + maxpath(arr, row - 1, column + 1, n, dp);
        return dp[row][column] = Math.max(up, Math.min(leftdiag, rightdiag));

        // Tabulation
        // int column;
        // int row;
        // for (column = 0; column >= n; column++) {
        // dp[0][column] = arr[0][column];
        // }

        // if (column < 0 || column > n - 1) {
        // return -100000;
        // }

        // for (row = 1; row < n; row++) {
        // for (column = 0; column < n; column++) {
        // int up = arr[row][column] + dp[row - 1][column];
        // int leftdiag = arr[row][column] + dp[row - 1][column - 1];
        // int rightdiag = arr[row][column] + dp[row - 1][column + 1];
        // return dp[row][column] = Math.max(up, Math.max(leftdiag, rightdiag));
        // // return localmax;
        // }
        // }
        // return localmax;

    }

    public static void main(String[] args) {

        Maxflowpath mx = new Maxflowpath();
        // int[][] grid = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
        int[][] grid = { { 1, 2, 10, 4 },
                { 100, 3, 2, 1 },
                { 1, 1, 20, 2 },
                { 1, 2, 2, 1 } };
        int n = grid.length;
        System.out.println(n);
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int max = -1;
        for (int i = 0; i < n; i++) {
            int maxi = mx.maxpath(grid, n - 1, i, n, dp);
            max = Math.max(maxi, max);

        }
        System.out.println(max);

    }

}
