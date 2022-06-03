import java.util.Arrays;
public class TwoSum {
    Node head;
    int[] arr1;
    int[] arr2;
    int[] sum;

    

    public void add(int[] arr1, int[] arr2) {
        int length = 0;
        int carry =0;
        int s=0;

        int len1 = arr1.length;
        // System.out.println(len1);
        int len2 = arr2.length;
        // System.out.println(len2);
        if (len2 >= len1) {
            length = len2;
        }
        if (len1 > len2) {
            length = len1;

        }
        // System.out.println(length);
        int[] sum = new int[length];
        for (int i = length-1; i >=0; i--) {
            s= arr1[i]+arr2[i]+carry;
            if(i==0){
                sum[i]=s;
                System.out.println("True");
            }else{
            sum[i]=s%10;
            carry=s/10;
            }
        }
         System.out.println(Arrays.toString(sum));
            for(int i=0;i<sum.length;i++){
            Node start = new Node(sum[i]);
            System.out.println(start.data);
            start.next = head;
            this.head = start;
            }
    }

    public static void main(String args[]) {
        int[] arr1 = { 10, 2, 5 , 4 };
        int[] arr2 = { 4, 5, 6, 7 };
        TwoSum aray1 = new TwoSum();
        // TwoSum aray2 = new TwoSum();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        aray1.add(arr1, arr2);

        // aray2.add(arr2);

    }
}
