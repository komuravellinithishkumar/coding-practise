public class UniquePAthII {

    public int obstacleUniquePath(int[][] arr, int row, int column) {

        // memoization
        if (row == 0 && column == 0) {
            return 1;
        }
        if (row < 0 || column < 0 || arr[row][column] == 1) {
            return 0;
        }
        // if (dp[row][column] != -1)
        // return dp[row][column];
        int up = obstacleUniquePath(arr, row - 1, column);
        int left = obstacleUniquePath(arr, row, column - 1);
        return up + left;

    }

    public static void main(String[] args) {
        UniquePAthII uII = new UniquePAthII();
        int[][] arr = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        int m = arr.length;
        int n = arr[0].length;
        System.out.println(uII.obstacleUniquePath(arr, m - 1, n - 1));

    }
}
