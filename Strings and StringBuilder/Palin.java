public class Palin {

    public static void main(String[] args) {
        
      String str = "abzdba";
      System.out.println(isPallindrome(str));
    }   
    
    public static boolean isPallindrome(String str)
    {
         // if string is empty or null
         if(str == null || str == ""){
            return true;
         }

        for(int i =0; i<str.length() / 2;i++)
        { 
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);
            if(start != end)
            {
                return false;
            }

        }
        return true; 

    }
}
