package Day4.Assigment;

public class ReverseDigitsInANumber {

    //main method
    public static void main(String[] args) {
        System.out.println("Digits in reverse order: ");
        printDigitsReverse(56789);
    }

    //displayDigitsReverse
    public static void printDigitsReverse(int n) {

        //base case
        if (n < 10) {
            System.out.println(n);
            return;
        }
        System.out.println(n % 10);
        printDigitsReverse(n / 10);
    }

}
