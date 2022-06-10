import java.util.Arrays;
import java.util.*;

public class CherryPcikup {

    public int cherryII(int[][] arr, int row, int column1, int column2, int width, int length, int[][][] dp) {
        if (column1 < 0 || column1 >= width || column2 < 0 || column2 >= width) {
            return -10000;
        }

        if (row == length - 1) {

            if (column1 == column2)
                return arr[row][column1];
            else
                return arr[row][column1] + arr[row][column2];

        }
        if (dp[row][column1][column2] != -1) {
            return dp[row][column1][column2];
        }
        int maxi = -10000;
        int value;
        for (int col1 = -1; col1 <= 1; col1++) {
            for (int col2 = -1; col2 <= 1; col2++) {
                if (column1 == column2) {
                    value = arr[row][column1]
                            + cherryII(arr, row + 1, column1 + col1, column2 + col2, width, length, dp);
                } else {
                    value = arr[row][column1] + arr[row][column2]
                            + cherryII(arr, row + 1, column1 + col1, column2 + col2, width, length, dp);
                }
                maxi = Math.max(maxi, value);
            }
        }
        return dp[row][column1][column2] = maxi;

    }

    public static void main(String args[]) {
        CherryPcikup cp = new CherryPcikup();
        int[][] arr = { { 8, 8, 10, 9, 1, 7 }, { 8, 8, 1, 8, 4, 7 }, { 8, 6, 10, 3, 7, 7 }, { 3, 0, 9, 3, 2, 7 },
                { 6, 8, 9, 4, 2, 5 }, { 1, 1, 5, 8, 8, 1 }, { 5, 6, 5, 2, 9, 9 }, { 4, 4, 6, 2, 5, 4 },
                { 4, 4, 5, 3, 1, 6 }, { 9, 2, 2, 1, 9, 3 } };
        int n = arr[0].length;
        int length = arr.length;
        int[][][] dp = new int[n][n][n];
        for (int[][] row1 : dp) {
            for (int[] row2 : row1) {
                Arrays.fill(row2, -1);
            }
        }
        // System.out.println(n);

        // System.out.println(length);
        System.out.println(cp.cherryII(arr, 0, 0, n - 1, n, length, dp));

    }
}
