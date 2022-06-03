import java.util.Arrays;

public class ReverseArray {

    public void reverse(int arr[]) {
        int temp[];
        int max = 0;
        int min = 100000;
        temp = new int[arr.length];
        if (arr.length == 0) {
            System.out.println("no array");
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                temp[i] = arr[i];
                if (min > arr[i]) {
                    min = arr[i];
                }
                if (max < arr[i]) {
                    max = arr[i];
                }
                System.out.println(temp[i]);
            }
        }
        System.out.println(Arrays.toString(temp));
        System.out.println(min);
        System.out.println(max);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 3 };
        ReverseArray ar = new ReverseArray();
        ar.reverse(arr);
        // System.out.println(temp);

    }
}