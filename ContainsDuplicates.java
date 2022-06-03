import java.util.*;

public class ContainsDuplicates {

    public boolean doesContainDuplicate(int[] nums) {

        System.out.println(Arrays.toString(nums));
        return true;

        does_contain_duplicate

        for (int i=0;i<nums.length;i++){
        for(int j=0;j<i;j++)
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int[] nums = { 1, 2, 3, 1 };
        ContainsDuplicates cd = new ContainsDuplicates();

        System.out.println(cd);

        cd.doesContainDuplicate(nums);
    }
}

import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            hashtable.put(i, nums[i]);
        }
    }

}