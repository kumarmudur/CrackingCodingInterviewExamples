package bigO;

public class Example1 {

    // time: O(N)
    static void printSumAndProduct(int[] arr) {
        int sum = 0;
        int product = 1;

        for (int i : arr) {
            sum += i;
        }
        for (int j : arr) {
            product *= j;
        }
        System.out.println("sum " + sum + " " + "product " + product);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printSumAndProduct(arr);
    }
}
