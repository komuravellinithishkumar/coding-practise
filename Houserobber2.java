import java.util.*;

public class Houserobber2 {

    public int maxcirclerob(int n, ArrayList<Integer> arr, int[] dp) {
        if (dp[n] != -1)
            return dp[n];
        if (n == 0) {
            return arr.get(n);
        }

        int pick = arr.get(n);
        if (n > 1) {
            pick += maxcirclerob(n - 2, arr, dp);
        }
        int notpick = 0 + maxcirclerob(n - 1, arr, dp);

        dp[n] = Math.max(pick, notpick);

        return Math.max(pick, notpick);
    }

    public static void main(String args[]) {

        int[] arr = { 1, 2, 3, 1 };
        int n = arr.length - 1;
        System.out.println(n);

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        // int[] arr2 = new int[n];
        for (int i = 0; i <= n; i++) {
            if (i != 0) {
                arr1.add(arr[i]);
            }
            if (i != n) {
                arr2.add(arr[i]);
            }
        }
        // int m = arr1.length;
        int[] dp = new int[arr1.size()];
        Arrays.fill(dp, -1);
        // System.out.println(arr1.size());

        // System.out.println(arr2);
        Houserobber2 rob = new Houserobber2();
        int first = rob.maxcirclerob(arr1.size() - 1, arr1, dp);
        Arrays.fill(dp, -1);
        int second = rob.maxcirclerob(arr2.size() - 1, arr2, dp);
        System.out.println(Math.max(first, second));

    }
}
