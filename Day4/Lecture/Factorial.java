package Day4.Lecture;

public class Factorial {

    //main method
    public static void main(String[] args) {
        factorial(4);
        System.out.println(factorial(4));
        System.out.println("End of Main method");
    }

    //factorial
    public static int factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
