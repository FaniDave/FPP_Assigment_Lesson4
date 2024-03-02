package Day4.Lecture;

public class ReverseString {

        //main method
        public static void main(String[] args) {
            printCharsReverse("Apple");
            System.out.println("End of Main method");
        }

        //printCharReverse method
        public static void printCharsReverse (String str) {
               //Base case
             if(str == null || str.equals("")) return;

             printCharsReverse(str.substring(1));
             System.out.println(str.charAt(0));
        }
}
