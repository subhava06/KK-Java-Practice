//range query means when you have to fetch elements in a given range
// Implemented using TreeSet

import java.util.TreeSet;
import java.util.Set;

public class RangeQueries {
    
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(20);
        set.add(10);
        set.add(23);
        System.out.println(set); // prints in sorted order

        TreeSet<Integer> set1 = new TreeSet<>(Set.of(12,10,33,13,55,23));
        System.out.println(set1);
        
        //above are two diff ways to initialize a set

        //range query ops
        System.out.println("Range query ops begin.");

        TreeSet<Integer> set2 = new TreeSet<>(Set.of(10, 12, 13, 14, 16, 19, 25, 28, 30,35, 40));

        //headSet: returns all elems strictly less than given elem
        System.out.println(set2.headSet(19));

        //tailSet: returns all elems greater than or equal to elem
        System.out.println(set2.tailSet(19));

        //subSet(fromElem, toElem) : returns all elems in a range, [inclusive, exlusive)
        System.out.println(set2.subSet(28,40));
        //for all inclusive, use
        System.out.println(set2.subSet(28, true, 40, true));


        //higher(E e): returns smallest elem strictly greater than e
        System.out.println(set2.higher(12));

        //lower(E e): returns greatest elem strictly less than e
        System.out.println(set2.lower(12));

        //ceiling(E e): returns smallest elem >= e
        System.out.println(set2.ceiling(20));

        //floor(E e) : returns greatest elem <=e
        System.out.println(set2.floor(35));



    }
}
