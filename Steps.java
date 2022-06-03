public class Steps {
    public int stepways(int n) {

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[n] = dp[n - 1] + dp[n - 2];
        }
        System.out.println(dp[n]);
        return dp[n];

    }

    public static void main(String[] args) {
        Steps st = new Steps();
        System.out.println(st.stepways(2));

    }
}
