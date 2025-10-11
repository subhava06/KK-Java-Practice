

public class MoveHash {
    public static void main(String[] args) {
        
        String input = "Move#Hash#to#Front";
       System.out.println("input: "+input);
       System.out.println("Output: "+moveHashtoFront(input));
    }

    public static String moveHashtoFront(String input)
    {
          StringBuilder hash = new StringBuilder();
          StringBuilder otherChars = new StringBuilder();
          for(char ch : input.toCharArray()){
            if(ch == '#') hash.append(ch);
            else otherChars.append(ch);
          }

          return hash.append(otherChars).toString();
    }
}
