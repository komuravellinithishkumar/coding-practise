public class kadens {
    int maxsum;
    int currentsum;
    int[] arr;

    public void kaden(int[] arr){

        for(int i=0;i<arr.length;i++){
            currentsum=currentsum+arr[i];
            if(currentsum>=maxsum){
                  maxsum=currentsum;
            }
            if(currentsum<0){
                currentsum=0;
            }
        }
        System.out.println(maxsum);
    }

    public static void main (String args[]){
        int[] arr={1,-5,2,4};
        kadens ar = new kadens();
        ar.kaden(arr);
        
    }

}
