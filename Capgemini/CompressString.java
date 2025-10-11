public class CompressString {

    public static void main(String[] args) {
        
        String input = "aabbbbeeeeffggg";
        System.out.println("Before compression " + input);
        System.out.println("After Compression "+compress(input));
    }

    public static String compress(String input) {

        char[] comp = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for(int i =0; i<comp.length; i++)
        {
            int count = 1;
            while(i+1< comp.length && comp[i]==comp[i+1]) {
                count++; 
                i++;
            }
            result.append(comp[i]);
            result.append(count);
        }
        return result.toString();

    }
    
}
