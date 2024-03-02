package Day4.Assigment;

public class SumInArray {

    //main method
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = sumArray(arr, arr.length);
        System.out.println("Sum of array elements: " + sum);
    }

    //sumArray
    public static int sumArray(int[] arr, int n) {

        if (n <= 0) {  //base case
            return 0;
        } else {
            return arr[n - 1] + sumArray(arr, n - 1);
        }
    }
}
