import java.util.ArrayList;
import java.util.*;

public class UniqueSubSets {

    public void Unique(int index, int[] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> al) {
        ans.add(new ArrayList<>(al));
        for (int i = index; i < arr.length; i++) {
            if (i != index && arr[i] == arr[i - 1])
                continue;
            al.add(arr[i]);
            Unique(i + 1, arr, ans, al);
            al.remove(al.size() - 1);
        }
    }

    public static void main(String[] args) {
        UniqueSubSets uss = new UniqueSubSets();
        int[] arr = { 1, 3, 2 };
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        uss.Unique(0, arr, ans, new ArrayList<Integer>());
        System.out.println(ans);
    }
}
