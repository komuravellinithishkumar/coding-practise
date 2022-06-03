import java.util.Arrays;

public class Houserobber {

    public int maxrob(int n, int[] arr, int[] dp) {

        if (n == 0) {
            return arr[n];
        }
        if (dp[n] != -1)
            return dp[n];
        int pick = arr[n];
        if (n > 1) {
            pick += maxrob(n - 2, arr, dp);
        }
        int notpick = 0 + maxrob(n - 1, arr, dp);

        return dp[n] = Math.max(pick, notpick);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5 };
        int n = arr.length - 1;
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        Houserobber hb = new Houserobber();
        System.out.println(hb.maxrob(n, arr, dp));

    }

}
