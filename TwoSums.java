public class TwoSums {
    int firstnumber;
    int secondnumber;


    

    public int sum(int firstnumber,int secondnumber) {
        int total = firstnumber + secondnumber;
        System.out.println(total);
        return total;

    }

    public static void main(String args[]) {
        TwoSums S = new TwoSums();
        S.sum(3, 4);

    }
}