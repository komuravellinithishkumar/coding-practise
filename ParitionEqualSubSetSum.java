public class ParitionEqualSubSetSum {

    public boolean partitionsum(int[] arr, int target, int index) {

        if (target == 0)
            return true;

        if (index == 0)
            return (arr[index] == target);

        boolean notpick = partitionsum(arr, target, index - 1);
        boolean pick = false;
        if (target > arr[index]) {
            pick = partitionsum(arr, target - arr[index], index - 1);
        }
        return pick || notpick;

    }

    public static void main(String args[]) {
        ParitionEqualSubSetSum pe = new ParitionEqualSubSetSum();
        int[] arr = { 1, 5, 11, 5 };
        // int target = 11;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        sum = sum / 2;

        int n = arr.length;
        if (n % 2 != 0) {

            System.out.println("false");
        }

        System.out.println(pe.partitionsum(arr, sum, n - 1));

    }
}
