// file 1
import java.util.HashSet;

public class BeginHashSet {
    
    public static void main(String[] args) {
        
        String s = "banana";

        //using a hashset to check if a character is repeated or not

        HashSet<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()) {

            if(set.contains(ch)){
                System.out.println(ch+" is repeated");
            }
            else {
                set.add(ch);
            }
        }

    }
}
