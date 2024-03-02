package Day4.Assigment;

public class CountDigitsInANumbers {

    //main method
    public static void main(String[] args) {
        int number = 4568;
        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);
    }

    //countDigits method
    public static int countDigits(int n) {

        //base case
        if (n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
    }
}
