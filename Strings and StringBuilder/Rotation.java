public class Rotation {
    

    public static void main(String[] args) {
        
        String str = "abcde";
        int k = 2;
        str = str.substring(str.length()-k) + str.substring(0, str.length()-k);
        System.out.println(str);
    }
}
