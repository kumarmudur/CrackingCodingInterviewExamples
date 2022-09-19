package bigO;

public class Example2 {

    // time: O(N^2)
    static void printPairs(int[] arr) {
        for (int i : arr) {
            for (int j : arr) {
                System.out.println(i + " " + j);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printPairs(arr);
    }
}
