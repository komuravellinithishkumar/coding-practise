import java.util.*;

public class MaxSumFlowPathII {

    public int maxflowII(int[][] arr, int row, int column, int n, int[][] dp) {

        if (row == 0) {
            return arr[row][column];
        }
        int max = -100000;
        if (dp[row][column] != -1)
            return dp[row][column];
        for (int last = 0; last < n; last++) {
            if (last != column) {
                int maxi = arr[row][column] + maxflowII(arr, row - 1, last, n, dp);
                max = Math.min(max, maxi);
            }
        }
        return dp[row][column] = max;
    }

    public static void main(String args[]) {
        MaxSumFlowPathII mx = new MaxSumFlowPathII();
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = arr.length;
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int max = -100000;
        for (int column = 0; column < n; column++) {
            int maxi = mx.maxflowII(arr, n - 1, column, n, dp);
            max = Math.max(max, maxi);
        }
        System.out.println(max);
    }
}
