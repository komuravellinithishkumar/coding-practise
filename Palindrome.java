public class Palindrome {

    public void palindrome(int number){
        int num =0;
        int temp =number;
        while(number!=0){
            num=number%10;
            num=num*10+num;
            number=number/10;
        }
        if(num==temp){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not PAlindrome");
        }
    }
    
    public void main (String args[]){
        Palindrome number = new Palindrome();
        number.palindrome(121);
    }
}
