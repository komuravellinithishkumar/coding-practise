import javax.swing.text.html.HTML.Tag;

public class PartitionSubsetKsum {

    public boolean Partitionsum(int[] arr, int index, int target, int[][] dp) {
        if (target == 0)
            return true;

        if (index == 0)
            return (arr[0] == target);
        if (dp[index][target] != -1)
            return dp[index][target] == 0 ? false : true;
        boolean notpick = Partitionsum(arr, index - 1, target, dp);
        boolean pick = false;
        if (target > arr[index]) {
            pick = Partitionsum(arr, index - 1, target - arr[index], dp);
        }
        dp[index][target] = pick || notpick ? 1 : 0;
        return pick || notpick;

    }

    public static void main(String args[]) {
        PartitionSubsetKsum ps = new PartitionSubsetKsum();
        int[] arr = { 2, 3, 7, 1 };
        int index = arr.length;
        int[][] dp = new int[index][index];
        int target = 10;

        System.out.println(ps.Partitionsum(arr, index - 1, target, dp));

    }

}
