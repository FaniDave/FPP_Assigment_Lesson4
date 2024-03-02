package Day4.Lecture;

public class LengthOfString {


    //main method
    public static void main(String[] args) {
        len("Orange");
        System.out.println("Main method end");
    }

    //len method
    public static int len(String str) {
        //Base case
        if (str == null || str.equals("")) return 0;

        int sum = 1 + len(str.substring(1));
        return sum;
    }
}
