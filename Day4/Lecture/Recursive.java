package Day4.Lecture;

public class Recursive {

    //main method
    public static void main(String[] args) {
        countDown(3);
        System.out.println("Main method end");
    }

    //countDown method
    public static void countDown(int num) {
        System.out.println("Beginning of Countdown (" + num + ")");
        if (num <= 0) {
            System.out.println("End");
        } else {
            System.out.println(num);
            countDown(num - 1);
        }
        System.out.println("Method end of countDown (" + num + ")");
    }
}
