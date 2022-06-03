public class SortColours {

    public void sortCo(int[] nums) {
        
        int low = 0;
        int mid = 0 ;
        int high = nums.length -1 ;
        
        while(mid<=high){
            
            if (nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums [low];
                nums[low]= temp;
                low++;
                mid++;
            }
            if(nums[mid]==1){
                mid++;
            }
            if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums [high];
                nums[high]= temp;
                high--;
                mid++;
                
            }
            System.out.println(Arrays.toString(nums));
        }
        
    }
    public static void main(String args[]){
        SortColours sc = new SortColours();
        int[] nums = {2,0,2,1,1,0};
        sc.sortCo(nums);


    }
}
