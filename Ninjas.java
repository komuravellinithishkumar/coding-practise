import java.util.*;

public class Ninjas {

    public int maxninjas(int[][] arr, int n, int last, int[][] dp) {
        if (n == 0) {
            int max = 0;
            for (int i = 0; i <= 2; i++) {
                if (i != last) {
                    max = Math.max(max, arr[0][i]);
                }

            }
            return max;
        }
        if (dp[n][last] != -1)
            return dp[n][last];
        int max = 0;
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                int maxi = arr[n][i] + maxninjas(arr, n - 1, i, dp);
                max = Math.max(maxi, max);
            }
        }
        return dp[n][last] = max;
    }

    public static void main(String[] args) {
        int[][] arr = { { 10, 40, 70 }, { 20, 50, 80 }, { 30, 60, 90 } };
        Ninjas nj = new Ninjas();

        int n = arr.length;
        int[][] dp = new int[n][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(nj.maxninjas(arr, n - 1, 3, dp));

    }

}
