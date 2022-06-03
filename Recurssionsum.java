public class Recurssionsum {
//    int N;

    public int sum(int N){

        if(N==1){
            return 1;
        }else{
           return N * sum(N-1);
        }

    }

    public static void main (String[] args){
       Recurssionsum s = new Recurssionsum();
       System.out.println(s.sum(4));
    }
}
