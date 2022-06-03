import java.util .*;
public class Ransom {
    
    public boolean canConstruct (String ransomNote, String magazine){
        Hashtable <Character,Integer> hash = new Hashtable<>();
        for(int i=0; i < magazine.length(); i++){
            // System.out.println(magazine.charAt(i));
            if(hash.containsKey(magazine.charAt(i))){
                // System.out.println("true");
                int temp = hash.get(magazine.charAt(i));
                temp++;
                hash.put(magazine.charAt(i), temp);
            }else
            {
                hash.put(magazine.charAt(i), 1);
            }
        }
            for(int j = 0; j< ransomNote.length();j++){
                if(hash.containsKey(ransomNote.charAt(j))){
                    
                    int temp = hash.get(ransomNote.charAt(i));
                    if(temp > 0){
                    temp--;
                    hash.put(magazine.charAt(i), temp);
                    }else{
                        return false;
                    }
                    
                    
                }else{
                    System.out.println("false");
                }
            }
        return true ;

    }

    public static void main (String[] args){
        String magazine = "ab";
        String ransomNote = "aa";
        

    }
}
