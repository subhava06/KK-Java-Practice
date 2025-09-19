public class Performance {
    
    public static void main(String[] args) {
        
        String series = "";
        for(int i =0; i<26; i++)
        {
            char ch = (char)('a' + i);
            System.out.print(ch +" ");
            series +=ch;
        }

        //above opern take O(n2) T.C. becoz it create a new object after every iteration since strings are immutable

        System.out.println();
         System.out.println("This takes O(N2) T.C.");
        System.out.println(series);

        // a new datatype that is mutable is StringBuilder
        //above op takes only O(n) with it.

        System.out.println("Now it takes O(N) T.C.");

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++)
        {
            char ch = (char)('a' + i);
            sb.append(ch);
        }
        System.out.println(sb);

    }
}
