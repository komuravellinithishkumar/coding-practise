public class Moores {

    int count =0;
    int element;

    public void moore(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(count==0){
                element = arr[i];
            }else if(element == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(element);
    }
    
    public static void main( String[] args)
    {
       int[] arr ={1,1,2,3,1,1,1,1};
       Moores array = new Moores();
       array.moore(arr);

    }

}
