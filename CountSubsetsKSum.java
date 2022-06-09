import java.util.*;

public class CountSubsetsKSum {

    public int countsubset(int[] arr, int index, int target, int[][] dp) {
        if (target == 0) {
            return 1;
        }
        if (index == 0) {
            if (arr[index] == target)
                return 1;
            else
                return 0;
        }
        if (dp[index][target] != -1)
            return dp[index][target];
        int notpick = countsubset(arr, index - 1, target, dp);
        int pick = 0;
        if (arr[index] < target) {
            pick = countsubset(arr, index - 1, target - arr[index], dp);
        }
        return dp[index][target] = pick + notpick;

    }
    // public int countsubset(int[] arr, int index, int target, int[][] dp, int n) {

    // for (index = 0; index < n; index++) {
    // dp[index][0] = 1;
    // }

    // if (arr[0] <= target)
    // dp[0][arr[0]] = 1;

    // for (index = 1; index < n; index++) {
    // for (int sum = 0; sum <= target; sum++) {
    // int notpick = dp[index - 1][sum];
    // int pick = 0;
    // if (arr[index] <= sum) {
    // pick = dp[index - 1][sum - arr[index]];
    // }
    // dp[index][sum] = pick + notpick;
    // }
    // }

    // return dp[n - 1][target];
    // }

    public static void main(String args[]) {
        CountSubsetsKSum cs = new CountSubsetsKSum();
        int[] arr = { 1, 2, 3 };

        int n = arr.length;
        int target = 3;
        int[][] dp = new int[n][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(cs.countsubset(arr, n - 1, target, dp));

    }
}
