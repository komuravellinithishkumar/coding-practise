import java.lang.Math;
import java.util.*;

public class FrogJumps {

    public int minEnergy(int n, int[] heights, int[] dp) {

        // dp[0] = 0; // Tabulation
        // for (int i = 1; i <= n; i++) {
        // int left = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
        // int right = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
        // return dp[i] = Math.min(left, right);
        // }

        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int lf = minEnergy(n - 1, heights, dp) + Math.abs(heights[n] - heights[n - 1]);
        int rt = 10000000;
        if (n > 1) {
            rt = minEnergy(n - 2, heights, dp) + Math.abs(heights[n] - heights[n - 2]);
        }

        return dp[n] = Math.min(lf, rt);
    }

    public static void main(String[] args) {
        int[] heights = { 30, 10, 60, 10, 60, 50 };
        int[] dp = new int[heights.length + 1];
        int n = 5;
        Arrays.fill(dp, -1);
        FrogJumps fg = new FrogJumps();

        System.out.println(fg.minEnergy(n, heights, dp));

    }

}
