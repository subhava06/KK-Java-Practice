//range query means when you have to fetch elements in a given range
// Implemented using TreeSet

import java.util.TreeSet;

public class RangeQueries {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(20);
        set.add(10);
        set.add(23);
        System.out.println(set); // prints in sorted order
        
    }
}
