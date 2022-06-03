import java.util.ArrayList;
import java.util. *;

public class SubSetSum {

    public void subsum(int index,int [] arr, int sum , ArrayList<Integer> ans){
        if(index == arr.length){
            ans.add(sum);
            return;
        }
        sum+=arr[index];
        subsum(index+1,arr,sum,ans);
        sum-=arr[index];
        subsum(index+1,arr,sum,ans);
    }



    public static void main(String[] args){
        SubSetSum ss = new SubSetSum();
        int [] arr = {3,1,2};
        int sum =0 ; 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ss.subsum(0,arr,sum,ans);
        Collections.sort(ans);
        System.out.println(ans);

    }
    
}
