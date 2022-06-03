import java.util.*;
public class Recurssionswap {

    
    public int[] reverse(int[] arra,int left,int right){

        if(left >=right){
            // System.out.println(Arrays.toString(arra));;
            return arra;
        }

            int temp=arra[left];
            arra[left] = arra[right];
            arra[right]=temp;
            return reverse(arra, left+1, right-1);
             
    

     }
    // System.out.println(Arrays.toString(arr));





    public static void main(String[] args){
        Recurssionswap arr = new Recurssionswap();
        int[] arra ={0,1,2,3,4};
        System.out.println(Arrays.toString(arr.reverse(arra,0,arra.length-1)));
    }
}
