public class KsubSequenceSum {
    
    public int count(int index,int[] arr, int sum, int s){
        if(index == arr.length){
            if( s == sum){
                return 1;
            }
            else {
                return 0;
            }
            
    }
        s+=arr[index];
        int left = count(index+1, arr, sum, s);
        s-=arr[index];
        int right = count(index+1, arr, sum, s);

        return left+right;


    }



    public static void main(String[] args){
        int[] arr = {1,2,1};
        int sum = 2;
        int s=0;
        KsubSequenceSum ks = new KsubSequenceSum();
        
        System.out.println(ks.count(0,arr,sum,s));

    }
}
