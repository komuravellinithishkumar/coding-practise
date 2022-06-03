import java.util.*;

public class SubsequenceSum {

    public void sumSeq(int index, int[] arr, ArrayList<Integer> al, ArrayList<ArrayList<Integer>> ans, int sum, int s) {

        if (index == arr.length) {
            if (s == sum) {
                ans.add(new ArrayList(al));
                // return ;

            }
             return;
        }
        al.add(arr[index]);
        s += arr[index];
        sumSeq(index + 1, arr, al, ans, sum, s);
        al.remove(al.size() - 1);
        s-=arr[index];
        sumSeq(index + 1, arr, al, ans, sum, s);
    }

    public static void main(String[] args) {
        SubsequenceSum ss = new SubsequenceSum();
        int[] arr = { 1, 2, 1 };
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int sum = 2;
        int s = 0;
        ss.sumSeq(0, arr, new ArrayList<Integer>(), ans, sum, s);
        System.out.println(ans);

    }
}
