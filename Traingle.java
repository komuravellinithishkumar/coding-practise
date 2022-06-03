import java.util.*;

public class Traingle {

    public int mintrianglepath(int[][] triangle, int row, int column, int n, int[][] dp) {
        //
        if (row == n - 1) {
            return triangle[row][column];
        }
        if (dp[row][column] != -1)
            return dp[row][column];
        int down = triangle[row][column] + mintrianglepath(triangle, row + 1, column, n, dp);
        int diag = triangle[row][column] + mintrianglepath(triangle, row + 1, column + 1, n, dp);
        return dp[row][column] = Math.min(down, diag);
    }

    public static void main(String[] args) {
        Traingle tr = new Traingle();
        int[][] triangle = { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };
        int n = triangle.length;
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(tr.mintrianglepath(triangle, 0, 0, n, dp));

    }
}
