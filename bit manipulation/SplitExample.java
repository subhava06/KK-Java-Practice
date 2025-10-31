public class SplitExample {
   public static void main(String[] args) {
       String str = "Hello,World,How,Are,You?";
       String[] splitArray = str.split(",");
       for (String s : splitArray) {
           System.out.print(s);
       }
   }
}